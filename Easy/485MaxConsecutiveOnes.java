/* 485. Max Consecutive Ones
Given a binary array nums, return the maximum number of consecutive 1's in the array.
Example :
Input: nums = [1,1,0,1,1,1]
Output: 3 */

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int cnt = 0 , max = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 1){
                cnt++;
            }else{
                max = Math.max(max , cnt);
                cnt = 0;
            }
        }
        return Math.max(max, cnt);
    }
}
