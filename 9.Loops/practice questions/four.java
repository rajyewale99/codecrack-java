import java.util.*;
public class four {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        int sum=num;
        for(int i=1;i<=9;i++){
            sum+=num;
            System.out.println(sum);
        }
    }
}
