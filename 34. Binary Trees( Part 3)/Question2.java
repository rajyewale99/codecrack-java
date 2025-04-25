public class Question2{
    static class Node{
        int val;
        Node left,right;
        Node(int val){
            this.val=val;
            this.left=left;
            this.right=right;
        }
    }
    public static Node invert(Node root){
        if(root == null) return root;

        Node left = invert(root.right);
        Node right = invert(root.left);

        root.left = left;
        root.right = right;
        return root;

    }
    
    public static void main(String args[]){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.print(invert(root).val);
    }
}