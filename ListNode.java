public class ListNode {
     int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; 
    }
  

     static int countNodes(ListNode head) {
        int count = 0;
        while (head != null) {
            count++;
            head = head.next;
        }

        return count;
    }
    public ListNode removeNthFromEnd(ListNode head, int x) {
        int n=countNodes(head);
        n=n-x;
        ListNode current,prev=null;
        current=head;
        if(n<0){
            return prev;
        }
        else if(n==0){
            head=head.next;
            return head;
        }
        while(n>0){
            prev=current;
            current=current.next;
            n--;
        }
        prev.next=current.next;
        current.next=null;

        return head;
    }
     // Method to display a linked list
    static void displayLinkedList(ListNode head) {
        ListNode current = head;
    
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    
        System.out.println();
    }
    
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        int n= 2;
        System.out.println("Original Linked List:");
        displayLinkedList(head);

       ListNode obj=new ListNode();
        head=obj.removeNthFromEnd(head,n);

        System.out.println("Linked List after deletion of nth node from end: ");
        displayLinkedList(head);
    }
}