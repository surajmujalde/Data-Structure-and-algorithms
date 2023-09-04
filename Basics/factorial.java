import java.util.Scanner; 

class Main {
  
	public static void factorial(int num){
    int ans = 1;
    for(int i=2 ; i<=num ; i++){
      ans*=i ;
    }
    System.out.println("factorail is :" + ans);
		
}
  public static void main(String[] args) {
    int num = 5 ;
    factorial(num);
  }
}