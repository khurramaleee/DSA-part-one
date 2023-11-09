
import java.util.Arrays;
public class pirorityqueue {
   private int[] items = new int[5];
   private int counter;
   public void add(int item){
       if(counter==items.length){
           throw new IllegalStateException("Queue is full");
       }
       int i ;
       for(i=counter-1;i>=0;i--){
        if(items[i]> item){
            items[i+1]=items[i];
        }
        else{
            break;
        }
       }
       items[i+1]=item;
       counter++;
   }
   public int remove(){
    if (isEmpty()) {
        throw new IllegalStateException("Queue is empty");
    }
    return items[--counter];
   }
   public boolean isEmpty(){
       
    return counter==0;
   }
   @Override
   public String toString() {
       // TODO Auto-generated method stub
       return Arrays.toString(items);
   }
}
