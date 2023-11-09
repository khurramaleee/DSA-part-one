import java.util.*;

public class main {
    public static void main(String[] args) {
        // array numbers = new array(3);
        // numbers.insert(0);
        // numbers.insert(1);
        // numbers.insert(2);
        // numbers.insert(3);
        // // numbers.removeat(3);
        // System.out.println(numbers.indexof(044 ));
        // numbers.print();
        // var list = new LinkedList();
        // list.addFirst(1);
        // list.addLast(2);
        // list.addLast(3);
        // list.addLast(4);
        // list.addLast(5);
        // list.addLast(6);
        // list.addLast(7);
        // list.removelast();
        // System.out.println(list.indexof(30));
        // System.out.println(list.size());
        // // list.removelast();
        // System.out.println(list.size());
        // System.out.println(list.contains(1440));
        // list.reverse();
        // var array = list.toArray();
        // System.out.println(Arrays.toString(array));

        // System.out.println(list.getKthFromTheEnd(3));

        // String str = "khurram";
        // stringreverserusingstack res = new stringreverserusingstack();
        // var result = res.reverse(str);
        // String str = "}{(1+2)}";
        // expression res = new expression();
        // var result = res.isBalanced(str);
        // System.out.println(result);

        // reversingqueue rq = new reversingqueue();
        // Queue<Integer> queue = new ArrayDeque<>();
        // queue.add(1);
        // queue.add(2);
        // queue.add(3);
        // queue.add(4);
        // System.out.println(queue.toString());
        // rq.reverse(queue);
        // arrayQueue queue = new arrayQueue(5);
        // queue.enqueue(1);
        // queue.enqueue(2);
        // queue.enqueue(3);
        // queue.dequeue();
        // queue.enqueue(4);
        // queue.enqueue(5);
        // queue.enqueue(6);
        // // queue.enqueue(7);
        // System.out.println(queue.toString());

        // queuewithtwostack queue = new queuewithtwostack();
        // queue.enqueue(1);
        // queue.enqueue(2);
        // queue.enqueue(3);
        // queue.dequeue();
        // queue.dequeue();
        // System.out.println(queue.toString());
        // pirorityqueue pq = new pirorityqueue();
        // pq.add(2);
        // pq.add(3);
        // // pq.add(80);
        // pq.add(8);
        // pq.add(1);
        // // pq.add(4);
        // System.out.println(pq.toString());
        // charfinder cf = new charfinder();
        // // var r = cf.findfirstnonrepeatingchar(" i a green apple");
        // // System.out.println(r);
        // // var ch = cf.findfirstrepeatingchar("green apple");
        // System.out.println(hash("123456=A"));

        hashtable ht = new hashtable();
        ht.put(6, "a");
        ht.put(8, "b");
        ht.put(11, "c");
         ht.put(11, "ww");
        // ht.put(4, "d");
        // ht.put(5, "e");

      System.out.println("Done");
      System.out.println(ht.get(11));
    }

    // public static int hash(String key){
    //     int hash =0;
    //     for(var ch:key.toCharArray()){
    //         hash+=ch;
    //     }
    //     return hash%100;
    // }
}
