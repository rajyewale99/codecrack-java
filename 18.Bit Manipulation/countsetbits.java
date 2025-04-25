import java.util.*;
public class countsetbits {
    public static void main(String args[]){
        int n=10;
        int count=0;
        while(n>0){
            if((n&1) != 0){
                count++;
            }
            n=n>>1;
        }
        System.out.print("Count of 1's is "+count);
    }
}
