import java.util.*;
public class search {
    public static boolean search(int matrix[][],int key){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
               if( matrix[i][j]==key){
                System.out.print("Element found at : "+i+","+j);
                return true;
            }
           
        }
        }
        System.out.print("Element Not Found");
        return false;
    }
    public static int largest(int matrix[][]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
               if( matrix[i][j]>largest){
                  largest=matrix[i][j];
            }
           
        }
        
    }
    return largest;
}
public static int smallest(int matrix[][]){
    int smallest=Integer.MAX_VALUE;
    for(int i=0;i<matrix.length;i++){
        for(int j=0;j<matrix[0].length;j++){
           if( matrix[i][j]<smallest){
              smallest=matrix[i][j];
        }
       
    }
    
}
return smallest;
}
    public static void main(String args[]){
        int matrix[][]=new int[3][3];
        int key = 5;
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        search(matrix,key);
        int lar=largest(matrix);
        System.out.print("Largest Element : "+lar);
        int smal=smallest(matrix);
        System.out.print("Smallest Element : "+smal);
    } 
}
   
