public class Rotate_linked_list {
      int val;
      Rotate_linked_list next;
      Rotate_linked_list() {}
      Rotate_linked_list(int val) { this.val = val; }
      Rotate_linked_list(int val, Rotate_linked_list next) { this.val = val; this.next = next; }
 
     static int countNodes(Rotate_linked_list head) {
        int count = 0;
        while (head != null) {
            count++;
            head = head.next;
        }

        return count;
    }
    public Rotate_linked_list rotateRight(Rotate_linked_list head, int k) {
        if(head==null||head.next==null){
            return head;
        }
        int n=countNodes(head);
        k=k%n;
        Rotate_linked_list current=head;
        Rotate_linked_list prev=head;
        while(k-->0){
            while(current.next!=null){
                prev=current;
                current=current.next;
            }
            prev.next=null;
            current.next=head;
            head=current;
        }
        
        return head;
    }
    // Method to display a linked list
    static void displayLinkedList(Rotate_linked_list head) {
        Rotate_linked_list current = head;
    
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    
        System.out.println();
    }
    
    public static void main(String[] args) {
        Rotate_linked_list  head = new Rotate_linked_list (1);
        head.next = new Rotate_linked_list (2);
        head.next.next = new Rotate_linked_list (3);
        head.next.next.next = new Rotate_linked_list (4);
        System.out.println("Original Linked List:");
        displayLinkedList(head);
        int k=2;
        Rotate_linked_list  obj=new Rotate_linked_list ();
        head=obj.rotateRight(head,k);

        System.out.println("Linked List after "+k+" Rotation :");
        displayLinkedList(head);
    }
}