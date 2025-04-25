import java.util.*;
public class Classroom {
    public static void main(String args[]){
        HashMap<String,Integer>hm = new HashMap<>();

        //Insert O(1)
        hm.put("India",100);
        hm.put("bhutan",50);
        hm.put("Nepal",250);

        System.out.println(hm);

        //Get O(1)
        int population=hm.get("India");
        System.out.println(population);

        //Contains-Key O(1)
        System.out.println(hm.containsKey("India"));
        System.out.println(hm.containsKey("Indonesia"));

        //Remove O(1)
        System.out.println(hm.remove("Nepal"));
        System.out.println(hm);

        //Size
        System.out.println(hm.size());

        //isEmpty
        System.out.println(hm.isEmpty());

        //Clear
        hm.clear();
        System.out.println(hm);
    }
}
