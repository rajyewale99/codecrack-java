//it is also known as staircase search
//Time Complexity O(n+m)
import java.util.*;
public class searchinsorted {
    //start from right top
//     public static boolean staircase(int matrix[][] ,int key){
//         int row=0;
//         int col=matrix[0].length-1;
//         while(row<matrix.length && col>=0){
//             if(matrix[row][col]==key){
//                 System.out.print("Found at ( "+row+","+col+")");
//                 return true;
//             }else if(key<matrix[row][col]){
//                 col--;
//             }else{
//                 row++;
//             }
//         }
//         System.out.print("Key not found");
//         return false;
//     }

//start from bottom left
public static boolean staircase(int matrix[][],int key){
    int row=matrix.length-1;
    int col=0;
    while(row>0 && col<matrix.length){
        if(key==matrix[row][col]){
            System.out.print("found at ( "+row+","+col+")");
            return true;
        }else if(key<matrix[row][col]){
            row--;
        }else{
            col++;
        }
    }
    System.out.print("Not found");
    return false;
}
    public static void main(String args[]){
        int matrix[][]={{10,20,30,40},
    {15,25,35,45},
{27,29,37,48},
{32,33,39,50}};
int key=35;
staircase(matrix,key);
    }
}
