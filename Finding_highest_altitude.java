class Solution_6 {
    public int largestAltitude(int[] arr) {
        int n=arr.length;
        int arr2[]=new int[n+1];
        arr2[0]=0;
        int j=1;
        int sum=0;;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            arr2[j]=sum;
            j++;
        }
    
        int max=-100000;
        for(int i=0;i<n+1;i++){
            if(arr2[i]>max){
                max=arr2[i];
            }
        }
        return max;
    }
     public static void main(String[] args) {
        int arr [] = {-5,1,5,0,-7};
        Solution_6 obj=new Solution_6();
        int n= obj.largestAltitude(arr);

        
        System.out.println("THe highest altitude is : "+n);
     }
}