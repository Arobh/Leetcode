class Solution_9 {
    public int[] dailyTemperatures(int[] temp) {
        int n=temp.length;
        int arr[]=new int[n];
        int max=-100;
        int j=-1;
        for(int i=0;i<n;i++){
            if(temp[i]>max){
                max=temp[i];
                j=i;
            }
        }

        for(int i=0;i<n-1;i++){
            if(i<j&&temp[i]==temp[j]-1){
                arr[i]=j-i;
            }
            else if(i==j){
                arr[i]=0;
            }
            else{
                int count=0;
                for(int k=i+1;k<n;k++){
                    count++;
                    if(temp[k]>temp[i]){
                        arr[i]=count;
                        break;
                    }
                }
            }
        }
        arr[n-1]=0;

        return arr;
    }
    public static void main(String[] args) {
        int temp[]={30,40,50,60};
        int n=4;
        Solution_9 obj=new Solution_9();
        int arr[]=new int[n];
        arr=obj.dailyTemperatures(temp);
        System.out.println();
        for(int i=0;i<n;i++){
            System.out.print(" "+arr[i]);
        }
    }
}