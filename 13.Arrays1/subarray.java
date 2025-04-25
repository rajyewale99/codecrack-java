import java.util.*;
public class subarray{
    public static void subarrays(int arr[]){
        int ts=0;
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
                for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=i;j<arr.length;j++){
                 int sum=0;
                int end=j;
                for(int k=start;k<=end;k++){
                    System.out.print(arr[k]+" ");
                    sum=sum+arr[k];
                }
                if(sum>largest){
                    largest=sum;
                }
                if(sum<smallest){
                    smallest=sum;
                }
                System.out.print("Sum of subarrays : "+sum);
                ts++;
                System.out.println();
            }
            System.out.println();
        }
            System.out.println("Largest no is : "+largest);
            System.out.println("Smallest no is : "+smallest);
        
        System.out.println("Total no of pairs : "+ts);
    }
    public static void main(String args[]){
        int arr[]= {2,3,4,5};
        subarrays(arr);
        }
    }
