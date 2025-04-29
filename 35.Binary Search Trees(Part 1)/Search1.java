public class Search1 {
    static class Node{
        Node left;
        Node right;
        int val;
        Node(int val){
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }
    public static boolean searching(Node root, int data){
        if(root == null) return false;
        if(root.val == data) return true;
        if(root.val > data){
            return searching(root.left, data);
        }else{
            return searching(root.right, data);
        }
       
    }
    public static Node insert(Node root, int val){
        if(root == null){
            root = new Node(val);
            return root;
        }
        if(root.val>val){
            root.left = insert(root.left,val);
        }else{
            root.right = insert(root.right, val);
        }
        return root;
    }
    public static void inorder(Node root){
        if(root == null) return ;
        inorder(root.left);
        System.out.print(root.val+" ");
        inorder(root.right);
    }
    public static void main(String[] args) {
        int values[] = {5, 1, 3, 4, 2, 7};
        Node root = null;

        for(int i=0;i<values.length; i++){
            root = insert(root, values[i]);
        }
        inorder(root);
        System.out.println();
        if(searching(root, 8)){
            System.out.println("Element Found");
        }else{
            System.out.println("Element Not Found");
        }
    }
}
