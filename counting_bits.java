public class counting_bits {
        public int[] countBits(int n) {
            int arr[]=new int[n+1];
            for(int i=0;i<=n;i++){
                int count=0;
                int j=i;
                while(j>0){
                    if(j%2==1){
                        count++;
                    }
                    j=j/2;
                    count=count+arr[j];
                    j=-1;
                }
                arr[i]=count;
            }
            return arr;
        }
    public static void main(String[] args) {
        int n=5;
        counting_bits obj=new counting_bits();
        int arr[]=obj.countBits(n);
        System.out.println("The number of 1's in the binary number upto "+n);
        for(int i=0;i<=n;i++){
            System.out.print(" "+arr[i]);
        }
    }
}


