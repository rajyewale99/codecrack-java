import java.util.*;
public class shortest {
    public static float find(String path){
        int x=0 ;
        int y=0;
        for(int i=0;i<path.length();i++){
            char dir = path.charAt(i);
            //south
            if(dir=='S'){
                y--;
            }
            //North
            else if(dir=='N'){
                y++;
            }
            //East
            else if(dir=='E'){
                x++;
            }
            //West
            else if(dir=='W'){
                x--;
            }
        }  
        int X2= x*x;
        int Y2 = y*y;
        return (float)Math.sqrt(X2+Y2);
    }
    public static void main(String args[]){
        String path="NSESWNSENWN";
        System.out.print(find(path));
    }
}
