import java.util.Scanner; 
import java.util.Arrays;

class Main {

  public static int[] reverseArray(int arr[]){
    int n = arr.length, start=0;
    int end=n-1; 
    while(start<end){
      int temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;
      start++;
      end--;
    }
    return arr;
    
  }
  
  public static void main(String[] args) {
  
    int arr[] = {10,17,19,33,74} ;
    int n = arr.length;
    reverseArray(arr);

    for(int i=0; i<n; i++){
      System.out.print(arr[i] + " ");
    }

  }
}