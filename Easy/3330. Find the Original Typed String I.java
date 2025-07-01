/* 3330. Find the Original Typed String I
Alice is attempting to type a specific string on her computer. 
However, she tends to be clumsy and may press a key for too long, resulting in a character being typed multiple times.
Although Alice tried to focus on her typing, she is aware that she may still have done this at most once.
You are given a string word, which represents the final output displayed on Alice's screen.
Return the total number of possible original strings that Alice might have intended to type.

Example :
Input: word = "abbcccc"
Output: 5
Explanation:  The possible strings are: "abbcccc", "abbccc", "abbcc", "abbc", and "abcccc". */


class Solution {
    public int possibleStringCount(String word) {
        if (word == null || word.length() == 0) return 0;

    int total = 1; // 1 possible original string: the word itself (no long press)
    int i = 0;
    int n = word.length();

    while (i < n) {
        int j = i;

        // Find the end of the current group of repeated characters
        while (j < n && word.charAt(j) == word.charAt(i)) {
            j++;
        }

        int groupLength = j - i;

        // If a character is repeated, Alice could have made a mistake
        if (groupLength >= 2) {
            total += (groupLength - 1); // Add all smaller valid possibilities
        }

        i = j; // Move to the next group
    }

    return total;
    }
}
