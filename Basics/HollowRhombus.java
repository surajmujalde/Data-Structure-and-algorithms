import java.util.Scanner; 
class Main {
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
    int num = sc.nextInt() ;

    for(int rows = 0; rows<num ; rows++){
      for(int space = rows ; space<num-1; space++){
        System.out.print(" ");
      }
      for(int col = 0 ; col<num ; col++){
        if(rows==0 || rows ==num-1 || col==0 || col==num-1){
          System.out.print("*");
        }
        else
          System.out.print(" ");
      }
      System.out.println();
    }
    
  }
}