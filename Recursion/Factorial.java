class Main {

  public static int recursion(int n){
    if(n == 0){
      return 1 ;
    }
    return n * recursion(n-1);
  }
    
  public static void main(String[] args) {
    int fact = recursion(5);
    System.out.print(fact);
    
  }
}