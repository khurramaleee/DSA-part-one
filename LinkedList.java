
import java.util.NoSuchElementException;
public class LinkedList {

    private class Node {
        private int value;
        private Node next;
        public Node (int value){
            this.value = value;
        }
       
    }

    private Node first; //first
    private Node last; //last


/**
 * Adds a new node with the given data to the end of the linked list.
 *
 * @param data the data to be added
 */
public void addLast(int data) {
    // Create a new node
    Node node = new Node(data);
    
    // Check if the linked list is empty
    if (isEmpty()) {
        // If it is empty, set both 'first' and 'last' to the new node
        first = node;
        last = node;
    } else {
        // If it is not empty, set the 'next' of the current 'last' node to the new node
        last.next = node;
        // Update the 'last' to be the new node
        last = node;
    }
}
    public void addFirst(int data){
        var node = new Node(data);
        if(isEmpty()){
            first = node;
            last = node;
        }
        else{
             node.next = first;  // setting the next of node to first
             first = node; // setting the first to node
        }
    }
/**
 * Returns the index of the first occurrence of the specified item in the list.
 * If the item is not found, returns -1.
 *
 * @param item The item to search for.
 * @return The index of the item, or -1 if not found.
 */
public int indexof(int item){
    int index = 0; // initialize index counter
    var current = first; // start at the first node

    // iterate through the list until the end is reached
    while(current != null){
        if(current.value == item) return index; // return index if item is found
        current = current.next; // move to the next node
        index++; // increment index counter
    }

    return -1; // item not found, return -1
}
/**
 * Checks if the linked list is empty.
 * @return true if the linked list is empty, false otherwise.
 */
private boolean isEmpty() {
    return first == null;
}


 
public boolean  contains(int item){
    return indexof(item) != -1; // return true if item is found, false otherwise
}

/**
 * Removes the first node in the linked list.
 */
public void removeFirst() {
    // Check if the list is empty
    if (isEmpty()) {
        throw new NoSuchElementException("List is empty");
    }
    
    // Check if there is only one node in the list
    if (first == last) {
        // Remove the only node in the list
        first = last = null;
        return;
    }
    
    // Get the second node in the list
    var second = first.next;

    // Remove the link from the first node to the second node
    first.next = null;

    // Set the first node to the second node
    first = second;
}

/**
 * Remove the last element from the list.
 *
 * @param  paramName  None
 * @return            None
 */
public void removelast(){
    if (isEmpty()) {
        throw new NoSuchElementException("List is empty");
    }
    
    // Check if there is only one node in the list
    if (first == last) {
        // Remove the only node in the list
        first = last = null;
        return;
    }
    var previous = getPrevious(last);
    last = previous;
    last.next = null;
}
/**
 * Returns the previous node of the given node in the linked list.
 *
 * @param  node  the node whose previous node needs to be found
 * @return       the previous node of the given node, or null if the given node is the first node
 */
private Node getPrevious(Node node){
    
    var current = first;
    while (current != null){ 
        if (current.next == node) return current;
        current = current.next;  
        }
        return null;
    }
}

