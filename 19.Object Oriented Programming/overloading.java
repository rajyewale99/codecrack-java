public class overloading {
    public static void main(String args[]){
        Calculator c = new Calculator();
        System.out.println(c.sum(5,3));
        System.out.println(c.sum((float)5.2,(float)3.6));
        System.out.print(c.sum(5,3,5));
    }
}
class Calculator{
    int sum(int a, int b){
        return a+b;
    }
    float sum(float a, float b){
        return a+b;
    }
    int sum(int a, int b, int c){
        return a+b+c;
    }
}