import java.util.*;
public class iteration {
    public static void main(String args[]){
        HashMap <String , Integer> hm = new HashMap<>();
        hm.put("India",250);
        hm.put("China",300);
        hm.put("Nepal",100);
        hm.put("Bhutan",50);
        hm.put("US",50);

        //Iterate
        Set<String>keys = hm.keySet();
        System.out.println(keys);

        for(String k : keys){
            System.out.println("key = "+k+", Value = "+hm.get(k));
        }

        //entrySet
        System.out.println(hm.entrySet());
    }
}
