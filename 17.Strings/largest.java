import java.util.*;
public class largest {
    //comapareTo() he function check karta don madhe konachi value mothi ahe
    //ex m ha b peksha motha ahe
    public static void main(String args[]){
        String Fruits[]={"apple","banana","mango"};
        String largest=Fruits[0];
        for(int i=0;i<Fruits.length;i++){
            if(largest.compareTo(Fruits[i])<0){
                largest=Fruits[i];
            }
        }
        System.out.print(largest);
    }
}
