double findMedianSortedArrays(int* arr, int n1, int* arr2, int n2){
    int x=n1+n2;
    int arrN[x];
        int i=0,j=0,k=0;
        while(i<n1&&j<n2){
            if(arr[i]>arr2[j]){
                arrN[k++]=arr2[j++];
            }
            else{
                arrN[k++]=arr[i++];
            }
        }
        while(i<n1){
            arrN[k++]=arr[i++];
        }
        while(j<n2){
            arrN[k++]=arr2[j++];
        }
        if(x%2==0){
            int p=x/2;
            int q=p-1;
            double res=arrN[p]+arrN[q];
            res=res/2;
            return(res);
        }
        else{
            int r=x/2;
            
            double res2=arrN[r];
            return(res2);
        }
        return(0.0);
}