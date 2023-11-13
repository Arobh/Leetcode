import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution_2 {
    private static Boolean[] toBooleanArray(boolean[] arr) {
        Boolean[] result = new Boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[i];
        }
        return result;
    }
    public List<Boolean> kidsWithCandies(int[] arr, int ex) {
        int n=arr.length;
        boolean arr2[]=new boolean[n];
        int max=-1;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]+ex>=max){
                arr2[i]=true;
            }
            else{
                arr2[i]=false;
            }
        }
        /*List<Boolean> myList = new ArrayList<>();
        myList.add(List.of(arr2));*/
          List<Boolean> myList = new ArrayList<>(Arrays.asList(toBooleanArray(arr2)));
 
        return myList;
    }
     public static void main(String[] args) {
        int candies [] = {2,3,5,1,3};
        int extra_candies=3;
        Solution_2 obj=new Solution_2();
        List<Boolean> myList=obj.kidsWithCandies(candies, extra_candies);
        System.out.println(myList);

     }
}