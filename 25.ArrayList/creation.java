import java.util.*;
//import java.util.ArrayList;
public class creation{
    public static void main(String args[]){
        //Classname objectName = new Classname
        ArrayList<Integer>list=new ArrayList<>();
        //Add O(1)
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);


        //Get O(1)
        System.out.println(list.get(2));

        //Delete O(n)
        list.remove(2);
        System.out.println(list);
    
        //Set O(n)
        list.set(2,10);
        System.out.println(list);    

        //Contains
        System.out.println(list.contains(1));
        System.out.println(list.contains(11));

        //Size
        System.out.println(list.size());

        //Reverse
        for(int i=list.size()-1; i>=0; i--){
            System.out.print(list.get(i)+" ");
        }
   }
}