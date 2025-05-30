/* 169. Majority Element
Given an array nums of size n, return the majority element.
The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array. */


class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int cnt = 0 , ele = 0;
      // count the occurences
        for(int i=0;i<n;i++){
            if(cnt == 0){
                ele = nums[i];
                cnt = 1;
            }else if(ele == nums[i]){
                cnt++;
            }
            else{
                cnt--;
            }
        }
        
        //checking if the stored element
        // is the majority element:
         cnt = 0;
        for(int i=0;i<n;i++){
            if(nums[i] == ele){
                cnt++;
            }
        }
      
        if(cnt1 > (n/2)) 
        return ele;

        return -1;
    }
}
/*
Input
nums =
[3,2,3]
Output
3 
*/
