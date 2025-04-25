import java.util.*;
public class clearrange {
    public static int clear_range(int n,int i, int j){
        int bitmask1=((-1)<<j+1);
        int bitmask2=((1<<i)-1);
        int bitmask = bitmask1 | bitmask2;
        return n & bitmask;
    }
    public static void main(String args[]){
        System.out.print(clear_range(10,2,4));
    }
}
