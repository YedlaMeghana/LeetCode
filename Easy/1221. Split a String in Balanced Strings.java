/* 1221. Split a String in Balanced Strings
Balanced strings are those that have an equal quantity of 'L' and 'R' characters.
Given a balanced string s, split it into some number of substrings such that:
Each substring is balanced.
Return the maximum number of balanced strings you can obtain.

Example :
Input: s = "RLRRLLRLRL"
Output: 4
Explanation: s can be split into "RL", "RRLL", "RL", "RL", each substring contains same number of 'L' and 'R'. */

class Solution {
    public int balancedStringSplit(String s) {
        int n = s.length();
        int count = 0, cnt = 0;
        for(int i=0;i<n;i++){
            if(s.charAt(i) == 'R') count++;
            if(s.charAt(i) == 'L') count--;
            if(count == 0){
                count = 0;
                cnt++;
            }
        }
        return cnt;
    }
}
