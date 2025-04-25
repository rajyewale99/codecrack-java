import java.util.*;
public class three {
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the cost of pencil");
        int a=sc.nextInt();
        System.out.println("Enter the cost of pen");
        int b=sc.nextInt();
        System.out.println("Enter the cost of eraser");
        int c=sc.nextInt();
        int tot=(a+b+c);
        float gst=(tot*18)/100;
        System.out.println("Total Bill(including gst) is "+(tot+gst));

    }
}
