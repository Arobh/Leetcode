class ListNode_3 {
     int val;
     ListNode_3 next;
     ListNode_3(int x) {
         val = x;
         next = null;
     }
    static int countNodes(ListNode_3 head) {
        int count = 0;
        while (head != null) {
            count++;
            head = head.next;
        }

        return count;
    }
    public ListNode_3 mergeTwoLists(ListNode_3 l1, ListNode_3 l2) {
        int n1=countNodes(l1);
        int n2=countNodes(l2);
        if(n1+n2==0){
            return null;
        }
        int arr[]=new int[n1+n2];
        int i=0,j=0,k=0;
        while(i<n1&&j<n2){
            if(l1.val<l2.val){
                arr[k++]=l1.val;
                i++;
                l1=l1.next;
            }
            else{
                arr[k++]=l2.val;
                j++;
                l2=l2.next;
            }
        }
        while(i<n1){
            arr[k++]=l1.val;
            i++;
            l1=l1.next;
        }
        while(j<n2){
            arr[k++]=l2.val;
            j++;
            l2=l2.next;
        }
        i=0;
        ListNode_3 newnode=new ListNode_3(arr[i++]);
        ListNode_3 head2=newnode;
        
        while(true){
            if(i>k-1){
                break;
            }
            ListNode_3 newnode2=new ListNode_3(arr[i++]);
            
            newnode.next=newnode2;
            newnode=newnode2;
            
        }
        return head2;
    }
    // Method to display a linked list
    static void displayLinkedList(ListNode_3 current) {
    
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    
        System.out.println();
    }
    public static void main(String[] args) {
        ListNode_3 h1 = new ListNode_3(2);
        h1.next = new ListNode_3(4);
        h1.next.next = new ListNode_3(7);
        ListNode_3 h2=new ListNode_3(5);
        h2.next = new ListNode_3(6);
        h2.next.next = new ListNode_3(9);

        ListNode_3 obj=new ListNode_3(0);
        ListNode_3 res=obj.mergeTwoLists(h1,h2);

        System.out.println("After the merging resultant linked list is :");
        displayLinkedList(res);
        
    }
}