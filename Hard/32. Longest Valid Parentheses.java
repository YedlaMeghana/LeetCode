/* 32. Longest Valid Parentheses
Given a string containing just the characters '(' and ')', return the length of the longest valid (well-formed) parentheses substring.

Example :
Input: s = "(()"
Output: 2 */


class Solution {
    public int longestValidParentheses(String s) {
        Stack <Integer> st = new Stack<>();
        st.push(-1);
        int maxLen = 0;
        for(int i = 0;i < s.length();i++){
            char ch = s.charAt(i);
            if(ch == '('){
                st.push(i);
            }
            else{
                    st.pop();
                    if(st.isEmpty())   st.push(i);
                    else  maxLen = Math.max(maxLen , i - st.peek());
                }
        }
            return maxLen;
        
    }
}
