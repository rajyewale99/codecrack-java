public class question1 {
    static class Node{
        int val;
        Node left,right;
        public Node(int val){
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public static boolean isUnivalued(Node root){
        
        if (root == null){
            return true;
        }
        if (root.left != null && root.val != root.left.val) return false; 
        if (root.right != null&& root.val != root.right.val)return false;
        return isUnivalued(root.left)&& isUnivalued(root.right);
    }
    public static void main(String args[]){
        Node root = new Node(1);
        root.left = new Node(1);
        root.right = new Node(1);
        root.left.left = new Node(1);
        root.left.right = new Node(1);
        root.right.left = new Node(1);
        root.right.right = new Node(1);

        if(isUnivalued(root)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
