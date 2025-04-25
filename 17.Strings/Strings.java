import java.util.*;
public class Strings {
    public static void main(String args[]){
        //Character Array
        char arr[]={'a','b','c','d'};

        //String Declaration
        String str="abcd";
        String str2 = new String("xyz");

        //Strings are immutable
        Scanner sc = new Scanner(System.in);
        //sc.next kela tr ekach word input gheta
        // String name=sc.next();
        // System.out.print(name);

        //sc.nextLine kela tr full line input gheta
        // String fullname=sc.nextLine();
        // System.out.print(fullname);


        //length 
        // System.out.print(fullname.length());

        //Concatenation
        String str3= str+str2;
        System.out.print(str3);
    }
}
