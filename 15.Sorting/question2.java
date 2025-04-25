import java.util.*;
public class question2 {
    public static void selection(int arr[]){
        for(int i=0;i<arr.length;i++){
            int min_pos=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[min_pos] <arr[j]){
                    min_pos=j;
                }
            }
            int temp = arr[min_pos];
            arr[min_pos] = arr[i];
            arr[i]=temp;
        }
    }
    public static void printarr(int arr[]){
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
    }
    public static void main(String args[]){
        int arr[]={3,6,2,1,8,7,4,5,3,1};
        selection(arr);
        printarr(arr);
    }
}
