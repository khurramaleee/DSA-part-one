public class array {
    private int[] items;
    private int count;
    public array(int length){
        items = new int[length];
    }
  

    public void print(){
        for(int i=0;i<count;i++){
            System.out.println(items[i]);
        }
    }
    public void add(int item){
        if(count<items.length){
            items[count]=item;
            count++;
        }
    }
}
