/* 229. Majority Element II
Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times. */

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        int cnt1 = 0 , cnt2 = 0;
        int el1 =Integer.MIN_VALUE;
        int el2 = Integer.MIN_VALUE;
        //count the occurrences
        for(int i=0;i<n;i++){
            if(cnt1 == 0 && nums[i] != el2){
                el1 = nums[i];
                cnt1++;
            }else if(cnt2 == 0 && nums[i] != el1){
                el2 = nums[i];
                cnt2++;
            }
            else if(nums[i] == el1) cnt1++;
            else if(nums[i] == el2) cnt2++;
            else{
                cnt1--;cnt2--;
            }
        }
        List<Integer> ls = new ArrayList<>();
         cnt1=0;cnt2=0;
        for(int i=0;i<n;i++){
            if(nums[i]==el1) cnt1++;
            if(nums[i]==el2) cnt2++;
        }
        int min = (int)(n/3);
        if(cnt1 > min) ls.add(el1);
        if(cnt2 > min) ls.add(el2);

        return ls;
    }
}

/* Input
nums =
[3,2,3]
Output
[3]  */
