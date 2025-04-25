import java.util.*;
public class histogram {
    public static void maxArea(int arr[]){
        int maxArea=0;
        int nsr[]=new int[arr.length];
        int nsl[]=new int[arr.length];
        //Next Smaller Right
        Stack<Integer> st1 = new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            while(!st1.isEmpty() && arr[st1.peek()]>=arr[i]){
                st1.pop();
            }
            if(st1.isEmpty()){
                nsr[i]=arr.length;
            }else{
                nsr[i]=st1.peek();
            }
            st1.push(i);
        }

        //Next Smaller Left
        Stack<Integer> st2 = new Stack<>();
        for(int i=0;i<arr.length;i++){
            while(!st2.isEmpty() && arr[st2.peek()]>=arr[i]){
                st2.pop();
            }
            if(st2.isEmpty()){
                nsl[i]=-1;
            }else{
                nsl[i]=st2.peek();
            }
            st2.push(i);
        }
    // Current Area: width = j-i-1 = nsr[i]-nsl[i]-1
        for(int i=0; i<arr.length; i++){
            int height = arr[i];
            int width = nsr[i] - nsl[i] -1;
            int currArea = height*width;
            maxArea = Math.max(maxArea,currArea);
        }
        System.out.println("Maximum Area In Histogram = "+maxArea);
    }
    public static void main(String args[]){
        int arr[]={2,1,5,6,2,3};//heights in histogram
        maxArea(arr);
    }
}
