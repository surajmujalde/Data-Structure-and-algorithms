import java.util.Scanner; 
class Main {
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
    int num = sc.nextInt() ;

    for(int row = 0; row<num ; row++){
      for(int col = 0; col<num ; col++){
        if(row==0 || row == num-1 || col==0 || col==num-1){
        System.out.print("*" + " ");
        }
        else
          System.out.print("  ");

        
      }
      System.out.println();
    }
  }
}