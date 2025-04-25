import java.util.*;
public class stringbuilder {
    //time complexity O(26)
    //stringBuilder vaprun apn memory efficiency karu shakto
    //string immutable aste mhnun prateyk veli navin object banvun update hote
    //he talnyasathi StringBuilder use karto
    //ya ne time complexity kami lagte
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder("");
        for(char ch='a'; ch<='z'; ch++){
            sb.append(ch);
        }
        System.out.print(sb);
    }
}
