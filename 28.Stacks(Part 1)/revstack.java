import java.util.*;
public class revstack {
    public static void pushbtm(Stack<Integer>s, int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushbtm(s,data);
        s.push(top);
    }
    public static void revst(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        revst(s);
        pushbtm(s,top);
    }
public static   void printStack(Stack<Integer> s){
    while(!s.isEmpty()){
        System.out.println(s.pop());
    }
}

public static void main(String args[]){
        Stack<Integer>s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        
        revst(s);
        printStack(s);
    }
}
