import  java.util.*;
public class ispowertwo {
    public static boolean check(int n){
        return (n&(n-1))==0;
    }
    public static void main(String args[]){
        System.out.print(check(32));
    }
}
