import java.util.*;
public class clearlastibits {
    public static int clear_lat_i_bits(int n, int i){
        int bitmask = ((-1)<<i);
        return n & bitmask;
    }
    public static void main(String args[]){
        int n=14;
        int i=2;
        System.out.print(clear_lat_i_bits(n,i));
    }
}
