import java.util.*;
public class question2 {
        public static void rotate(int[] nums,int n, int k) {
            k=k%n;
            reverse(nums,0,k-1);
            reverse(nums,k,n-1);
            reverse(nums,0,n-1);
        }
        public static void reverse(int[] nums, int start, int end){
            while(start<end){
                int temp=nums[start];
                nums[start]=nums[end];
                nums[end]=temp;
                start++;
                end--;
        }
        }
        public static void main(String args[]){
            int nums[]= {1,2,3,4,5,6,7};
            int n=nums.length;
            int k =3;
            rotate(nums,n,k);
            for(int i=0;i<n;i++){
                System.out.print(nums[i]+" ");
            }
            System.out.println();
        }
    }

