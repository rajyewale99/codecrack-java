import java.util.*;
class Test{
    static int a=10;
    int b;
    static void changeB(){
        b=a*3;
    }
}
public class try1 {
    public static void main(String args[]){
        Test t = new Test();
        t.changeB();
        System.out.println(Test.a+Test.b);
    }
    
}
