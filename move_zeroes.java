class Solution_4 {
    
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                for(int j=i;j<n-1;j++){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
                n--;
                
            }
            if(nums[i]==0){
                i--;
            }
        }
    }
    public static void main(String[] args) {
        int arr [] = {0,1,0,3,12};
        int n=5;
        Solution_4 obj=new Solution_4();
        obj.moveZeroes(arr);
        
        System.out.println("After Operation: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

     }
}