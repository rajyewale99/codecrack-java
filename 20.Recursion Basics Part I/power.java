import java.util.*; 
public class power {
    public static int find(int x, int p){
        if(p==0){
            return 1;
        }
        // int xnm1=find(x,p-1);
        // int xm= x*xnm1;
        // return xm;
        return x*find(x,p-1);
    }
    public static void main(String args[]){
        int x=2;
        int p=5;
        System.out.print(find(x,p));
    }
}
