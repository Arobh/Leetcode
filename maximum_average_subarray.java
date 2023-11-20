class Solution_20 {
    public double findMaxAverage(int[] arr, int k) {
        double avg=-111111.00;
        int n=arr.length;
        if(n<k){
            return 0.0;
        }
        else if(n==1&&k==1){
            avg=(double) arr[0];
        }
        else{
            for(int i=0;i<=n-k;i++){
                double avg2=0.0;
                int sum=0;
                for(int j=i;j<i+k;j++){
                    sum = sum + arr[j];
                }
                avg2=(double) sum/k;
                if(avg2>avg){
                    avg=avg2;
                }
            }
        }
        return avg;
    }
    public static void main(String[] args) {
        int arr[]={4,3,2,1} ;
        int k=2;
        Solution_20 obj=new Solution_20();
        
        double d=obj.findMaxAverage(arr,k);
        
        System.out.println("The maximum average subarray is "+d);
        
    }
}