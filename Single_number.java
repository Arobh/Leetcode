class Solution_21 {
    static int count(int arr[],int n,int in,int val){
        int c=0;
        for(int i=in;i<n;i++){
            if(arr[i]==val){
                arr[i]=-111111;
                c++;
            }
        }
        return c;
    }
    public int singleNumber(int[] arr) {
        int n=arr.length;
        int c=0;
        for(int i=0;i<n;i++){
            int temp=arr[i];
            if(arr[i]!=-111111){
                c=count(arr,n,i,arr[i]);
            }
            if(c==1){
                c=temp;
                break;
            }
        }
        return c;
    }
    public static void main(String[] args) {
        int arr[]= {4,1,2,1,2};
        Solution_21 obj=new Solution_21();
        int n=obj.singleNumber(arr);
        System.out.println("The Element which appears only once is "+n);
    }

}