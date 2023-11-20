
 public class Reverse_nodes_in_k_groups {
        int val;
        Reverse_nodes_in_k_groups next;
      Reverse_nodes_in_k_groups() {}
      Reverse_nodes_in_k_groups(int val) { this.val = val; }
      Reverse_nodes_in_k_groups(int val, Reverse_nodes_in_k_groups next) { this.val = val; this.next = next;
    }

    public Reverse_nodes_in_k_groups reverseBetween(Reverse_nodes_in_k_groups head, int l, int r) {
        int c=1;
        Reverse_nodes_in_k_groups l1=head;
        while(c<l){
            l1=l1.next;
            c++;
        }
        Reverse_nodes_in_k_groups l2=l1;
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
    static int countNodes(Reverse_nodes_in_k_groups head) {
        int count = 0;
        Reverse_nodes_in_k_groups current = head;

        while (current != null) {
            count++;
            current = current.next;
        }

        return count;
    }
    public Reverse_nodes_in_k_groups reverseKGroup(Reverse_nodes_in_k_groups head, int k) {
        int n=countNodes(head);
        Reverse_nodes_in_k_groups current=head;
        if(n<k){
            return head;
        }
        int i=1;
        int j=k;
        while(n>=k){
            head=reverseBetween(current,i,j);
            current=head;
            i=j+1;
            j=j+k;
            n=n-k;
        }

        return head;
        
    }
    // Method to display a linked list
    static void displayLinkedList(Reverse_nodes_in_k_groups head) {
        Reverse_nodes_in_k_groups current = head;
    
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    
        System.out.println();
    }
    
    public static void main(String[] args) {
        Reverse_nodes_in_k_groups head = new Reverse_nodes_in_k_groups(1);
        head.next = new Reverse_nodes_in_k_groups(2);
        head.next.next = new Reverse_nodes_in_k_groups(3);
        head.next.next.next = new Reverse_nodes_in_k_groups(4);
        int k= 2;
        System.out.println("Original Linked List:");
        displayLinkedList(head);

       Reverse_nodes_in_k_groups obj=new Reverse_nodes_in_k_groups();
        head=obj.reverseKGroup(head,k);

        System.out.println("Linked List after reversal:");
        displayLinkedList(head);
    }

}