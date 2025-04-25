import java.util.*;
//import java.util.Arrays   
//he pn vapru shakto
//import java.util.Collections;
public class inbuilt {
    public static void printarr(Integer arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
    public static void main(String args[]){
        Integer arr[]= {2,5,3,7,9,2,1};
        // Arrays.sort(arr);
        // Arrays.sort(arr,Collections.reverseOrder());
        Arrays.sort(arr,0,5,Collections.reverseOrder());
        
        printarr(arr);

    }
}
