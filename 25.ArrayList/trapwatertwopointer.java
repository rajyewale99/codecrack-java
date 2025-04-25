import java.util.*;
//Time Complexity O(n)
public class trapwatertwopointer{
public static int storewater(ArrayList<Integer>height){
        //Time Complexity O(n^2)
        int maxWater=0;
        int left=0;
        int right=height.size()-1;
        while(left<right){
                int ht=Math.min(height.get(left),height.get(right));
                int width=right-left;
                int currwater=ht*width;
                maxWater=Math.max(maxWater,currwater);
                if(height.get(left)<height.get(right)){
                    left++;
                }else{
                    right--;
                }
                
        }
        return maxWater;
    }
    public static void main(String args[]){
        ArrayList<Integer>height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        
    System.out.print(storewater(height));
    }
}