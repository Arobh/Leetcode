class Solution_23 {
    public int[] searchRange(int[] arr, int t) {
        int n=arr.length;
        int arr2[]={-1,-1};
        int flag=0;
        for(int i=0;i<n;i++){
            if(arr[i]==t&&flag==0){
                flag=1;
                arr2[0]=i;
            }
            if(arr[i]==t&&flag==1){
                arr2[1]=i;
            }
        }
        return arr2;
    }
    public static void main(String[] args) {
        int arr[]={5,7,7,8,8,10};
        int target=8;
        Solution_23 obj=new Solution_23();
        int arr2[]=obj.searchRange(arr, target);
        System.out.println("The target element i.e. "+target+" ... Starting index is "+arr2[0]+" and the Ending Index is "+arr2[1]);
    }
}