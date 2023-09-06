import java.util.Scanner; 

class Main {
  
	public static void primeToN(int num){
   for(int i=1; i<=num; i++){
     int count = 0;
    for(int j = 2; j<=Math.sqrt(i); j++ ){
      if(i%j==0){
        count++;
        break;
      }
    }
     if(count ==0 && i!=1)
     System.out.print(i + ",");
   }
}
  public static void main(String[] args) {
   primeToN(10);
  }
}