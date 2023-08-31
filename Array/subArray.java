import java.util.Scanner; 
import java.util.Arrays;

class Main {

  public static void subArray(int arr[]){
    int totalPair = 0;
    for(int i =0; i<arr.length ; i++){
      for(int j =i; j<arr.length; j++){
        for(int k =i; k<=j; k++){
        System.out.print(arr[k] + " ");
        
        }
        totalPair++;
        System.out.println();

      }
      System.out.println();
    }
    System.out.println(totalPair);
  }
  
  
  public static void main(String[] args) {
  
    int arr[] = {2,4,6,8,10} ;
    int n = arr.length;

    pairInArray(arr);
   

  }
}