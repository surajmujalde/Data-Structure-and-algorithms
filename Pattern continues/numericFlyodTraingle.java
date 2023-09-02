import java.util.Scanner; 
import java.util.Arrays;

class Main {

  public static void numericFlyodTraingle(int n){
    int k =1;
    for(int i=0; i<n; i++){
      for(int j=0; j<i+1; j++){
        System.out.print(k + " ");
        k++;
      }
      System.out.println();
    }
  }
  
  
  public static void main(String[] args) {
    int n = 6;
    numericFlyodTraingle(n);

  }
}