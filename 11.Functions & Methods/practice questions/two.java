import java.util.*;
public class two {
    public static void iseven(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int i=sc.nextInt();
        if(i%2==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
    public static void main(String[] args){
        iseven();
    }
}
