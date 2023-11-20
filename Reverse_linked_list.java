
//  Definition for singly-linked list.
  public class Reverse_linked_list {
      int val;
      Reverse_linked_list next;
      Reverse_linked_list() {}
      Reverse_linked_list(int val) { 
        this.val = val;
      }
      Reverse_linked_list(int val, Reverse_linked_list next) {
        this.val = val;
        this.next = next;
      }

      static int countNodes(Reverse_linked_list head) {
        int count = 0;
        Reverse_linked_list current = head;

        while (current != null) {
            count++;
            current = current.next;
        }

        return count;
    }
    public Reverse_linked_list reverseList(Reverse_linked_list head) {
        int n=countNodes(head);
        int arr[]=new int[n];
        Reverse_linked_list current=head;
        int i=0,x=n;
        while(x>0){
            arr[i]=current.val;
            if(x!=1)
            current=current.next;
            i++;
            x--;
        }
        current=head;
        i=n-1;
        x=n;
        while(x>0){
            current.val=arr[i];
            if(x!=1)
            current=current.next;
            i--;
            x--;
        }
        return head;
    }
    // Method to display a linked list
    static void displayLinkedList(Reverse_linked_list head) {
        Reverse_linked_list current = head;
    
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    
        System.out.println();
    }
    
    public static void main(String[] args) {
        Reverse_linked_list head = new Reverse_linked_list(1);
        head.next = new Reverse_linked_list(2);
        head.next.next = new Reverse_linked_list(3);
        head.next.next.next = new Reverse_linked_list(4);
        System.out.println("Original Linked List:");
        displayLinkedList(head);

        Reverse_linked_list obj=new Reverse_linked_list();
        head=obj.reverseList(head);

        System.out.println("Linked List after reversal:");
        displayLinkedList(head);
    }
}