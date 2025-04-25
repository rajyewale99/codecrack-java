import java.util.*;
public class question1 {
    public static boolean check(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    return true;
                  
                }
            }
        }
        return false;
    }
    public static void main(String args[]){
        int arr[]={1,4,6,8,4,2};
        System.out.print(check(arr));
    }
}
