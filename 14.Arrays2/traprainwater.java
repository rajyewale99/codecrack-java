import java.util.*;
public class traprainwater {
    public static int trap(int arr[]){
        //calculate left max boundary - arr
        int n=arr.length;
        int leftmax []= new int [n];
        leftmax[0]= arr[0];
        for(int i=1;i<n;i++){
            leftmax[i]=Math.max(arr[i],leftmax[i-1]);
        }
        //claculate right max boundary - arr
        int rightmax[] = new int[n];
        rightmax[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--){
            rightmax[i]=Math.max(arr[i],rightmax[i+1]);
        }
        int trappedwater = 0;
        //loop
        for(int i=0;i<n;i++){
              //water level = min(leftmax,rightmax)
            int waterlevel=Math.min(rightmax[i],leftmax[i]);
                    //trapped water = water level - height[i]

            trappedwater+= waterlevel - arr[i];
        }
      
        return trappedwater;
    }
    public static void main(String args[]){
        int arr[]= {4,2,0,6,3,2,5};//heights
        System.out.print(trap(arr));
    } 
}
