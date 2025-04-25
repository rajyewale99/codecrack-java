import java.util.*;
public class PostorderTraversal {
    static class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val=val;
            this.left=left;
            this.right= right;
        }
    }
        static class BinaryTree{
            static int idx = -1;
            public static Node buildTree(int nodes[]){
                idx++;
                if(nodes[idx] == -1){
                    return null;
                }
                Node newNode = new Node(nodes[idx]);
                newNode.left = buildTree(nodes);
                newNode.right = buildTree(nodes);
                return newNode;

        }
        public static void postorder(Node root){
            if(root == null) return;
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.val+" ");
        }
    }
    public static void main(String args[]){
        int nodes[]= {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);

       tree.postorder(root);
    }
}
