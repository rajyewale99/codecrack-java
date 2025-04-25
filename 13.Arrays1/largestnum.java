import java.util.*;
public class largestnum {
    public static int getlargest(int arr[]){
        int largest = Integer.MIN_VALUE; // yachi value -Infinity aste
        for(int i=0;i<arr.length;i++){
            if(largest<arr[i]){
                largest=arr[i];
            }
        }
        return largest;
    }
    public static void main(String args[]) {
        int arr [] = {1,2,3,7,9,34,67}; 
        System.out.print("Largest Number is : "+getlargest(arr));
    }
}
