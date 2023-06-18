bool isSameAfterReversals(long long int x){
    long long int temp=x;

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

    x=sum;
    flag=0;
    sum=0;

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

    if(sum==temp){
        return true;
    }
    else{
        return(false);
    }
    
}