import java.util.*;

public class Solution {
    public static boolean isPalindrome(String s) {
        // 1. Clean the string using a Regex (Regular Expression)
        // [^a-zA-Z0-0] means "anything NOT a-z, A-Z, or 0-9"
        String clean = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        
        // 2. Use two pointers to check
        int left = 0;
        int right = clean.length() - 1;
        
        while (left < right) {
            if (clean.charAt(left) != clean.charAt(right)) {
                return false; // Found a mismatch!
            }
            left++;
            right--;
        }
        
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama")); // true
        System.out.println(isPalindrome("race a car")); // false
    }
}
