class Solution_7 {

    public int count(int []arr,int x,int n){
        
        int c=0;
        for(int i=0;i<n;i++){
            if(arr[i]==x){
                c++;
                arr[i]=-1111;
            }

        }
        return c;
    }
    public boolean uniqueOccurrences(int[] arr) {
        Solution_7 obj=new Solution_7();
        int n=arr.length;
        int arr2[]=new int[n];
        int j=0;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        for(int i=0;i<n;i++){
            int co;
            if(arr[i]!=-1111){
                co=obj.count(arr,arr[i],n);
                arr2[j]=co;
                j++;
            }
        }
        System.out.print("\n");
        for(int i=0;i<j;i++){
            System.out.print(+arr2[i]+" ");
        }
        int cou=0;
        for(int i=0;i<=j;i++){
            if(i<n){
                cou=obj.count(arr2,arr2[i],j);
                if(cou>1){
                    return false;
                }
                
            }
            
        }
        return true;
    }
    public static void main(String[] args) {
        int arr[]={1,2,2,1,1,3};
        Solution_7 obj=new Solution_7();
        boolean b=obj.uniqueOccurrences(arr);
        System.out.println();
        if(b==true){
            System.out.println("TRUE i.e. unique number of occurences");
        }
        else{
            System.out.println("False i.e. no true number of occurences...");
        }
    }
}
