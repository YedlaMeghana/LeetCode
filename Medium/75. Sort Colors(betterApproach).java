/* 75. Sort Colors
Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.
We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
You must solve this problem without using the library's sort function. */

class Solution {
    public void sortColors(int[] nums) {
        int cnt0=0,cnt1=0,cnt2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) cnt0++;
            else if(nums[i]==1) cnt1++;
            else cnt2++;
        }
        for(int i=0;i<cnt0;i++) nums[i] = 0;
        for(int i=cnt0;i<cnt0+cnt1;i++) nums[i]=1;
        for(int i=cnt0+cnt1;i<nums.length;i++) nums[i]=2;
        System.out.print("[");
        for(int i=0;i<nums.length;i++)
            System.out.print(nums[i]+" ");
        System.out.print("]");
    }
}


/* 
The algorithm processes the array three times linearly. --> 3 passes
So, the overall time complexity is O(n).
Space complexity: O(1) – only a few variables are used for counting.
*/
