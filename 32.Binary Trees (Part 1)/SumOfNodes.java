import java.lang.classfile.instruction.ThrowInstruction;
import java.util.*;
public class SumOfNodes {
    static class Node{
        int val;
        Node left, right;
        Node(int val){
            this.val=val;
            this.left = left;
            this.right = right;
        }
    }
    public static int sum(Node root){
        if(root == null) return 0;
       
        int leftsum = sum(root.left);
        int rightsum = sum(root.right);
        return leftsum + rightsum + root.val;
    }
   
    public static void main(String args[]){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println(sum(root));
    }
}
