class Solution_18 {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        else{
            String s=""+x;
            StringBuilder s2 = new StringBuilder(s).reverse();
            String s1=s2.toString();
            if(s.equals(s1)){
                return true;
            }
            

        }
        return false;
    }
    public static void main(String[] args) {
        int x=121;
        Solution_18 obj=new Solution_18();
        boolean b=obj.isPalindrome(x);
        if(b==true){
            System.out.println(x+" is a palindrome");
        }
        else{
            System.out.println(x+" is not a palindrome");
        }
    }
}