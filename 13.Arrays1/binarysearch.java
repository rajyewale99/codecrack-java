import java.util.*;
public class binarysearch {
    public static int getelement(int arr[],int key){
        int start = 0 , end = arr.length-1;
        while(start<=end){
        int mid = (start+end)/2;
        if(arr[mid]==key){
            return mid;
        }
        if(arr[mid]<key){
            start=mid+1;
        }
        else{
            end=mid-1;
        }
    }
    return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,4,6,23,45,67};
        int key = 45;
        System.out.print("Index of the Key is : "+getelement(arr,key));
    }
}
