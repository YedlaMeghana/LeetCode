 /* 128. Longest Consecutive Sequence
Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.
You must write an algorithm that runs in O(n) time.

Example:
Input: nums = [100,4,200,1,3,2]
Output: 4
Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4. */

class Solution {
    public int longestConsecutive(int[] nums) {
        int cnt = 0, longest = 1;
        int n = nums.length;
        if(n == 0) return 0;
        Set<Integer> set = new HashSet<>();
       // put all the array elements into set
        for(int i=0;i<n;i++){
            set.add(nums[i]);
        }
      // Find the longest sequence
        for(int it : set){
          // if 'it' is a starting number
            if(!set.contains(it-1)){
              // find consecutive numbers
                int x = it;
                cnt = 1;
                while(set.contains(x+1)){
                    x=x+1;
                    cnt+=1;
                }
                longest = Math.max(longest,cnt);
            }
        }
        return longest;
    }
}
