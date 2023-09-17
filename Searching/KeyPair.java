class Solution {
    boolean keyPair(int arr[], int n, int x) {
        Arrays.sort(arr);
        // code here
       int start =0, end = arr.length-1, current_sum = 0;
       while(start<end){
           if(arr[start]+arr[end] == x){
               return true;
           }
           else if(arr[start]+arr[end] < x){
               start++;
           }
           else{
               end--;
           }
       }
       return false;
    }
}