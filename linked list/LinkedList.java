public class LinkedList{
    public static class Node{
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
    public void addFirst(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public void addLast(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
            tail.next=newNode;
            tail=newNode;
    }
    public int removefirst(){
        if(size==0){
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val=head.data;
            head=tail=null;
            size--;
            return val;
        }
        int val=head.data;
        head=head.next;
        size--;
        return val;
    }
    public int removelast(){
        if(size==0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        Node prev=head;
        for(int i=0;i<size-2;i++){
            prev=prev.next;
        }
        int val=prev.next.data;
        prev.next=null;
        tail=prev;
        size--;
        return val;
    }
    public void print(){
        if(head==null){
            System.out.println("Linked list is empty!");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
     public void addmiddle(int index,int data){
        if(index==0){
            addFirst(data);
            return;
        }
        Node newNode =new Node(data);
        size++;
        Node temp=head;
        int i=0;
        while(i<index-1){
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
     }
     public int itrSearch(int key){
        int i=0;
        Node temp=head;
        while(temp!=null){
            if(temp.data==key){
                return i;
            }
            temp=temp.next;
            i++;
        }
        return -1;
     }
     public int helper(Node head,int key){
        if(head==null){
            return -1;
        }
        if(head.data==key){
            return 0;
        }
        int idx=helper(head.next,key);
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
        Node curr=tail=head;
        Node next;
        while(curr!=null){
            next=curr.next;
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
        int itofind=sz-n;
        Node prev=head;
        while(i<itofind){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return;
     }
     public Node findMid(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
     }
     public boolean ispalindrome(){
        if(head==null || head.next==null){
            return true;
        }
        Node midnode=findMid(head);
        Node prev=null;
        Node curr=midnode;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node left=head;
        Node right=prev;
        while(right!=null){
            if(left.data!=right.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;

     }
     public Node mergesort(Node head){
            if(head==null || head.next==null){
                return head;
            }
            Node mid=getMid(head);
            Node righthead=mid.next;
            mid.next=null;
            Node newLeft=mergesort(head);
            Node newRight=mergesort(righthead);
            return merge(newLeft,newRight);
    }
    private Node getMid(Node head){
        Node slow=head;
        Node fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    private Node merge(Node head1,Node head2){
        Node mergedLL=new Node(-1);
        Node temp=mergedLL;
        while(head1!=null && head2!=null){
             if(head1.data<=head2.data){
                temp.next=head1;
                head1=head1.next;
                temp=temp.next;
             }else{
                temp.next=head2;
                head2=head2.next;
                temp=temp.next;
             }
        }
        while(head1!=null){
           temp.next=head1;
                head1=head1.next;
                temp=temp.next;
        }
        while(head2!=null){
            temp.next=head2;
                head2=head2.next;
                temp=temp.next;
        }
        return mergedLL.next;
    }
     public Node zigzag(Node head){
        Node mid=gettMid(head);
        Node righthead=mid.next;
        mid.next=null;
        Node newLeft=head;
        Node newRight=reversed(righthead);
        return merged(newLeft,newRight);
     }
      private Node gettMid(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
     private Node reversed(Node head){
        Node prev=null;
        Node curr=tail=head;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
        return head;
     }
     private Node merged(Node head1,Node head2){
         Node mergedLL=new Node(-1);
        Node temp=mergedLL;
        while(head1!=null && head2!=null){
            temp.next=head1;
            head1=head1.next;
            temp=temp.next;
            temp.next=head2;
            temp=temp.next;
            head2=head2.next;
        }
         while(head1!=null){
           temp.next=head1;
                head1=head1.next;
                temp=temp.next;
        }
        while(head2!=null){
            temp.next=head2;
                head2=head2.next;
                temp=temp.next;
        }
        return mergedLL.next;
     }
    public static void main(String args[]){
        LinkedList ll=new LinkedList();
        // ll.addFirst(2);
        // ll.addFirst(1);
        // ll.addLast(4);
        // ll.addLast(5);
        // ll.addmiddle(2,3);
        // ll.print();
        // System.out.println(ll.itrSearch(3));
        // System.out.println(ll.itrSearch(10));
        // System.out.println(ll.recSearch(3));
        // System.out.println(ll.recSearch(10));
        // ll.reverse();
        // ll.print();
        // ll.deleteNthFromEnd(3);
        // ll.print();
        // ll.addFirst(2);
        // ll.addFirst(1);
        // ll.addLast(2);
        // ll.addLast(3);
        // ll.print();
        // System.out.print(ll.ispalindrome());

        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        // ll.addFirst(5);
        ll.print();
        // ll.head=ll.mergesort(ll.head);
        ll.head=ll.zigzag(ll.head);
        ll.print();
    }
}