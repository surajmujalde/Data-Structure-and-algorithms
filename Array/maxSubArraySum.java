import java.util.Scanner; 
import java.util.Arrays;

class Main {

  public static void maxSubArraySum(int arr[]){
    int totalPair = 0, maxSubarray=Integer.MIN_VALUE;
    for(int i =0; i<arr.length ; i++){
      for(int j =i; j<arr.length; j++){
        int currentSum = 0;
        for(int k =i; k<=j; k++){
        System.out.print(arr[k] + " ");
          currentSum+=arr[k];
        }
        if(maxSubarray<currentSum){
          maxSubarray=currentSum;
        }
        totalPair++;
        System.out.println();

      }
      System.out.println();
    }
    System.out.println("max sum of subArrya: "+ maxSubarray);
    System.out.println("Total no. of subarray is: " +totalPair);
  }
  
  
  public static void main(String[] args) {
  
    int arr[] = {1,-2,6,-1,3} ;
    int n = arr.length;

    subArray(arr);
   

  }
}