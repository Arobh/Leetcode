class Solution_19 {
    public int[] plusOne(int[] arr) {
        String s="";
        int n=arr.length;
        int sum=0;
        for(int i=n-1;i>=0;i--){
            if(i==n-1){
                s=s+((sum+arr[i]+1)%10);
                sum=(sum+arr[i]+1)/10;
            }
            else{
                s=s+((sum+arr[i])%10);
                sum=(sum+arr[i])/10;
            }
            
        }
        if(sum!=0){
            s=s+sum;
        }
        StringBuilder s2 = new StringBuilder(s).reverse();
        String s1=s2.toString();
        char arr2[]=s1.toCharArray();
        int x=arr2.length;
        int arr3[]=new int[x];
        for(int i=0;i<x;i++){
            arr3[i]=Character.getNumericValue(arr2[i]);
        }
        return arr3;

    }
    public static void main(String[] args) {
        int arr[]={4,3,2,1} ;
        
        Solution_19 obj=new Solution_19();
        
        int arr2[]=obj.plusOne(arr);
        int n=arr2.length;
        System.out.println("After the operation:- ");
        for(int i=0;i<n;i++){
            System.out.print(" "+arr2[i]);
        }
        
    }
}