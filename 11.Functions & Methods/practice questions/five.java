import java.util.*;
public class five {
    public static void sum(int n){
        int su=0;
        while(n>0){
        int a=n%10;
         su=su+a;
        n=n/10;
        }
        System.out.println(su);
    }
    public static void main(String[] args) {
        sum(1234);
    }
}
