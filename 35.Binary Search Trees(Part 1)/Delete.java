
public class Delete {
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
    public static Node delete(Node root, int key){
        if(root.val < key){
            root.right = delete(root.right, key);
        }else if(root.val > key){
            root.left = delete(root.left, key);
        }else{
            //case 1 - leaf node
            if(root.left == null && root.right == null){
                return null;
            }

            //case 2 - single child
            if(root.left == null){
                return root.right;
            }else if(root.right == null){
                return root.left;
            }

            //case 3 - both children
            Node IS = findInorderSuccessor(root.right);
            root.val = IS.val;
            root.right = delete(root.right, IS.val);
        }
        return root;
    }
    public static Node findInorderSuccessor(Node root){
        while(root.left != null){
            root = root.left;
        }
        return root;
    }
    public static void main(String[] args) {
         int values[] = {8,5,3,1,4,6,10,11,14};
        Node root = null;

        for(int i=0;i<values.length; i++){
            root = insert(root, values[i]);
        }
        inorder(root);
        System.out.println();
        
        root = delete(root, 1);
        System.out.println();

        inorder(root);
    }
}
