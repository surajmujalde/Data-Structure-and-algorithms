import java.util.Scanner; 
import java.util.Arrays;

class Main {

  public static void numericPalindromTraingle(int n){
    for(int i=0; i<n; i++){
      for(int j =0; j<n-i; j++){
        System.out.print(" ");
      }
      for(int k=1; k<=i+1; k++){
        System.out.print(k);
      }

      for(int l=i; l>0 ; l--){
        System.out.print(l);
      }
      System.out.println();
    }
  }
  
  
  public static void main(String[] args) {
    int n = 5;
    numericPalindromTraingle(n);

  }
}