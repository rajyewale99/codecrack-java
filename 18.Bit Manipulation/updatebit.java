import java.util.*;
public class updatebit {
    public static int set_bit(int n, int i){
        int bitmask = 1<<i;
        return n | bitmask;
    }
    public static int clear_bit(int n, int i){
        int bitmask = ~(1<<i);
        return n & bitmask;
    }
    public static int update_ith_bit(int n, int i, int new_bit){
        if(new_bit == 0){
            return clear_bit(n,i);
        }else{
            return set_bit(n,i);
        }
    }
    public static int update_bit(int n, int i, int new_bit){
        n = clear_bit(n, i);
        int bitmask = (new_bit<<i);
        return n | bitmask;
    }
    public static void main(String args[]){
        int n=10;
        int i=2;
        int new_bit=1;
        // System.out.print(update_ith_bit(n, i, new_bit));

        // anothert method 

        System.out.print(update_bit(n,i,new_bit));
    }
}
