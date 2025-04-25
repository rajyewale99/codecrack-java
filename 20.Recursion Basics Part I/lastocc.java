import java.util.*;
public class lastocc {
    public static int check(int arr[], int key, int i){
        if(i<0){
            return -1;
        }
        if(key==arr[i]){
            return i;
        }
        return check(arr,key,i-1);
    }
    //another method
    // public static int check(int arr[], int key, int i){
    //     if(i==arr.length){
    //         return -1;
    //     }
    //     int isFound = check(arr,key,i+1);
    //     if(isFound==-1 && arr[i]==key){
    //         return i;
    //     }
    //     return isFound;
    // }
   public static void main(String args[]){
    int arr[]={1,2,3,5,6,2,3,9,2,4,0};
    int key=1;
    int i=0;
    System.out.print(check(arr,key,i));
   } 
}
