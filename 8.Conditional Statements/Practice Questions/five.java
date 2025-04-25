import java.lang.foreign.MemorySegment.Scope;
import java.util.*;
public class five {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if((a%4==0) ||((a%100==0) && (a%400==0))){
            System.out.println("Leap Year");
        }else{
            System.out.println("Not a Leap Year");
        }
    }
}
