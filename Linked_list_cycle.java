class ListNode {
     int val;
     ListNode next;
     ListNode(int x) {
         val = x;
         next = null;
     }
    public boolean hasCycle(ListNode head) {
        ListNode current=head;
        while(current!=null){
            if(current.val==-11111){
                return true;
            }
            current.val=-11111;
            current=current.next;

        }
        return false;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next=head.next;

        ListNode obj=new ListNode(0);
        boolean res=obj.hasCycle(head);

        System.out.println("There is a cycle in a linked list is :"+res);
        
    }
}