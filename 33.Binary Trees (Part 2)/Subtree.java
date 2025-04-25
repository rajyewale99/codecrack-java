public class Subtree {
    static class Node{
        int val;
        Node left, right;
        Node(int val){
            this.val =val;
            this.left = left;
            this.right = right;
        }
    }
    public static boolean isIdentical(Node node, Node subroot){
        if(node == null && subroot == null){
            return true;
        }else if(node == null || subroot == null || node.val != subroot.val){
            return false;
        }

        if(!isIdentical(node.left, subroot.left)) return false;
        if(!isIdentical(node.right, subroot.right)) return false;

        return true;
    }
    public static boolean isSubtree(Node root, Node subroot){
        if(root.val == subroot.val){
            if(root == null){
                return false;
            }
            if(isIdentical(root, subroot)){
                return true;
            }
        }

        return isSubtree(root.left, subroot) || isSubtree(root.right, subroot);
    }
    public static void main(String args[]){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);


        Node subroot = new Node(2);
        subroot.left = new Node(4);
        subroot.right = new Node(5);

        System.out.println(isSubtree(root, subroot));
    }
}
