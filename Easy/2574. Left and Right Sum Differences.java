/* 2574. Left and Right Sum Differences
You are given a 0-indexed integer array nums of size n.
Define two arrays leftSum and rightSum where:
leftSum[i] is the sum of elements to the left of the index i in the array nums. If there is no such element, leftSum[i] = 0.
rightSum[i] is the sum of elements to the right of the index i in the array nums. If there is no such element, rightSum[i] = 0.
Return an integer array answer of size n where answer[i] = |leftSum[i] - rightSum[i]|. */

  class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int total = 0;
        for(int i=0;i<n;i++) total += nums[i];
        int left = 0,right = 0;
        int ans[] = new int[n];
        for(int i = 0;i<n;i++){
            right = total-nums[i]-left;
            ans[i] = Math.abs(left - right);
            left += nums[i];
        }
        return ans;
    }
}
