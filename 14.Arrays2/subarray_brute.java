import java.util.*;
public class subarray_brute {
    public static void subarray_sum(int arr[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=i;j<arr.length;j++){
                int end=j;
                int sum=0;
                for(int k=start;k<=end;k++){
                        sum+=arr[k];
                }
                if(sum>largest){
                    largest=sum;
                }
                System.out.println(sum);
            }
        }
        System.out.println("Largest Sum is : "+largest);
    }
    public static void main(String args[]){
        int arr[]={1,2,6,-7,4};
        subarray_sum(arr);
    }
}
