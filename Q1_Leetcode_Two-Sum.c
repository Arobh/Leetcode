int *twoSum(int *nums,int numsSize,int target,int *returnSize){
    int *index=malloc(sizeof(int)*2);
    int i,j;
    *returnSize=2;
    for(i=0;i<numsSize;i++){
        for(j=i+1;j<numsSize;j++){
            if(nums[i]+nums[j]==target){
                index[0]=i;
                index[1]=j;
                return index;
            }
        }
    }
    return index;
}