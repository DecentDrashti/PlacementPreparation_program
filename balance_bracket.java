import java.util.*;

public class Solution {

    /**
     * logic:
     * 1. If it's an opening bracket -> Push to Stack.
     * 2. If it's a closing bracket -> Check Map for its pair.
     * 3. Pop Stack and compare. If it doesn't match or stack is empty -> NO.
     */
    public static String isBalanced(String s) {
        // Map the Closing bracket to its corresponding Opening bracket
        Map<Character, Character> rules = new HashMap<>();
        rules.put(')', '(');
        rules.put('}', '{');
        rules.put(']', '[');

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // If the character is a KEY in our map, it is a CLOSING bracket
            if (rules.containsKey(c)) {
                // If stack is empty, there's no opener for this closer
                if (stack.isEmpty()) {
                    return "NO";
                }
                
                // Get the opener from the top of the stack
                char lastOpener = stack.pop();
                
                // Does it match the rule? (e.g., if 'c' is '}', rule says we need '{')
                if (lastOpener != rules.get(c)) {
                    return "NO";
                }
            } else {
                // It's an opening bracket, just push it
                stack.push(c);
            }
        }

        // If the stack is empty, all brackets were paired and closed
        return stack.isEmpty() ? "YES" : "NO";
    }

    public static void main(String[] args) {
        // Example test cases
        System.out.println(isBalanced("{[()]}")); // Expected: YES
        System.out.println(isBalanced("{[(])}")); // Expected: NO
    }
}
