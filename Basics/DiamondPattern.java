import java.util.Scanner; 
class Main {
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
    int num = sc.nextInt() ;

    for(int rows = 1; rows<=num ; rows++){
      for(int space =1 ; space<=(num-rows); space++){
        System.out.print(" ");
      }
      for(int star = 1; star <=(2*rows)-1 ; star++){
        System.out.print("*");
      }
      System.out.println();
;        }

    for(int rows = num; rows>0 ; rows--){
      for(int space =1 ; space<=(num-rows); space++){
        System.out.print(" ");
      }
      for(int star = 1; star <=(2*rows)-1 ; star++){
        System.out.print("*");
      }
      System.out.println();
;        }
    
  }
}