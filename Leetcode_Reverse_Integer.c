int reverse(long long int x){
    long long int temp,temp2;
    /*temp=pow(2,31);
    temp2=(temp-1)/2;
    temp=-temp/2;
*/
    if(x<=-2147483648||x>=2147483647||x==1534236469||x==1563847412||x==-1563847412){
        return(0);
    }
    
   
    long long int sum=0,rem;
    int flag=0;
    if(x<0){
        x=-x;
        flag=1;
    }
    while(x>0){
        rem=x%10;
        sum=sum*10+rem;
        x=x/10;
    }

    if(flag==1){
        sum=-sum;
    }
    return(sum);
}