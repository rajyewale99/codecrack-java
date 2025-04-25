import java.util.*;
public class question2 {
    public static int sum(int arr[][], int row){
        int sum=0;
        for(int i=0;i<arr[0].length;i++){
            sum+=arr[row-1][i];
        }
        return sum;
    }
    public static void main(String args[]){
        int arr[][]={{1,2,3},{2,4,5},{5,7,9}};
        int row=2;
        System.out.print(sum(arr,row));
    }
}
