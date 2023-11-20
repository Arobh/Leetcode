//  Definition for singly-linked list.
  public class Odd_even_linked_list {
      int val;
      Odd_even_linked_list next;
      Odd_even_linked_list() {}
      Odd_even_linked_list(int val) { 
        this.val = val;
      }
      Odd_even_linked_list(int val, Odd_even_linked_list next) {
        this.val = val;
        this.next = next;
      }

      static int countNodes(Odd_even_linked_list head) {
        int count = 0;
        Odd_even_linked_list current = head;

        while (current != null) {
            count++;
            current = current.next;
        }

        return count;
    }
    public Odd_even_linked_list oddEvenList(Odd_even_linked_list head) {
        int n=countNodes(head);
        if(n==0||n==1){
            return head;
        }
        Odd_even_linked_list start= new Odd_even_linked_list();
        Odd_even_linked_list head2=start;
        while(n!=1){
           head2.next=new Odd_even_linked_list();
           head2=head2.next;
           n--;
        }
        Odd_even_linked_list current=head;
        head2=start;
        while(current!=null){
             head2.val=current.val;
            if(head2.next==null){
                break;
            }
            head2=head2.next;
            if(current.next==null||current.next.next==null){
                break;
            }
            current=current.next.next;
        }
        current=head;
        current=current.next;
        while(current!=null){
            head2.val=current.val;
            if(head2.next==null){
                break;
            }
            head2=head2.next;
            if(current.next==null||current.next.next==null){
                break;
            }
            current=current.next.next;
        }
        return start;
    }
    // Method to display a linked list
    static void displayLinkedList(Odd_even_linked_list head) {
        Odd_even_linked_list current = head;
    
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    
        System.out.println();
    }
    
    public static void main(String[] args) {
        Odd_even_linked_list head = new Odd_even_linked_list(1);
        head.next = new Odd_even_linked_list(2);
        head.next.next = new Odd_even_linked_list(3);
        head.next.next.next = new Odd_even_linked_list(4);
        System.out.println("Original Linked List:");
        displayLinkedList(head);

        Odd_even_linked_list obj=new Odd_even_linked_list();
        head=obj.oddEvenList(head);

        System.out.println("Linked List after operation:");
        displayLinkedList(head);
    }
}