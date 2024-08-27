/*
    This program is my initial solution to a challenge from LeetCode (https://leetcode.com/problems/longest-common-prefix/).
    The problem statement is as follows: Write a function to find the longest common prefix string among an array of strings.
    If there is no common prefix, return an empty string.
*/

public class Longest_Common_Prefix {
    public String longestCommonPrefix(String[] strs) {
        String anchorWord = strs[0];
        String temp = "";

        for (int i = 1; i < strs.length; i++) {
            String currentWord = strs[i];
            if (anchorWord.length() > currentWord.length()) {
                for (int j = 0; j < currentWord.length(); j++) {
                    if (currentWord.charAt(j) == anchorWord.charAt(j)) {
                        temp += currentWord.charAt(j);
                    } else {
                        break;
                    }
                }
                anchorWord = temp;
                temp = "";
            } else {
                for (int j = 0; j < anchorWord.length(); j++) {
                    if (currentWord.charAt(j) == anchorWord.charAt(j)) {
                        temp += currentWord.charAt(j);
                    } else {
                        break;
                    }
                }
                anchorWord = temp;
                temp = "";
            }
        }
        return anchorWord;
    }
}
