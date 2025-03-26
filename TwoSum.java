// 1. Two Sum
// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
// You may assume that each input would have exactly one solution, and you may not use the same element twice.You can return the answer in any order.
import java.util.*;
public class Main
{
    public static int[] twoSum(int[] nums, int target) {
        int a [] = new int [2];
        for(int i = 0;i<nums.length; i++){
            for(int j = i+1;j<nums.length;j++){
                if(nums[i] + nums[j] == target){
                a[0] = i;
                a[1] = j;
                break;
               }
            }
        }
        return a;
    }
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size: ");
		int n = sc.nextInt();
		int[] nums = new int[n];
		System.out.println("Enter the values: ");
		for(int i = 0;i < nums.length;i++){
		    nums[i] = sc.nextInt();
		}
		System.out.println("Enter the target value:");
		int target = sc.nextInt();
		int [] ans = twoSum(nums,target);
		System.out.print("[");
		for(int i = 0;i < ans.length;i++){
		    System.out.print( ans[i]+ " ");
		}
		System.out.print("]");
	}
}
