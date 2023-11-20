class Solution_14 {
    public static int count(int arr[],int val,int x){
        int n=arr.length;
        int co=0;
        for(int i=0;i<n;i++){
            if(arr[i]==val){
                co++;
            }
            if(co>x){
                return co;
            }
        }
        return co;
    }
    public int majorityElement(int[] arr) {
        int n=arr.length;
        int x=n/2;
        for(int i=0;i<n;i++){
            int c=count(arr,arr[i],x);
            if(c>x){
                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={2,2,1,1,1,2,2} ;
        Solution_14 obj=new Solution_14();
        
        int n=obj.majorityElement(arr);

        System.out.println("The Majority elements is:- "+n);
        
    }
}