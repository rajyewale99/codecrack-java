public class MinimumDist {
    static class Node{
        int val;
        Node left,right;
        public Node(int val){
            this.val=val;
            this.left=left;
            this.right = right;
        }
    }
    public static Node lca2(Node root, int n1, int n2){
        if(root == null || root.val==n1 || root.val==n2){
            return root;
        }
        Node leftlca = lca2(root.left, n1, n2);
        Node rightlca = lca2(root.right, n1, n2);

        if(leftlca==null) return rightlca;
        if(rightlca == null) return leftlca;
        return root;
    }
    public static int lcaDist(Node root, int n){
        if(root==null){
            return -1;
        }
        if(root.val == n){
            return 0;
        }
        int leftdist = lcaDist(root.left, n);
        int rightdist = lcaDist(root.right, n);

        if(leftdist == -1 && rightdist==-1) return -1;
        else if (leftdist == -1) return rightdist+1;
        else return leftdist+1;
        
    }
    public static int minDist(Node root, int n1, int n2){
        Node lca = lca2(root,n1,n2);
        int dist1 = lcaDist(lca, n1);
        int dist2 = lcaDist(lca, n2);
        return dist1+dist2;
    }
    public static void main(String args[]){
         Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        int n1=4, n2=6;
        System.out.println(minDist(root, n1, n2));
    }
}
