import java.util.*;

public class charfinder {
    
public char findfirstnonrepeatingchar(  String str){
    Map<Character,Integer> map=new HashMap<>();
    var chars = str.toCharArray();
    for( var ch:chars ){
        var count = map.containsKey(ch)?map.get(ch):0;
        map.put(ch,count+1);
    }
    for(var ch:chars){
        if(map.get(ch)==1){
            return ch;
        }
    }
    // System.out.println( map);
    return Character.MIN_VALUE;
}


}
