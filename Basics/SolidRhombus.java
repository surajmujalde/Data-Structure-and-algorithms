import java.util.Scanner; 
class Main {
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
    int num = sc.nextInt() ;

    for(int row =num; row >0 ; row--){
      for(int space = 0; space<row; space++){
        System.out.print(" ");
      }

      for(int star = 0; star<num; star++){
        System.out.print("*");
      }
      System.out.println();
    }
    
  }
}