import java.util.*;
public class sum {
    public static int sumn(int n){
        if(n==1){
            return 1;
        }
        int nm1=sumn(n-1);
        int s=n+sumn(n-1);
        return s;
    }
    public static void main(String args[]){
        int n=5;
        System.out.print(sumn(n));
    }
}
