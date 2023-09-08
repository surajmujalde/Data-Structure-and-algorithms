import java.util.Scanner;  
class Main {

  public static void extreamPrint(int arr[]){
      int start =0 , end = arr.length-1;
    while(start<=end){
      if(start==end){
        System.out.print(arr[start] + " ");
      }
      else{
        System.out.print(arr[start] + " ");
        System.out.print(arr[end] + " ");
      }
      
      start++;
      end--;
    }

  }
  
  public static void main(String[] args) {
   int arr[] = {10,20,30,40,50};
    extreamPrint(arr);

    
  }
}