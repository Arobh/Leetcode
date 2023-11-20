public class maximum_twin_sum_in_linked_list {
      int val;
      maximum_twin_sum_in_linked_list next;
      maximum_twin_sum_in_linked_list() {}
      maximum_twin_sum_in_linked_list(int val) { 
        this.val = val;
      }
      maximum_twin_sum_in_linked_list(int val, maximum_twin_sum_in_linked_list next) {
        this.val = val;
        this.next = next;
      }

      static int countNodes(maximum_twin_sum_in_linked_list head) {
        int count = 0;
        maximum_twin_sum_in_linked_list current = head;

        while (current != null) {
            count++;
            current = current.next;
        }

        return count;
    }
    public int pairSum(maximum_twin_sum_in_linked_list head) {
        int n=countNodes(head);
        int arr[]=new int[n];
        maximum_twin_sum_in_linked_list current=head;
        int i=0,x=n;
        while(x>0){
            arr[i]=current.val;
            if(x!=1)
            current=current.next;
            i++;
            x--;
        }
        int max=-100000;
        for(int j=0,k=n-1;j<k;j++,k--){
            if(arr[j]+arr[k]>max){
                max=arr[j]+arr[k];
            }
        }

        return max;
    }
    // Method to display a linked list
    static void displayLinkedList(maximum_twin_sum_in_linked_list head) {
        maximum_twin_sum_in_linked_list current = head;
    
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    
        System.out.println();
    }
    
    public static void main(String[] args) {
        maximum_twin_sum_in_linked_list head = new maximum_twin_sum_in_linked_list(1);
        head.next = new maximum_twin_sum_in_linked_list(2);
        head.next.next = new maximum_twin_sum_in_linked_list(3);
        head.next.next.next = new maximum_twin_sum_in_linked_list(4);
        System.out.println("Original Linked List:");
        displayLinkedList(head);

        maximum_twin_sum_in_linked_list obj=new maximum_twin_sum_in_linked_list();
        int res=obj.pairSum(head);

        System.out.println("The maximum twin sum is :"+res);
        
    }
}