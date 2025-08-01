/* 1561. Maximum Number of Coins You Can Get
There are 3n piles of coins of varying size, you and your friends will take piles of coins as follows:
In each step, you will choose any 3 piles of coins (not necessarily consecutive).
Of your choice, Alice will pick the pile with the maximum number of coins.
You will pick the next pile with the maximum number of coins.
Your friend Bob will pick the last pile.
Repeat until there are no more piles of coins.
Given an array of integers piles where piles[i] is the number of coins in the ith pile.
Return the maximum number of coins that you can have.

Example :
Input: piles = [2,4,1,2,7,8]
Output: 9 */ 

  class Solution {
    public int maxCoins(int[] piles) {
        int n = piles.length;
        Arrays.sort(piles);
        int len = n / 3;
        int res = 0;
        for(int i=n-2;i >= len;i=i-2)  res += piles[i];
        return res;
    }
}
