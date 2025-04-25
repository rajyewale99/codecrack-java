import java.util.*;
public class tillingprob{
    public static int tilling(int n){ // 2 x n (floor size)

        if(n==0 || n==1){
            return 1;
        }
        // // vertical choice
        // int fnm1 = tilling(n-1);

        // //horizontal choice
        // int fnm2 = tilling(n-2);

        // int totways = fnm1 + fnm2;
        return tilling(n-1)+tilling(n-2);
    }
    public static void main(String args[]){
        System.out.print(tilling(4));
    }
}