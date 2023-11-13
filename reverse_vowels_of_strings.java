class Solution_3 {
    public String reverseVowels(String s) {
        System.out.println(s);
        char []c=s.toCharArray();
        int n=c.length;
        char[]x=new char[n];
        int j=0;
        for(int i=0;i<n;i++){
            if(c[i]=='a'||c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u'||c[i]=='A'||c[i]=='E'||c[i]=='I'||c[i]=='O'||c[i]=='U'){
                x[j]=c[i];
                j++;

                }
        }
        int m=j;

        System.out.println(c);
        System.out.println(x);
        j=m-1;
        for(int i=0;i<n;i++){
            if(c[i]=='a'||c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u'||c[i]=='A'||c[i]=='E'||c[i]=='I'||c[i]=='O'||c[i]=='U'){
                c[i]=x[j];
                j--;

                }
        }

        String sb=String.valueOf(c);
        return sb;
    }
    public static void main(String[] args) {
        String str1="AROBH";
        Solution_3 obj=new Solution_3();
        String str3=obj.reverseVowels(str1);
        System.out.println(str3);

    }
}