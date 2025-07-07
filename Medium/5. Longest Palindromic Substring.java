/* 5. Longest Palindromic Substring
Given a string s, return the longest palindromic substring in s.
Example :
Input: s = "babad"
Output: "bab" */

class Solution {
    public String longestPalindrome(String s) {
        if (s.length() <= 1)
            return s;

        String Lpd = ""; // Longest palindromic substring

        for (int i = 0; i < s.length(); i++) {
            // Odd length palindrome (centered at i)
            int low = i, high = i;
            while (low >= 0 && high < s.length() && s.charAt(low) == s.charAt(high)) {
                if ((high - low + 1) > Lpd.length()) {
                    Lpd = s.substring(low, high + 1);
                }
                low--;
                high++;
            }

            // Even length palindrome (centered between i and i+1)
            low = i;
            high = i + 1;
            while (low >= 0 && high < s.length() && s.charAt(low) == s.charAt(high)) {
                if ((high - low + 1) > Lpd.length()) {
                    Lpd = s.substring(low, high + 1);
                }
                low--;
                high++;
            }
        }

        return Lpd;
    }
}
