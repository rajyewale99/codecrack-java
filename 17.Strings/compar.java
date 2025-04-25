import java.util.*;
public class compar {
    public static void main(String args[]){
        String str1="Pruthvi";
        String str2 = "Pruthvi";
        String str3 = new String("Pruthvi");
        // if(str1==str2){
        //     System.out.print("Strings are equal");
        // }else{
        //     System.out.print("Strings are not equal");
        // }//ya madhe equal yeil

        // if(str1==str3){
        //     System.out.print("Strings are equal");
        // }else{
        //     System.out.print("Strings are not equal");
        // }//ya madhe equal yenar nahi karan str3 la declare kartana 
        //new keyword ne kela hota pn str1 la nahi

        //apn == operator vaprun string chi value equal ahe ki nahi check
        //nahi karu shakat
        //tyasathi dusri method ahe

        if(str1.equals(str3)){
            System.out.print("Strings are equal");
        }else{
            System.out.print("Strings are not equal");
        }
    }
}
