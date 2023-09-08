import java.util.Scanner;  
class Main {

  public static void maxAndMin(int arr[]){
      int maxValue = Integer.MIN_VALUE;
      int minValue = Integer.MAX_VALUE;

    for(int i = 0; i<arr.length; i++){
      if(arr[i] > maxValue){
        maxValue = arr[i];
      }
      if(arr[i]< minValue)
       minValue = arr[i];
    }
    System.out.println("max value is:" + maxValue);
    System.out.println("min value is:" + minValue);

  }
  
  public static void main(String[] args) {
   int arr[] = {1,25,36,2,75,-4,56,};
    maxAndMin(arr);
  }
}