class Solution_13 {
    public static int removeElement(int[] nums, int val) {
        int n=nums.length;
        int count=0;
        for(int i=0;i<n;i++){
            if(nums[i]==val){
                count++;
                if(count==1){
                    continue;
                }
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
    public static int count(int arr[],int val){
        int n=arr.length;
        int co=0;
        for(int i=0;i<n;i++){
            if(arr[i]==val){
                co++;
            }
        }
        return co;
    }
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        int sum=0;
        int x=0;
        for(int i=0;i<n;i++){
            int c=count(nums,nums[i]);
            if(c>1){
                sum=sum+(c-1);
                x=removeElement(nums,nums[i]);
                 
            }
            n=n-(c-1);
           
        }
        System.out.println("X value is "+x);
    
        return n;

    }
    public static void main(String[] args) {
        int arr[]={0,0,1,1,3,4,6,8} ;
        Solution_13 obj=new Solution_13();
        
        int n=obj.removeDuplicates(arr);

        System.out.println("After removing dublicate elements: ");
        for(int i=0;i<n;i++){
            System.out.print(" "+arr[i]);
        }
    }
}