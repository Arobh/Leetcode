class Solution_11 {
    public int removeElement(int[] nums, int val) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==val){
                for(int j=i;j<n-1;j++){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
                n--;
                
            }
            if(nums[i]==val){
                i--;
            }
        }
        return n;
    }
    public static void main(String[] args) {
        int arr[]={1,0,2,0,3,4,0,8} ;
        Solution_11 obj=new Solution_11();
        int val=0;
        int n=obj.removeElement(arr,val);

        System.out.println("After the merge operation: ");
        for(int i=0;i<n;i++){
            System.out.print(" "+arr[i]);
        }
    }
}