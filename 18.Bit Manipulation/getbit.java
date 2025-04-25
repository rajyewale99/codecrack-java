import java.util.*;
public class getbit {
    // ya madhe i th bit find karaycha asto
    public static int get_ith_bit(int n , int i){
        //ith bit kadhnyasathi to number ani taycyha bitmask cha and karava lagto 
        //bitmask mhnje ith element 1 baki sarv 0
        //tr 1<<i ya ne apn bitmask kadhu shakto
        int bitmask=1<<i;
        if((n & bitmask) == 0){
            return 0;
        }else{
            return 1;
        }

    }
    public static void main(String args[]){
        int n=10;
        int i=2;
        System.out.print(get_ith_bit(n, i));
    }
}
