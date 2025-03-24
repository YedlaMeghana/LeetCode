import java.util.*;
class Main {
    public static int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        if(nums.length == 1){
            return nums[0];
        }
        for(int i = 0;i < nums.length; i++){
            
            if(currSum < 0){
                currSum = nums[i];
            } else{
                currSum += nums[i];
            }
            maxSum = Math.max(currSum, maxSum);j
        }
        return maxSum;
    }
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int nums[] = new int[n];
    for(int i = 0;i < n;i++){
      nums[i] = sc.nextInt();
    }
    System.out.println(maxSubArray(nums));
  }
}
