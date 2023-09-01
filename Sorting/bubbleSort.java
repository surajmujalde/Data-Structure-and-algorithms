import java.util.Scanner; 
import java.util.Arrays;

class Main {

  public static void bubblSort(int arr[]){
    for(int i=0; i<arr.length-1; i++ ){
      for(int j = 0 ; j<arr.length-1-i; j++){
        if(arr[j] > arr[j+1]) {
          int temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
        }
      }
    }
  }
  
  
  public static void main(String[] args) {
  
    int arr[] = {105,252,158,33,109} ;
    bubblSort(arr);

    for(int i=0; i<arr.length; i++){
      System.out.print(arr[i] + " ");
    }

    
   

  }
}