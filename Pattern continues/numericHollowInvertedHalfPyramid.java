import java.util.Scanner; 
import java.util.Arrays;

class Main {

  public static void numericHollowInverted(int n){
    for(int i=0; i<n; i++){
      int k = i+1;
      for(int j=0; j<n; j++){
        if(i==0 || j==0 || j==n-i-1)
        {
          System.out.print(k);
         
        }
        else{
          System.out.print(" ");
        }
         k++;
      }
      System.out.println();
    }
  }
  
  
  public static void main(String[] args) {
    int n = 7;
    numericHollowInverted(n);

  }
}