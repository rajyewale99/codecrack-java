import java.util.*;
public class ipop {
    public static void main(String[] args) {
    int arr[] = new int[100];

    Scanner sc = new Scanner(System.in);
    arr[0]=sc.nextInt();
    arr[1]=sc.nextInt();
    arr[2]=sc.nextInt();

    System.out.println("Physics : "+arr[0]);
    System.out.println("Chemistry : "+arr[1]);
    System.out.println("Mathematics: "+arr[2]);

    System.out.println("Length of the array is : " + arr.length);
    }
}
