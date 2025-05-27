/* 287. Find the Duplicate Number
ray of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
There is only one repeated number in nums, return this repeated number.
You must solve the problem without modifying the array nums and using only constant extra space. */

class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        int[] freq = new int[n+1]; // elemnts in nums range from 1 to n;
        for(int i=0;i<n;i++){
            if(freq[nums[i]] == 0){ // when element found for 1st time
                freq[nums[i]] += 1; // increment by 1
            }
            else{ //when element found for 2nd time --> its freq value would be 1
                return nums[i];
            }
        }
        return 0;
    }
}

/* Input: nums = [1,3,4,2,2]
Output: 2*/
