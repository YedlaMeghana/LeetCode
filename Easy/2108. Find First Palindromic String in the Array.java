/* 2108. Find First Palindromic String in the Array
Given an array of strings words, return the first palindromic string in the array. If there is no such string, return an empty string "".
A string is palindromic if it reads the same forward and backward.

Example :

Input: words = ["abc","car","ada","racecar","cool"]
Output: "ada" */

  class Solution {
    public String firstPalindrome(String[] words) {
        for(int i=0;i<words.length;i++){
            if(isPalindrome(words[i]))  return words[i];
        }
        return "";
    }

    public boolean isPalindrome(String s){
        int st = 0;
        int end = s.length()-1;
        while(st <= end){
            if(s.charAt(st) == s.charAt(end)){
                st++;
                end--;
            }else{
                return false;
            }
        }
        return true;
    }
}
