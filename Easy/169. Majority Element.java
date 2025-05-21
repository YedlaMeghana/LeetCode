169. Majority Element

Given an array nums of size n, return the majority element.
The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.


import java.util.*;
public class Main
{
    public static int majority(int nums[]){
        int n = nums.length;
        Arrays.sort(nums);
        int val = n/2;
        return nums[val];
    }   
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of array:");
		int n = sc.nextInt();
		int[] nums = new int[n];
		for(int i = 0;i < n;i++){
		    nums[i] = sc.nextInt();
		}
		int result = majority(nums);
	    System.out.println("Majority element is:"+result);
	}
	
}

/* OUTPUT:
Enter length of array:
3
1
2
1
Majority element is:1 */
