
import java.util.Stack;
public class stringreverserusingstack {
    



/**
 * Reverses a given string.
 * 
 * @param input the string to be reversed
 * @return the reversed string
 */
public String reverse(String input) {
    // Create a stack to store the characters of the input string
    Stack<Character> stack = new Stack<>();
    for (char ch : input.toCharArray()) {
        stack.push(ch);
    }

    // Create a StringBuilder to store the reversed string
    StringBuilder sb = new StringBuilder();
    while (!stack.isEmpty()) {
        // Append the top character from the stack to the StringBuilder
        sb.append(stack.pop());
    }

    // Return the reversed string
    return sb.toString();
}
}
  