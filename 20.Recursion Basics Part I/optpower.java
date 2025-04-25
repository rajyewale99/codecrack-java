import java.util.*;
public class optpower {
    public static int find(int x, int p){
        if(p==0){
            return 1;
        }
        // int halfpowersq = find(x,p/2)*find(x,p/2);
        int halfpower = find(x, p/2);
        int halfpowersq = halfpower*halfpower;
        //if n is odd
        if(p%2!=0){
            halfpowersq = x*halfpowersq;
        }
        return halfpowersq;
    }
    public static void main(String args[]){
        int x=2;
        int p=5;
        System.out.print(find(x,p));
    }
}
