import java.util.*;
public class pairsum2{
     public static boolean pairsum1(ArrayList<Integer> list, int target){
        int pivot=-1;
        int n=list.size();
        for(int i=0;i<n-1;i++){
           if(list.get(i)>list.get(i+1)){
            {
                pivot=i;
                break;
            }
        }
        }
        int left=pivot+1;
        int right=pivot;
         
        while(left!=right){
            if(list.get(left)+list.get(right)==target){
                return true;
            }
            else if((list.get(left)+list.get(right))<target){
                left=(left+1)%n;
            }
            else{
                right=(n+right-1)%n;
            }
        }
        return false;
    }
public static void main(String args[]){
   
    ArrayList<Integer> list = new ArrayList<>();
    list.add(11);
    list.add(15);
    list.add(6);
    list.add(8);
    list.add(9);
    list.add(10);
    int target=16;
   
    System.out.print(pairsum1(list,target));
}
}