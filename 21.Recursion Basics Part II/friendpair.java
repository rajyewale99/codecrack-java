import java.util.*;
public class friendpair {
    public static int ways(int n){
        if(n==1 || n==2){
            return n;
        }
        //choice
        //single
        // int fnm1= ways(n-1);

        // //pair
        // int fnm2=ways(n-2);
        // int pairway=(n-1)*fnm2;

        // int totways=fnm1*pairway;
        return ways(n-1)+(n-1)*ways(n-2);
    }
    public static void main(String args[]){
        System.out.print(ways(3));
    }
}
