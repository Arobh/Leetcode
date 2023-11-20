class Solution_5 {
    public boolean isSubsequence(String s, String t) {
        char []new1=s.toCharArray();
        char[]new2=t.toCharArray();
        int n1=new1.length;
        int n2=new2.length;
        int j=0;
        if(n1==0){
            return true;
        }
        if(n2==0){
            return false;
        }
        for(int i=0;i<n2;i++){
            if(j==n1-1){
                if(new1[j]==new2[i]){
                    return true;
                }
            }
            else{
                if(new1[j]==new2[i]){
                    j++;
                }
            }
        }
        return false;

    }
    public static void main(String[] args) {
        String s1="abc";
        String s2="ahbgdc";
        Solution_5 obj=new Solution_5();
        boolean b=obj.isSubsequence(s1, s2);
        if(b==true){
            System.out.println("TRUE SUBSEQUENCE");
        }
        else{
            System.out.println("FALSE SUBSEQUENCE");
        }
    }
}