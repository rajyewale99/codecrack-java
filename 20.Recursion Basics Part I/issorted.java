import java.util.*;
public class issorted {
    public static boolean check(int arr[], int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return check(arr,i+1);
    }
    public static void main(String args[]){
        int arr[]={2,4,3,9};
        int i=0;
        System.out.print(check(arr,i));
    }
}
