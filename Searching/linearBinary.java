import java.util.Scanner; 
import java.util.Arrays;

class Main {

  public static int linearSearch(int arr[], int num){
     
    int n = arr.length;
    int start=0, mid= n/2 ,end = n-1;
    for(int i=0; i<n; i++){
     if(arr[i] == num){
       System.out.println("num found");
         return num;
     }
    }
    System.out.println("not found");
    return 0;
  }

  public static int binarySearch(int arr[], int num){
     
    int n = arr.length;
    int start=0, end = n-1;

    while(start<=end){
      int mid= (start+end)/2 ;
      
     if(arr[mid] == num){
       System.out.println("num found");
         return mid;
     }
      if(arr[mid] > num){
        end = mid-1;
      }
      else{
        start = mid+1;
      }
    }
    return -1;
    
  }
  
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
    int num = sc.nextInt() ;
    int arr[] = {10,17,19,33,74} ;

    //int value = linearSearch(arr, num);
    int value = binarySearch(arr, num);
    System.out.println("found at: " + value);

  }
}