
//  Definition for singly-linked list.
  public class Delete_middle_in_linked_list {
      int val;
      Delete_middle_in_linked_list next;
      Delete_middle_in_linked_list() {}
      Delete_middle_in_linked_list(int val) { 
        this.val = val;
      }
      Delete_middle_in_linked_list(int val, Delete_middle_in_linked_list next) {
        this.val = val;
        this.next = next;
      }

      static int countNodes(Delete_middle_in_linked_list head) {
        int count = 0;
        Delete_middle_in_linked_list current = head;

        while (current != null) {
            count++;
            current = current.next;
        }

        return count;
    }
    public Delete_middle_in_linked_list deleteMiddle(Delete_middle_in_linked_list head) {
        Delete_middle_in_linked_list current=head;
        Delete_middle_in_linked_list prev=null;
        int n=countNodes(head);
        int x=-1;
        if(n==0||n==1){
            return null;
        }
        
        else if(n%2==0){
            x=(n/2)+1;
        }
        else{
            x=(n+1)/2;
        }
        int i=0;
        while(i<x-1){
            prev=current;
            current=current.next;
            i++;
        }
        prev.next=current.next;
        current.next=null;
        return head;
    }
    // Method to display a linked list
    static void displayLinkedList(Delete_middle_in_linked_list head) {
        Delete_middle_in_linked_list current = head;
    
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    
        System.out.println();
    }
    
    public static void main(String[] args) {
        Delete_middle_in_linked_list head = new Delete_middle_in_linked_list(1);
        head.next = new Delete_middle_in_linked_list(2);
        head.next.next = new Delete_middle_in_linked_list(3);
        head.next.next.next = new Delete_middle_in_linked_list(4);
        System.out.println("Original Linked List:");
        displayLinkedList(head);

        Delete_middle_in_linked_list obj=new Delete_middle_in_linked_list();
        head=obj.deleteMiddle(head);

        System.out.println("Linked List after deleting the middle Node:");
        displayLinkedList(head);
    }
}