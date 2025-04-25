import java.util.*;
public class clearbit {
    // ya madhe ith bit la clear mhnje 0 karaycha asta
    public static int clear_ith_bit(int n, int i){
        int bitmask= ~(1<<i);// ethe bit mask madhe ith element sodun baki sarv 1 karaycha asta
        //means yatlya bitmask madhe fakt ith element 0 pahije(clear karaycha asta)
        return n & bitmask;
    }
    public static void main(String args[]){
        int n=12;
        int i=2;
        System.out.print(clear_ith_bit(n, i));
    }
}
