//  Definition for singly-linked list.
  public class Reverse_linked_lists_2 {
      int val;
      Reverse_linked_lists_2 next;
      Reverse_linked_lists_2() {}
      Reverse_linked_lists_2(int val) { 
        this.val = val;
      }
      Reverse_linked_lists_2(int val, Reverse_linked_lists_2 next) {
        this.val = val;
        this.next = next;
      }

    public Reverse_linked_lists_2 reverseBetween(Reverse_linked_lists_2 head, int l, int r) {
        int c=1;
        Reverse_linked_lists_2 l1=head;
        while(c<l){
            l1=l1.next;
            c++;
        }
        Reverse_linked_lists_2 l2=l1;
        while(true){
            while(c<r){
                l2=l2.next;
                c++;
            }
            if(l1!=l2){
                int temp=l1.val;
                l1.val=l2.val;
                l2.val=temp;
            }
            else{
                break;
            }
            l1=l1.next;
            l++;
            r--;
            c=l;
            l2=l1;
        }
        return head;
    }
    // Method to display a linked list
    static void displayLinkedList(Reverse_linked_lists_2 head) {
        Reverse_linked_lists_2 current = head;
    
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    
        System.out.println();
    }
    public static void main(String[] args) {
        Reverse_linked_lists_2 head = new Reverse_linked_lists_2(1);
        head.next = new Reverse_linked_lists_2(2);
        head.next.next = new Reverse_linked_lists_2(3);
        head.next.next.next = new Reverse_linked_lists_2(4);
        int l=2;
        int r=3;
        System.out.println("Original Linked List:");
        displayLinkedList(head);

        Reverse_linked_lists_2 obj=new Reverse_linked_lists_2();
        head=obj.reverseBetween(head,l,r);

        System.out.println("Linked List after reversal:");
        displayLinkedList(head);
    }
}