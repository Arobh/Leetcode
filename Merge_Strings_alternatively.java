class Solution {
    public String mergeAlternately(String w1, String w2) {
        /*
        int x=0;
        while(word1[x]!='\0'){
            x++;
        }
        int n1=x;
        x=0;
        while(word2[x]!='\0'){
            x++;
        }
        int n2=x;
        */
        char []word1=w1.toCharArray();
        char[]word2=w2.toCharArray();
        int n1=word1.length;
        int n2=word2.length;
        int l=n1+n2;
        char arr[]=new char[l];
        int i=0,j=0,k=0;
        while(j<n1&&k<n2){
            if(i%2==0){
                arr[i]=word1[j];
                j++;
                i++;
            }
            if(i%2!=0){
                arr[i]=word2[k];
                k++;
                i++;
            }
        
        }
        while(j<n1){
            arr[i]=word1[j];
            j++;
            i++;
        }
        while(k<n2){
            arr[i]=word2[k];
            i++;
            k++;
        }
        String sb=String.valueOf(arr);
        return sb;
    }
    public static void main(String[] args) {
        String str1="AROBH";
        String str2="AVNISH";
        Solution obj=new Solution();
        String str3=obj.mergeAlternately(str1, str2);
        System.out.println(str3);

    }
}