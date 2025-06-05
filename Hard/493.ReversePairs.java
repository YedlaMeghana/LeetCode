/* 493. Reverse Pairs
Given an integer array nums, return the number of reverse pairs in the array.
A reverse pair is a pair (i, j) where:
0 <= i < j < nums.length and
nums[i] > 2 * nums[j].
 
Example 1:
Input: nums = [1,3,2,3,1]
Output: 2
Explanation: The reverse pairs are:
(1, 4) --> nums[1] = 3, nums[4] = 1, 3 > 2 * 1
(3, 4) --> nums[3] = 3, nums[4] = 1, 3 > 2 * 1 */


class Solution {
    public static void  merge(int[] nums,int low,int mid,int high){
        int left = low;
        int right = mid+1;
        ArrayList<Integer> temp = new ArrayList<>();
        while(left<=mid&&right<=high){
            if(nums[left]<nums[right]){
                temp.add(nums[left]);
                left++;
            }else{
                temp.add(nums[right]);
                right++;
            }
        }
        while(left<=mid){
            temp.add(nums[left]);
            left++;
        }
        while(right<=high){
            temp.add(nums[right]);
            right++;
        }
        for(int i=low;i<=high;i++){
            nums[i]=temp.get(i-low);
        }
    }
    public static int countPairs(int[] nums,int low,int mid,int high){
        int right = mid+1;
        int cnt=0;
        for(int i=low;i<=mid;i++){
            while(right<=high && (long)nums[i] > 2l* (long) nums[right]){
                right++;
            }
            cnt+= right-(mid+1);
        }
        return cnt;
    }
    public static int mergeSort(int[]nums,int low,int high){
        int cnt=0;
        if(low>=high) return cnt;
        int mid=(low+high)/2;
        cnt+=mergeSort(nums,low,mid);
        cnt+=mergeSort(nums,mid+1,high);
        cnt+=countPairs(nums,low,mid,high);
        merge(nums,low,mid,high);

        return cnt;
    }
    public int reversePairs(int[] nums) {
        int n=nums.length;
        return mergeSort(nums,0,n-1);
    }
}
