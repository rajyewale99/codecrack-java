import java.util.*;
public class question3 {
    public static void transpose(int arr[][], int row, int col){
        System.out.println("Original Array");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        int trans[][]= new int[col][row];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                trans[j][i]=arr[i][j];
            }
        }
        System.out.println("Transpose Array");
        for(int i=0;i<trans.length;i++){
            for(int j=0;j<trans[0].length;j++){
                
                System.out.print(trans[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main (String args[]){
        int row=2;
        int col=3;
        int arr[][]={{0,1,2},{3,4,5}};
        transpose(arr, row, col);
    }
}
