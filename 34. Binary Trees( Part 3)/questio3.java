public class questio3{
    static class Node{
        int val;
        Node left, right;
        Node(int val){
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }
    public static Node delete(Node root, int x){
        if(root == null) return null;
        
        root.left = delete(root.left,x);
        root.right = delete(root.right,x);
        if(root.val==x && root.left==null && root.right==null){
            return null;
        }
        return root;
    }
    static void inorder(Node root){
        
        inorder(root.left);
        System.out.print(root.val+" ");
        inorder(root.right);
    }
    public static void main(String args[]){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        delete(root, 3);
        inorder(root);
    }
}