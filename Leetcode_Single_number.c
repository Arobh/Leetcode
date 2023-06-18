int singleNumber(int* nums, int numsSize){
    int x;
        for(int i=0;i<numsSize;i++){
            int c=0;
            for(int j=0;j<numsSize;j++){
                if(nums[i]==nums[j]){
                    c++;
                }
            }
            if(c==1){
                x=i;
                break;
                
            }
        }
        return(nums[x]);
}