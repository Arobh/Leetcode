class Solution_10 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int x=m+n;
        int arr[]=new int[x];
        int i=0,j=0,k=0;
        while(j<m&&k<n){
            if(nums1[j]<nums2[k]){
                arr[i]= nums1[j];
                j++;
            }
            else{
                arr[i]=nums2[k];
                k++;
            }
            i++;
        }
        while(j<m){
            arr[i++]=nums1[j++];
        }
        while(k<n){
            arr[i++]=nums2[k++];
        }
        for(int l=0;l<x;l++){
            nums1[l]=arr[l];
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,0,0,0} ;
        int m= 3;
        int arr2[]= {2,5,6};
        int n= 3;
        Solution_10 obj=new Solution_10();
        obj.merge(arr,m, arr2,n);

        System.out.println("After the merge operation: ");
        for(int i=0;i<m+n;i++){
            System.out.print(" "+arr[i]);
        }
    }
}