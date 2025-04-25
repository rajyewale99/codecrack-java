import java.util.LinkedList;

public class create {
    public static class Node {
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public static void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head = newNode;
    }
    public static void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }

    public static void print(){   
    Node temp=head;
    if(head==null){
        System.out.print("String is Empty");
        return;
    }
    
    while(temp!=null){
        System.out.print(temp.data+"->");
        temp=temp.next;
    }
    System.out.println("null");

    }
    public int removeFirst(){
        if(size==0){
            System.out.println("Linked List is Empty");
            return Integer.MIN_VALUE;
        }else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        int val =head.data;
        head=head.next;
        size--;
        return val;
    }
    public int removeLast(){
        if(size==0){
            System.out.println("LInked List is Empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val = tail.data;
            head=tail=null;
            size=0;
            return val;
        }
        Node prev = head;
        for(int i=0 ; i<size-2; i++){
            prev=prev.next;
        }
        int val = prev.next.data;
        prev.next=null;
        tail=prev;
        size--;
        return val;
    }
    public void add(int idx, int data){
        if(idx==0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i=0;
        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        //i=idx-1;   temp->prev
        newNode.next=temp.next;
        temp.next=newNode;
    }
    public int itrSearch(int key){
        Node temp = head;
        int i=0;
        while(temp!=null){
            if(temp.data==key){
                return i;
            }
            temp=temp.next;
            i++;
        }
        return -1;
    }
    public int helper(Node head, int key){
        if(head==null){
            return -1;
        }
        if(head.data==key){
            return 0;
        }
        int idx = helper(head.next, key);
            if(idx==-1){
                return -1;
            }
        return idx+1;
    }
    public int recSearch(int key){
        return helper(head, key);
    }
    public void reverse(){
        Node prev=null;
        Node curr = tail =head;
        Node next;
        while(curr!=null){
            next = curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }
    public void deleteNthFromEnd(int n){
        int sz=0;
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
            sz++;
        }

    if(n==sz){
        head=head.next;
        return;
    }
    int i=1;
    int iToFind = sz-n;
    Node prev = head;
    while(i<iToFind){
        prev = prev.next;
        i++;
    }
    prev.next=prev.next.next;
    return;

}
public Node findMid(Node head){
    Node slow = head;
    Node fast = head;

    while(fast!=null && fast.next!=null){
        slow = slow.next;
        fast = fast.next.next;
    }
    return slow;
}
public boolean checkPalindrome(){
    if(head==null || head.next==null){
        return true;
    }
    //Step 1 - find mid
    Node midNode = findMid(head);

    //Step2 - reverse 2nd half
    Node prev=null;
    Node curr = midNode;
    Node next;
    while(curr!=null){
        next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
    }
    Node right = prev;//right half head
    Node left=head;

    //Step3 - check left half & right half
    while(right!=null){
        if(left.data!=right.data){
            return false;
        }
        left=left.next;
        right=right.next;
    }
    return true;
}
    public static void main(String args[]){
        create ll = new create();
        ll.addFirst(2);
        ll.addFirst(1
        
        
        
        
        
        
        
        );
        ll.addLast(2);
        ll.addLast(1);
        // ll.add(2,9);
        // ll.print();
        // System.out.println(ll.size);
        // ll.removeFirst();
        // ll.removeLast();
        // ll.print();
        // System.out.println(ll.itrSearch(9));  
        // System.out.println(ll.recSearch(2));  
        // ll.reverse();
        // ll.deleteNthFromEnd(3);
        ll.print();
        System.out.println(ll.checkPalindrome());

    }
}
