class Solution_25 {
    public double findMedianSortedArrays(int[] a1, int[] a2) {
        int n1=a1.length;
        int n2=a2.length;
        int arr[]=new int[n1+n2];
        int i=0,j=0,k=0;
        while(i<n1&&j<n2){
            if(a1[i]<a2[j]){
                arr[k++]=a1[i++];
            }
            else{
                arr[k++]=a2[j++];
            }
        }
        while(i<n1){
            arr[k++]=a1[i++];
        }
        while(j<n2){
            arr[k++]=a2[j++];
        }
       
        double x,y;
        if(k%2==0){
            x=arr[(k/2)-1];
            y=arr[(k/2)]; 
            x=(x+y)/2;
        }
        else{
            x=arr[(k+1)/2 -1];
        }
        return x;
    }
    public static void main(String[] args) {
        Solution_25 obj =new Solution_25();
        int a1[]={1,2};
        int a2[]={3,4};
        double m=obj.findMedianSortedArrays(a1, a2);
        System.out.println("The Median of the sorted array is "+m);
    }
}