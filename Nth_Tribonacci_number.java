public class Nth_Tribonacci_number {
    int[] M = new int[40];
    int flag=0;
    public void initia() {
        M[0] = 0;
        M[1] = 1;
        M[2] = 1;
    }
    public int tribonacci(int n){
        if (flag==0){
            initia();
            flag=1;
        }
        if (n<0){
            return 0; 
        }
        else if (n==1){
            return M[1];
        }
        else if(n==0){
            return M[0];
        } 
        else if (n==2){
            return M[2];
        } 
        else{
            if (M[n] == 0) {
                M[n] = tribonacci(n - 1) + tribonacci(n - 2) + tribonacci(n - 3);
            }
        }
        return M[n];
    }
    public static void main(String[] args) {
        int n=5;
        Nth_Tribonacci_number obj=new Nth_Tribonacci_number();
        int x=obj.tribonacci(n);

        System.out.println("The Tribonacci number of "+n+" is "+x);
    }
}
