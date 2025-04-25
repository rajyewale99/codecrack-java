import java.util.*;
public class two {
    public static void main(String[] args) {
        int evensum=0;
        int oddsum=0;
        int choice;
        Scanner sc=new Scanner(System.in);
        do{
        System.out.println("Enter the number");
        int num=sc.nextInt();
        if(num%2==0){
            evensum+=num;
        }else{
            oddsum+=num;
        }
        System.out.println("do you want to continue if yes press 1 otherwise press 0");
        choice =sc.nextInt();
        } while (choice==1);
        System.out.println("sum of even numbers: "+evensum);
        System.out.println("sum of odd numbers: "+oddsum);
    }
}