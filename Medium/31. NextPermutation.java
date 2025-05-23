/* 31. Next Permutation
A permutation of an array of integers is an arrangement of its members into a sequence or linear order.
For example, for arr = [1,2,3], the following are all the permutations of arr: [1,2,3], [1,3,2], [2, 1, 3], [2, 3, 1], [3,1,2], [3,2,1].The next permutation of arr = [1,2,3] is [1,3,2].
Similarly, the next permutation of arr = [2,3,1] is [3,1,2].
While the next permutation of arr = [3,2,1] is [1,2,3] because [3,2,1] does not have a lexicographical larger rearrangement.
Given an array of integers nums, find the next permutation of nums.
The replacement must be in place and use only constant extra memory. */

class Solution {
    public  void print(int[] nums){
        System.out.print("[");
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]);
            if(i<nums.length-1){
                System.out.print(",");
            }
        }
        System.out.print("]");
    }
    public void reverseSubArray(int[] arr,int start,int end){
        while(start < end){
            int t = arr[start];
            arr[start] = arr[end];
            arr[end] = t;
            start++;
            end--;
        }
    } 
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int idx = -1;
        for(int i=n-2;i>=0;i--){
            if(nums[i] < nums[i+1]){
                idx = i;
                break;
            }
        }
        if(idx == -1){
            reverseSubArray(nums,0,n-1);
            print(nums);
            return;
        }
        for(int i=n-1;i>idx;i--){
            if(nums[i] > nums[idx]){
                int t = nums[i];
                nums[i] = nums[idx];
                nums[idx] = t;
                break;
            }
        }
        reverseSubArray(nums,idx+1,n-1);
        print(nums);
       
    }
}
