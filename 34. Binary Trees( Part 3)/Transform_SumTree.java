public class Transform_SumTree {
    static class Node{
        int val;
        Node left,right;
        public Node(int val){
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public static int transform(Node root){ 
        if(root == null){
            return 0;
        }
        int leftChild = transform(root.left);
        int rightChild = transform(root.right);

        int val = root.val;

        int newLeft = root.left==null ? 0: root.left.val;
        int newRight = root.right==null ? 0: root.right.val;
        root.val = newLeft + leftChild + newRight + rightChild;
        return val;
    }
    public static void preorder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.val+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String args[]){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        transform(root);
        preorder(root);
    }
}
