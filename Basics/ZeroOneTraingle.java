
import java.io.*;

class ZeroOneTraingle {
	public static void main (String[] args) {
		
		 int z = 5;
        for(int i = 1; i<=z ; i++){
            
           for(int j=0; j<i; j++){
               if((i+j)%2==0){
                   System.out.print("0");
               }
               else
               System.out.print("1");
           }
           System.out.println();
        }
	}
}