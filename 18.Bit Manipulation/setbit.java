import java.util.*;
public class setbit {
    //ya amdhe ith bit la 1 set karaycha asto
    public static int set_ith_bit(int n, int i){
        int bitmask=1<<i;
        return n | bitmask;
    }
    public static void main(String args[]){
        int n=9;
        int i=2;
        System.out.print(set_ith_bit(n, i));
    }
}
