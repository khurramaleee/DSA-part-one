
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
      private int size;


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
    size++;
    /**
     * Adds a new node with the given data at the beginning of the linked list.
     *
     * @param  data  the data to be added to the new node
     */
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
         size++;
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
    else{
var second = first.next;

    // Remove the link from the first node to the second node
    first.next = null;

    // Set the first node to the second node
    first = second;
    }
    
    // Get the second node in the list
    
     size--;
}
    /**
     * Retrieves the size of the object.
     *
     * @return the size of the object
     */
    public int size(){
        return size; 
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
    else{
 var previous = getPrevious(last);
    last = previous;
    last.next = null;
    }
   
     size--;
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
public int[] toArray(){
    int[] array = new int[size];
    var current = first;
    var index = 0;
    while (current!=null) {
        array[index++] = current.value;
        current = current.next;
    }
    return array;
}

/**
 * Reverses the linked list.
 */
public void reverse() {
    if(isEmpty()) return;
    // Set the initial pointers
    var previous = first;
    var current = first.next;
    // Iterate through the list
    while (current != null) {
        var next = current.next;
        
        // Reverse the links
        current.next = previous;
        
        // Move the pointers
        previous = current;
        current = next;
    }
    last = first;
    last.next = null;
    // Update the first pointer
    first = previous;
}
/**
 * Returns the kth element from the end of the linked list.
 *
 * @param k The position of the element from the end of the list.
 * @return The value of the kth element from the end of the list.
 * @throws IllegalArgumentException if k is greater than the length of the list.
 */
public int getKthFromTheEnd(int k) {
    if (k > size) {
        throw new IllegalArgumentException("k is greater than the length of the list");
    }
    
    Node a = first; // Set pointer 'a' to the first node of the linked list.
    Node b = first; // Set pointer 'b' to the first node of the linked list.
    
    // Move 'b' pointer to the kth node from the first node.
    for (int i = 0; i < k - 1; i++) {
        b = b.next;
        System.out.println(b.value+"b value from for loop");
        if (b == null) {
            throw new IllegalArgumentException("k is greater than the length of the list");
        }
    }
    
    // Move both 'a' and 'b' pointers until 'b' reaches the last node.
    while (b != last) {
        a = a.next;
        b = b.next;
        System.out.println(a.value+"a value from while loop");
    }
    
    // Return the value of the kth element from the end of the list.
    return a.value;
}
}

