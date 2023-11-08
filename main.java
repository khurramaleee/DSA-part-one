import java.util.*;
public class main {
    public static void main(String[] args) {
        //  array numbers = new array(3);
        //  numbers.insert(0);
        //  numbers.insert(1);
        //  numbers.insert(2);
        //  numbers.insert(3);
        // //  numbers.removeat(3);
        // System.out.println(numbers.indexof(044 ));
        //  numbers.print();
        //  var  list = new LinkedList();
        //  list.addFirst(1);
        //   list.addLast(2);
        //    list.addLast(3);
        //    list.addLast(4);
        //    list.addLast(5);
        //    list.addLast(6);
        //    list.addLast(7);
        //    list.removelast();
        // System.out.println(list.indexof(30));
        //   System.out.println(list.size());
        // //    list.removelast();
        //    System.out.println(list.size());
        //  System.out.println(list.contains(1440));
        // list.reverse();
        //     var array = list.toArray();
            // System.out.println(Arrays.toString(array));
        
        //  System.out.println(list.getKthFromTheEnd(3));

        //  String str  = "khurram";
        //  stringreverserusingstack res = new stringreverserusingstack();
        //  var result  = res.reverse(str);
        // String str  = "}{(1+2)}";
        //  expression res = new expression();
        //  var result  = res.isBalanced(str);
        //  System.out.println(result);
         
        // reversingqueue rq = new reversingqueue();
        // Queue<Integer> queue = new ArrayDeque<>();
        // queue.add(1);
        //   queue.add(2);
        //     queue.add(3);
        //       queue.add(4);
        //       System.out.println(queue.toString());
        //       rq.reverse(queue);
        arrayQueue queue = new arrayQueue(5);
        queue.enqueue(1);
          queue.enqueue(2);
            queue.enqueue(3);
            queue.dequeue(); 
             queue.enqueue(4);
              queue.enqueue(5);
               queue.enqueue(6);
                // queue.enqueue(7);
            System.out.println(queue.toString());

    }
}
