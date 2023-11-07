
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class expression {

private final  List<Character> leftbrackets = Arrays.asList('(', '{', '[', '<');
private final  List<Character> rightbrackets = Arrays.asList(')', '}', ']', '>');

/**
 * Checks if the brackets in the given input string are balanced.
 *
 * @param input the input string to check
 * @return true if the brackets are balanced, false otherwise
 */
public boolean isBalanced(String input) {
    // Create a stack to store the left brackets
    Stack<Character> stack = new Stack<>();

    // Iterate over each character in the input string
    for (char ch : input.toCharArray()) {
        // If the character is a left bracket, push it onto the stack
        if (isLeftBracket(ch)) {
            stack.push(ch);
        }

        // If the character is a right bracket
        if (isRightBracket(ch)) {
            // Check if the stack is empty, indicating a mismatched bracket
            if (stack.empty()) {
                return false;
            }
            // Pop the top element from the stack
            var top = stack.pop();
            // Check if the popped element and the current character are a pair of matching brackets
            if (bracketMatched(top, ch)) {
                return false;
            }
        }
    }

    // If the stack is empty after iterating over all characters, it means all brackets are matched and balanced
    return stack.empty();
}

/**
 * Checks if a character is a left bracket.
 * @param ch The character to be checked.
 * @return True if the character is a left bracket, false otherwise.
 */
private boolean isLeftBracket(char ch) {
    return leftbrackets.contains(ch);
}

/**
 * Checks if a character is a right bracket.
 *
 * @param ch The character to check.
 * @return True if the character is a right bracket, false otherwise.
 */
private boolean isRightBracket(char ch) {
    return rightbrackets.contains(ch);
}

/**
 * Checks if the given left bracket matches the given right bracket.
 *
 * @param left The left bracket to check.
 * @param right The right bracket to check.
 * @return True if the left bracket matches the right bracket, false otherwise.
 */
private boolean bracketMatched(char left, char right) {
    return leftbrackets.indexOf(left) == rightbrackets.indexOf(right);
}

}
