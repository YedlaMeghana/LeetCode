42. Trapping Rain Water
Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.
Time Complexity and Space Complexity is O(n).


import java.util.Scanner;
class Main {
    public static int trap(int[] height) {
        int waterLevel = 0;
        int totalWater = 0;
        int [] leftMax = new int[height.length];
        leftMax[0] = height[0];
        for(int i = 1;i < height.length;i++){
            leftMax[i] = Math.max(height[i] , leftMax[i-1]);
        }
        int [] rightMax = new int[height.length];
        rightMax[height.length-1] = height[height.length-1];
        for(int i = (height.length)-2;i >= 0;i--){
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }
        for(int i = 0;i < height.length;i++){
            waterLevel = Math.min(leftMax[i] ,rightMax[i] );
            totalWater += waterLevel - height[i];
        }

        return totalWater;
    }
  public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int height[] = new int[n];
      for(int i = 0;i < n;i++){
          height[i] = sc.nextInt();
      }
      System.out.println(trap(height));
  }
}
