import java.util.*;
public class sort{
    public static void main(String args[]){
        ArrayList<Integer>list = new ArrayList<>();
         list.add(4);
        list.add(10);
        list.add(3);
        list.add(8);
        list.add(13);

    System.out.println(list);
        //Ascending
        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
    }
}