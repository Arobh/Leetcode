class Solution_12 {
    public static int count(int[] arr,int x){
        int n=arr.length;
        int c=0;
        for(int i=0;i<n;i++){
            if(arr[i]==x){
                c++;
            }
        }
        return c;
    }
    public int removeDuplicates(int[] arr) {
        int n=arr.length;
        
        for(int i=0;i<n;i++){
            int x=count(arr,arr[i]);
            if(x>1){
                if(arr[i+1]==arr[i]){
                    for(int j=i+1;j<n-1;j++){
                        int temp=arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=temp;
                    }
                    n--;
                    if(n>i+1){
                        if(arr[i+1]==arr[i]){
                            i--;
                        }
                    }
                }
                
            }

        }
           
        return n;
    }
    public static void main(String[] args) {
        int arr[]={0,0,1,1,3,4,6,8} ;
        Solution_12 obj=new Solution_12();
        
        int n=obj.removeDuplicates(arr);

        System.out.println("After removing dublicate elements: ");
        for(int i=0;i<n;i++){
            System.out.print(" "+arr[i]);
        }
    }
}