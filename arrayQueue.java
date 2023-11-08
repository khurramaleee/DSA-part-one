
import java.util.* ;
public class arrayQueue {
    private int[] items ;
    private int rear; // counter
    private int counter;
    private int front;
    public arrayQueue(int capacity){
        items = new int[capacity];
    }


    public void enqueue(int item){
        if (counter==items.length) {
            throw new IllegalStateException("Queue is full");
        } 
            items[rear] = item;
            rear = (rear+1) % items.length;
            counter++;
    }
    public int dequeue(){
         var item = items[front];
         items[front] = 0;
         front = (front+1) % items.length;
         counter--;
         return item;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return Arrays.toString(items);
    }
    
}
