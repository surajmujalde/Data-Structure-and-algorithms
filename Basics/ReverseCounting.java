import java.util.Scanner;

class ReverseCounting {
  public static void main(String[] args) {
    
   System.out.println("Enter a Number:");
    Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

  for (int i = num; i >= 1; i--) {
       System.out.println(i);
  }
}

  }