class Main {

  public static int fab(int n){
    if(n == 0 || n==1){
      return n ;
    }
    return fab(n-2) + fab(n-1);
  }
    
  public static void main(String[] args) {
    int fabb = fab(25);
    System.out.print(fabb);
    
  }
}