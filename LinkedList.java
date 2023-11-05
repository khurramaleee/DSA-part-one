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


    public void addlast(int data){
        var node = new Node(data);
        if(isEmpty()){
            first = node;
            last = node; 
            // or we can this 
            // first = last = node;
        }
        else{
            last.next = node;
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
    private boolean isEmpty(){
        return first == null;

    }
}
