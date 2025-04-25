import java.util.*;
public class evenodd {
    public static void check(int n){
        int bitmask=1;
        if((n & bitmask)==1){
            System.out.print("Odd");
        }else{
            System.out.print("Even");
        }
    }
    public static void main(String args[]){
        check(5);
    }
}
