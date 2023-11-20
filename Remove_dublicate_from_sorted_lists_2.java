public class Remove_dublicate_from_sorted_lists_2 {
     int val;
     Remove_dublicate_from_sorted_lists_2 next;
     Remove_dublicate_from_sorted_lists_2() {}
     Remove_dublicate_from_sorted_lists_2(int val) { this.val = val; }
     Remove_dublicate_from_sorted_lists_2(int val, Remove_dublicate_from_sorted_lists_2 next) { this.val = val; this.next = next; 
    }
 
    static int count(Remove_dublicate_from_sorted_lists_2 head,int d) {
        int c = 0;
        while (head != null) {
            if(head.val==d)
            c++;
            else if(head.val>d){
                break;
            }
            head = head.next;
        }

        return c;
    }
    public Remove_dublicate_from_sorted_lists_2 deleteDuplicates(Remove_dublicate_from_sorted_lists_2 head) {
        Remove_dublicate_from_sorted_lists_2 current=head;
        Remove_dublicate_from_sorted_lists_2 prev=null;
        while(current!=null){
            int x=count(current,current.val);
            if(x>1){
                if(prev==null){
                    while(x-->0){
                        head=head.next;
                        current=head;
                    }
                }
                else{
                    while(x-->0){
                        prev.next=current.next;
                        current=current.next;
                    }
                }
                continue;

            }
            prev=current;
            current=current.next;
           
        }
        return head;
    }
    // Method to display a linked list
    static void displayLinkedList(Remove_dublicate_from_sorted_lists_2 head) {
        Remove_dublicate_from_sorted_lists_2 current = head;
    
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    
        System.out.println();
    }
    
    public static void main(String[] args) {
        Remove_dublicate_from_sorted_lists_2 head = new Remove_dublicate_from_sorted_lists_2(1);
        head.next = new Remove_dublicate_from_sorted_lists_2(2);
        head.next.next = new Remove_dublicate_from_sorted_lists_2(2);
        head.next.next.next = new Remove_dublicate_from_sorted_lists_2(4);
        
        System.out.println("Original Linked List:");
        displayLinkedList(head);

       Remove_dublicate_from_sorted_lists_2 obj=new Remove_dublicate_from_sorted_lists_2();
        head=obj.deleteDuplicates(head);

        System.out.println("Linked List after deletion of dublicate elements: ");
        displayLinkedList(head);
    }
}
