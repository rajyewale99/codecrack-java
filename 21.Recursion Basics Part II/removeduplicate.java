import java.util.*;
public class removeduplicate {
    public static void remove(String str, int idx, StringBuilder newStr, boolean map[]){
        if(idx==str.length()){
            System.out.print(newStr);
            return;
        }
        char currchar = str.charAt(idx);
        if(map[currchar-'a']==true){
            //dulicate
            remove(str, idx+1, newStr, map);
        }else{
            map[currchar-'a']=true;
            remove(str, idx+1, newStr.append(currchar), map);
        }
    }
    public static void main(String args[]){
        String str ="apnacollege";
        remove(str, 0, new StringBuilder(""), new boolean[26]);
    }
}
