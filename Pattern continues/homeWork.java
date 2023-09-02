import java.util.Scanner; 
import java.util.Arrays;

class Main {

  public static void homeWork(int n){
    for(int i=0; i<n; i++){
      int k = i+1;
      for(int j=0; j<i+2; j++){
        if(i==0 ||i==n-1 || j==0 || j==i+1)
        {
          System.out.print(j+1);
         
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
    homeWork(n);

  }
}