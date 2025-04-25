import java.util.*;
public class fibonacci {
    public static int fib(int n){
        if(n==0 || n==1){
            return n;
        }
        int fbnm1=fib(n-1);
        int fbnm2 = fib(n-2);
        int fb=fbnm1+fbnm2;
       
        return fb;
    }
    public static void main(String args[]){
        int n= 9;
        System.out.println(fib(n));
    }
}
