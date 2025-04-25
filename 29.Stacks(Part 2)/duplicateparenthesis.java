import java.util.*;
public class duplicateparenthesis{
    public static boolean isDupli(String str){
        Stack<Character> s = new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch==')'){
                int count =0;
                while(s.peek()!='('){
                    count++;
                    s.pop();
                    
                }
                if(count<1){
                    return true;
                }else{
                    s.pop();
                }
            }
            else{
                s.push(ch);
            }
            
        }
        return false;
    }
    public static void main(String args[]){
        String str1 = "((a+b))";
        String str2 = "(a-b)";
        System.out.println(isDupli(str1));
    }
}