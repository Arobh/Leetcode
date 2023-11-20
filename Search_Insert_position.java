class Solution_24 {
    public int searchInsert(int[] arr, int t) {
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==t){
                return i;
            }
            else if(arr[i]>t){
                return i;
            }

        }
        return n;
    }
    public static void main(String[] args) {
        Solution_24 obj=new Solution_24();
        int arr[]={1,3,5,6};
        int t= 2;
        int x=obj.searchInsert(arr, t);
        System.out.println("The Search Insert Position of t = "+t+" is "+x);
    }
}