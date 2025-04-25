import java.util.*;
public class sortedrotataed {
    public static int search(int arr[], int target , int si, int ei){
        if(si>ei){
            return -1;
        }
        //mid
        int mid=(si+ei)/2;

        //case found
        if(arr[mid]==target){
            return mid;
        }
        //mid on L1
        if(arr[si]<=arr[mid]){
            //Left
            if(arr[si]<=target  && target<=arr[mid]){
               return search(arr,target,si,mid-1);
            }
            //Right
            else{
                return search(arr,target,mid+1,ei);
            }
        }
        //Mid on L2
        else{
            if(arr[mid]<=target && target<=arr[ei]){
                return search(arr,target,mid+1,ei);
            }
            else{
                return search(arr, target , si, mid-1);
            }
        }

    }
    public static void main(String args[]){
        int arr[]={3,4,5,6,0,1,2,3};
        int target=4;
        int targetIdx = search(arr,target,0,arr.length-1);
        System.out.println(targetIdx);
    }
}
