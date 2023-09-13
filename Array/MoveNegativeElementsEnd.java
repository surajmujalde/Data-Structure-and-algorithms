import java.util.Scanner;  
class Main {

  public static void moveNegativeElements(int arr[]){
    int start =0, end = arr.length-1;
    while(start<end){
      if(arr[start] <0){
        start++;
      }
      else
        if(arr[end] >0){
          end--;
        }
      else{
        int temp = arr[end];
        arr[end] = arr[start];
        arr[start] = temp;
        start++;
        end--;
      }
    }
  }
  
  public static void main(String[] args) {
   int arr[] = {-1,2,-3,4,-5,6,0,-5,34,-7};
    moveNegativeElements(arr);
    for (int index = 0; index < arr.length; index++) {
     System.out.print(arr[index] + " ");
}
  }
}