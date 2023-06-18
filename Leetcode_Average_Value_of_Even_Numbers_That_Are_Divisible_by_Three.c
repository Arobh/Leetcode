int averageValue(int* arr, int n){
    int i,sum=0,count=0,x;
    for(int i=0;i<n;i++){
        if(arr[i]%2==0 && arr[i]%3==0){
            sum+=arr[i];
            count++;
        }
    }
    if(count==0||sum==0){
        return(0);
    }
    else{
         x=sum/count;
    }
    return(x);
}