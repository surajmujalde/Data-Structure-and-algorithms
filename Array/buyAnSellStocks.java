import java.util.Scanner; 
import java.util.Arrays;

class Main {

  public static int buyAndSellStocks(int arr[]){
    int buyPrice = Integer.MAX_VALUE ;
    int maxProfit = 0;

    for(int i = 1; i<arr.length; i++){
      if(buyPrice < arr[i]){
        int profit = arr[i] - buyPrice ;
        maxProfit = Math.max(maxProfit, profit);
      }
      else{
        buyPrice= arr[i];
      }
      
    }
      return maxProfit ;
  }
  
  
  public static void main(String[] args) {
  
    int arr[] = {5,2,8,3,9} ;
    System.out.println("maximum profit is: " + buyAndSellStocks(arr));
   

  }
}