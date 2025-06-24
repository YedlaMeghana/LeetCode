/* 2200. Find All K-Distant Indices in an Array
You are given a 0-indexed integer array nums and two integers key and k. 
A k-distant index is an index i of nums for which there exists at least one index j such that |i - j| <= k and nums[j] == key.
Return a list of all k-distant indices sorted in increasing order.
 
Example :
Input: nums = [2,2,2,2,2], key = 2, k = 2
Output: [0,1,2,3,4]
Explanation: For all indices i in nums, there exists some index j such that |i - j| <= k and nums[j] == key, so every index is a k-distant index. 
Hence, we return [0,1,2,3,4]. */ 

class Solution {
    public static List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer> result = new ArrayList<>();
        boolean[] keyIndices = new boolean[nums.length];
        for(int j=0;j<nums.length;j++){
            if(nums[j] == key){
                int start = Math.max(0 , j - k);
                int end = Math.min(nums.length-1, j+k);
                for(int i=start;i<=end;i++){
                    keyIndices[i] = true;
                }
            }
        }
        for(int i=0;i<nums.length;i++){
            if(keyIndices[i])
                result.add(i);
        }

        return result;
    }
