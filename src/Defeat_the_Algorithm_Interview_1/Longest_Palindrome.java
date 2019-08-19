package Defeat_the_Algorithm_Interview_1;
//https://www.lintcode.com/problem/longest-palindrome/description?_from=ladder&&fromId=1

public class Longest_Palindrome {
    public class Solution {
        /**
         * @param s: a string which consists of lowercase or uppercase letters
         * @return: the length of the longest palindromes that can be built
         */
        public int longestPalindrome(String s) {
            // write your code here
            if (s == null || s.length() ==0 ) {
                return 0;
            }

            boolean hasOod = false;
            int[] Map = new int[52];

            for (int i=0; i<s.length(); i++) {
                if (Character.isLowerCase(s.charAt(i))) {
                    Map[s.charAt(i) - 'a'] ++;
                } else {
                    Map[s.charAt(i) - 'A' + 26] ++;
                }
            }


            int result = 0;
            for (int i=0; i<52; i++) {
                if (Map[i] % 2 == 0) {
                    result += Map[i];
                } else {
                    hasOod = true;
                    result = result + Map[i] -1;
                }
            }

            if (hasOod) {
                result += 1;
            }

            return result;
        }
    }
}