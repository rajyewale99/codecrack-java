import java.util.*;
public class question1 {
    public static int find(int arr[][], int k){
        int count =0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==k){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String args[]){
        int arr[][]={{4,7,8},{8,8,7}};
        int k=4;
        System.out.print(find(arr,k));
    }
}
