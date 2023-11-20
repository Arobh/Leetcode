class ListNode_2 {
     int val;
     ListNode_2 next;
     ListNode_2(int x) {
         val = x;
         next = null;
     }
    static int countNodes(ListNode_2 head) {
        int count = 0;
        while (head != null) {
            count++;
            head = head.next;
        }

        return count;
    }
    public ListNode_2 addTwoNumbers(ListNode_2 l1, ListNode_2 l2) {
        int n1=countNodes(l1);
        int n2=countNodes(l2);
        int max=0;
        if(n1>n2){
            max=n1;
        }
        else{
            max=n2;
        }
        int arr[]=new int[max+1];
        int i=0,j=0,k=0;
        int rem=0;
        int res=0;
        while(i<n1&&j<n2){
            res=rem+l1.val+l2.val;
            arr[k++]=res%10;
            rem=res/10;
            i++;
            j++;
            l1=l1.next;
            l2=l2.next;
        }
        while(i<n1){
            res=rem+l1.val;
            arr[k++]=res%10;
            rem=res/10;
            i++;
            l1=l1.next;
        }
        while(j<n2){
            res=rem+l2.val;
            arr[k++]=res%10;
            rem=res/10;
            j++;
            l2=l2.next;
        }
        if(rem>0){
            arr[k++]=rem;
        }
        i=0;
        ListNode_2 newnode=new ListNode_2(arr[i++]);
        ListNode_2 head2=newnode;
        
        while(true){
            if(i>k-1){
                break;
            }
            ListNode_2 newnode2=new ListNode_2(arr[i++]);
            
            newnode.next=newnode2;
            newnode=newnode2;
            
        }
        return head2;
    }
    // Method to display a linked list
    static void displayLinkedList(ListNode_2 current) {
    
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    
        System.out.println();
    }
    public static void main(String[] args) {
        ListNode_2 h1 = new ListNode_2(2);
        h1.next = new ListNode_2(4);
        h1.next.next = new ListNode_2(3);
        ListNode_2 h2=new ListNode_2(5);
        h2.next = new ListNode_2(6);
        h2.next.next = new ListNode_2(4);

        ListNode_2 obj=new ListNode_2(0);
        ListNode_2 res=obj.addTwoNumbers(h1,h2);

        System.out.println("After addition the resultant linked list is :");
        displayLinkedList(res);
        
    }
}