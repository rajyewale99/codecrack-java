import java.util.*;
public class subarray_kadan {
    public static void subarray_sum(int arr[]){
        int cs=0;
        int ms=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            cs= cs+arr[i];
            if(cs<0){
                cs=0;
            }
            ms = Math.max(cs,ms);
        }
        System.out.print("Maximum sum of subarray : "+ms);
    }
    public static void main(String args[]){
        int arr [] = {1,3,-6,4};
        subarray_sum(arr);
    }
}
