class Solution_16 {
    public boolean canPlaceFlowers(int[] arr, int x) {
        int n=arr.length;
        int count=0;
        if(n==0){
            return false;
        }
        else if(n==1){
            if(arr[0]==0&&x<=1){
                return true;
            }
            else if(arr[0]==1&&x==0){
                return true;
            }
            else{
                return false;
            }
        }
        else{
            for(int i=0;i<n;i++){
                if(i==0){
                    if(arr[i]==0&&arr[i+1]==0){
                        arr[i]=1;
                        count++;
                    }
                }
                else if(i>0&&i<n-1){
                    if(arr[i]==0&&arr[i-1]==0&&arr[i+1]==0){
                        arr[i]=1;
                        count++;
                    }
                }
                else{
                    if(arr[i]==0&&arr[i-1]==0){
                        arr[i]=1;
                        count++;
                    }
                }
                
            }
        }
        
        if(count>=x)
        return true;

        return false;
    }
    public static void main(String[] args) {
        int arr[]={1,0,0,0,1} ;
       
        int k=2;
        Solution_16 obj=new Solution_16();
        
        boolean b=obj.canPlaceFlowers(arr,k);

        System.out.println(k+" flowers can be planet is :- "+b);
        
    }
}