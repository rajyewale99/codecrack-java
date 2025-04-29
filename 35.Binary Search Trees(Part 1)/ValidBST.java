
public class ValidBST {
    static class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val = val;
            this.left = null;
            this.right=null;
        }
    }
    public static Node insert(Node root, int val){
        if(root==null){
            root = new Node(val);
            return root;
        }
        if(root.val>val){
            root.left = insert(root.left, val);
        }
        else {
            root.right = insert(root.right, val);
        }
        return root;
    }
    public static void inorder(Node root){
        if(root == null) return;
        inorder(root.left);
        System.out.print(root.val+" ");
        inorder(root.right);
    }
    public static boolean isValid(Node root, Node min, Node max){
        if(root == null) return true;
        if(min != null && root.val<=min.val) return false;
        else if(max != null && root.val>=max.val) return false;
        return isValid(root.left, min, root)&& isValid(root.right, root, max);
        }
    public static void main(String[] args) {
         int values[] = {8,5,3,1,4,6,10,11,14};
        Node root = null;

        for(int i=0; i<values.length; i++){
            root = insert(root, values[i]);
        }

        inorder(root);
        System.out.println();

        if(isValid(root, null, null)){
            System.out.println("Valid");
        }else{
            System.out.println("Invalid");
        }
    }
}
