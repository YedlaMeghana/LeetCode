/* 75. Sort Colors
Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.
We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
You must solve this problem without using the library's sort function. */

class Solution {
    public void sortColors(int[] nums) {
        int low=0,mid=0,high=nums.length-1;
        while(mid <= high){
            //case1
            if(nums[mid]==0){
                //swap nums[mid] and nums[low]
                int t = nums[mid];
                nums[mid] = nums[low];
                nums[low] = t;
                low++;mid++; 
            }
            //case2
            else if(nums[mid]==1)
                mid++;
            //case3
            else{
                int t = nums[mid];
                nums[mid]=nums[high];
                nums[high]=t;
                high--;
            }
        }
    }
}

/* Time Complexity:
The loop runs at most n times (mid progresses forward).
Although mid doesn’t increment when swapping with high, each element is moved at most once.
So the entire array is still processed in linear time: O(n).
*/
