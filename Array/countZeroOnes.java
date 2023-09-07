import java.util.Scanner;  
class Main {

  public static void countZeroOnes(int arr[]){
    int countZero=0,countOnes=0;
    for(int i = 0; i<arr.length; i++){
      if(arr[i]== 0){
        countZero++;
      }
      else
        countOnes++;
    }
    System.out.println("count of Zero is:" + countZero);
    System.out.println("count of one is:" + countOnes);

  }
  
  public static void main(String[] args) {
   int arr[] = {0,1,0,0,1,1,0,1,0,1,0,1,1,0,0};
    countZeroOnes(arr);
  }
}