public class Question3{
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
        if(root == null) return;
        inorder(root.left);
        System.out.print(root.val+" ");
        inorder(root.right);
    }
    public static void main(String args[]){
        Node root = new Node(10);
        root.left = new Node(3);
        root.right = new Node(10);
        root.left.left = new Node(3);
        root.left.right = new Node(1);
        root.right.left = new Node(3);
        root.right.right = new Node(3);
        root.right.right = new Node(3);

        delete(root, 3);
        inorder(root);
    }
}