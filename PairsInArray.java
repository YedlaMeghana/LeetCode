// Program to print all the pairs in the array
import java.util.*;
public class PairsInArray
{
    public static void pairs(int nums[]){
        for(int i = 0;i < nums.length;i++){
            int curr = nums[i];
            for(int j = i+1;j < nums.length;j++){
                System.out.print("(" + curr +"," +nums[j] + ")");
            }
            System.out.println();
        }
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int n = sc.nextInt();
		int[] nums = new int[n];
		System.out.println("Enter array elements: ");
		for(int i = 0;i < n;i++){
		    nums[i] = sc.nextInt();
		}
		pairs(nums);
	}
}
