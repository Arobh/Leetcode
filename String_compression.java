class Solution_17{
    public static int count(char[] arr,char ch,int j){
        int n=arr.length;
        int cou=0;
        int flag=0;
        for(int i=j;i<n;i++){
            if(ch==arr[i]){
                cou++;
                if(i+1<n&&ch!=arr[i+1]){
                    flag=1;
                }
            }
            if(flag==1){
                break;
            }
        }
        return cou;
    }
    public int compress(char[] arr){
        String s="";
        int n=arr.length;
        for(int i=0;i<n;){
            int x=count(arr,arr[i],i);
            s=s+arr[i];
            if(x!=1){
                s=s+x;
            }
            i=i+x;
            
        }
        char sr[]=s.toCharArray();
        int m=sr.length;
        System.arraycopy(sr,0,arr,0,m);
        return m;
    }
    public static void main(String[] args) {
        char arr[]={'a','a','b','b','c','c','c'} ;
        
        Solution_17 obj=new Solution_17();
        
        int n=obj.compress(arr);

        System.out.println("After the compression:- ");
        for(int i=0;i<n;i++){
            System.out.print(" "+arr[i]);
        }
        
    }
}