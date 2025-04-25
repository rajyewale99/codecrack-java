import java.util.*;
public class three {
    public static void ispalindrome(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int i=sc.nextInt();
        int rev=0;
        int num=i;
        while(i!=0){
            int a=i%10;
            rev=rev*10+a;
            i=i/10;
        }
        if(num==rev){
            System.out.println("palindrome");
        }else{
            System.out.println("Not palindrome");
        }
    }
    public static void main(String[] args){
            ispalindrome();
    }
}
