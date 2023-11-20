class Solution_15 {
    
    public void rotate(int[] arr, int k) {
        int n=arr.length;
        if(k>=n){
            k=k%n;
        }
        int arr2[]=new int[n];
        int j=0;
        for(int i=0;i<n;i++){
            arr2[i]=arr[i];
        }
        
        for(int i=n-k;i<n;i++){
            arr[j++]=arr2[i];
        }

        for(int i=0;i<n-k;i++){
            arr[j++]=arr2[i];
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7} ;
        int n=7;
        int k=3;
        Solution_15 obj=new Solution_15();
        
        obj.rotate(arr,k);

        System.out.println("After the rotation:- ");
        for(int i=0;i<n;i++){
            System.out.print(" "+arr[i]);
        }
        
    }
}