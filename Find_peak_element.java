class Solution_22 {
    public int findPeakElement(int[] arr) {
        int n=arr.length;
        if(n==1){
            return 0;
        }
        for(int i=0;i<n;i++){
            if(i==0){
                if(arr[0]>arr[1]){
                    return i;
                }
            }
            else if(i==n-1){
                if(arr[i]>arr[i-1]){
                    return i;
                }
            }
            else{
                if(arr[i]>arr[i+1]&&arr[i]>arr[i-1]){
                    return i;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Solution_22 obj=new Solution_22();
        int arr[]={1,2,3,1};
        int i=obj.findPeakElement(arr);
        System.out.println("The Peak Element is at index "+i+" i.e. "+arr[i]);
    }
}