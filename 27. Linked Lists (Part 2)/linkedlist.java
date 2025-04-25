// import java.util.*;
// public class linkedlist {
//     public static class Node{
//         int data;
//         Node next;

//         public Node(int data){
//             this.data=data;
//             this.next=null;
//         }

//     }
//     public static Node head;
//     public static Node tail;
//     public static int size;

//     public static boolean isCycle(){
//         Node slow=head;
//         Node fast=head;
//         while(slow!=null && fast!=null){
//             slow=slow.next;//+1
//             fast=fast.next.next;//+2
//             if(slow==fast){
//                 return true; //Cycle exists
//             }
//         }
//         return false; //Cycle doesn't 
//     }
//         public static void removeCycle(){
//             //detect the cycle
//             Node slow=head;
//             Node fast=head;
//             boolean cycle=false;
//             while(fast!=null && fast.next!=null){
//                 slow=slow.next;
//                 fast=fast.next.next;
//                 if(fast==slow){
//                     cycle=true;
//                     break;
//                 }
//             }
//             if(!cycle){
//                 return ;
//             }
//             //find the meeting point
//             slow=head;
//             Node prev=null;
//             while(slow!=fast){
//                 prev=fast;
//                 slow=slow.next;
//                 fast=fast.next;
//             }

//             //remove cycle
//             prev.next=null;
//     }


//     public static void main(String[] args) {
//         head = new Node(1);
//         head.next = new Node(2);
//         head.next.next = new Node(3);
//         head.next.next.next=head;
//         System.out.println(isCycle());

//         // head=new Node(1);
//         // Node temp = new Node(2);
//         // head.next = temp;
//         // head.next.next=new Node(3);
//         // head.next.next.next=temp;
//         // System.out.println(isCycle());
//         removeCycle();
//         // System.out.println(isCycle());
//     }
// }
import java.util.*;

public class linkedlist {
    
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    // Function to detect if the linked list has a cycle
    public static boolean isCycle() {
        Node slow = head;
        Node fast = head;
        while (slow != null && fast != null && fast.next != null) {
            slow = slow.next;          // Move slow pointer by 1
            fast = fast.next.next;     // Move fast pointer by 2
            if (slow == fast) {
                return true;  // Cycle exists
            }
        }
        return false;  // No cycle
    }

    // Function to remove the cycle if it exists
    public static void removeCycle() {
        // Detect the cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                cycle = true;
                break;  // Cycle detected
            }
        }

        if (!cycle) {
            return;  // No cycle to remove
        }

        // Find the meeting point
        slow = head;
        Node prev = null;
        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        // Remove the cycle by making the previous node's next pointer null
        prev.next = null;
    }

    public static void main(String[] args) {
        // Creating a linked list with a cycle
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = head;  // Creates a cycle (3 -> 1)

        System.out.println("Cycle present? " + isCycle());  // Expected: true

        // Removing the cycle
        removeCycle();

        System.out.println("Cycle present after removal? " + isCycle());  // Expected: false
    }
}
