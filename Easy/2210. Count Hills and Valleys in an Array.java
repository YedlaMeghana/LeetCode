/* 2210. Count Hills and Valleys in an Array
You are given a 0-indexed integer array nums. An index i is part of a hill in nums if the closest non-equal neighbors of i are smaller than nums[i]. 
Similarly, an index i is part of a valley in nums if the closest non-equal neighbors of i are larger than nums[i]. 
Adjacent indices i and j are part of the same hill or valley if nums[i] == nums[j].
Note that for an index to be part of a hill or valley, it must have a non-equal neighbor on both the left and right of the index.
Return the number of hills and valleys in nums.

Example :
Input: nums = [2,4,1,1,6,5]
Output: 3 */



class Solution {
    public int countHillValley(int[] nums) {
        int cnt = 0;
        for(int i = 1;i < nums.length-1;i++){
            if(nums[i] == nums[i-1])   continue;

            int left = i - 1;
            while(left >=0 && nums[left] == nums[i])    left--;
        
            int right = i + 1; 
            while(right < nums.length && nums[right] == nums[i])   right++;

            if(left >= 0 && right < nums.length){
                if(nums[left] < nums[i] && nums[i] > nums[right] || nums[left] > nums[i] && nums[i] < nums[right])  cnt++;
            }
        }
        return cnt;
    }
}
