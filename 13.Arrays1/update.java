import java.util.*;
public class update {
    public static void update(int marks[],int nonchangable){
         nonchangable = 10;
    for(int i=0;i<marks.length;i++){
        marks[i]=marks[i]+1;
    }
    }
    public static void main(String args[]){
        int marks []= {50,60,70};
        int nonchangable = 5;
        update(marks,nonchangable);
         System.out.println(nonchangable);

        for(int i=0;i<marks.length;i++){
            System.out.print(marks[i]+" ");
        
        }
       
    }
}
// Unchangable value defined keleli change nahi karta yet