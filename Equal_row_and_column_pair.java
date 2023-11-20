class Solution_8 {
    public int equalPairs(int[][] arr) {
        int n=arr.length;
        int count=0;
        for(int i=0;i<n;i++){
            
            for(int j=0;j<n;j++){
                int flag=0;

                for(int k=0;k<n;k++){
                    if(arr[i][k]!=arr[k][j]){
                        flag=1;
                    }
                }
                if(flag==0){
                    count++;
                    
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[][]={{3,2,1},{1,7,6},{2,7,7}};
        Solution_8 obj=new Solution_8();
        int count=obj.equalPairs(arr);
        System.out.println("The number of equal pairs is: "+count);
    }
}