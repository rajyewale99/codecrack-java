import java.util.*;
public class firstocc {
    public static int check(int arr[],int key, int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return check(arr, key, i+1);
        
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,2,3,8};
        int key = 9;
        int i=0;
        System.out.print(check(arr,key,i));
    }
}
