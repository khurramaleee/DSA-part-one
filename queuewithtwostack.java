import java.util.*;

public class queuewithtwostack {
    private Stack<Integer> stack1 = new Stack<>();
    private Stack<Integer> stack2 = new Stack<>();
/**
 * Add an item to the queue.
 *
 * @param item the item to enqueue
 */
public void enqueue(int item) {
    stack1.push(item);
}
    public int dequeue(){
        if(stack2.isEmpty()){
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }
/**
 * Returns a string representation of the elements in the stack.
 */
@Override
public String toString() {
    // Convert the stack to an array
    Object[] stackArray = stack2.toArray();

    // Convert the array to a string representation
    String stackString = Arrays.toString(stackArray);

    // Return the string representation
    return stackString;
}
}
