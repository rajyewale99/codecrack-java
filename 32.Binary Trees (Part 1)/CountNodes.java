import java.util.*;
public class CountNodes {
    static class Node{
        int val;
        Node left, right ;
        Node(int val){
            this.val=val;
            this.left=left;
            this.right=right;
        }
    }
    public static int count(Node root){
        if(root == null) return 0;

        int leftCount = count(root.left);
        int rightCount = count(root.right);
        return leftCount+rightCount+1;
    }
    public static void main(String args[]){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right= new Node(7);

        System.out.println(count(root));
    }
}
