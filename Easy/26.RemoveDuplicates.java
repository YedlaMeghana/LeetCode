/* 26. Remove Duplicates from Sorted Array
Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. 
The relative order of the elements should be kept the same. Then return the number of unique elements in nums.
Consider the number of unique element.
Example :
Input: nums = [1,1,2]
Output: 2, nums = [1,2,_]
*/

class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int i = 0; // pointer for the place to write the next unique number
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++; // move i to next place
                nums[i] = nums[j]; // overwrite duplicate
            }
        }

        return i + 1; // number of unique elements
    }
}
