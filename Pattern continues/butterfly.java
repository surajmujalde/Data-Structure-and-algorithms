import java.util.Scanner; 

class Main {
  
	public static void butterfly (int num) {
		
		
		// for rows
		for(int i =1 ; i<=num ; i++){
		    //for star
		    for(int star = 1; star<=i ; star++){
		    System.out.print("*");
		} 
		
		//for space
		for(int space = 1 ; space<=2*(num-i) ; space++){
		    System.out.print(" ");
		}
		
		//for star
		for(int star = 1; star<=i ; star++){
		    System.out.print("*");
		} 
		
		
		System.out.println();
		}
		
		//for mirror image (reverse)
		for(int i =num ; i>=1 ; i--){
		    for(int star = 1; star<=i ; star++){
		    System.out.print("*");
		} 
		
		for(int space = 1 ; space<=2*(num-i) ; space++){
		    System.out.print(" ");
		}
		
		for(int star = 1; star<=i ; star++){
		    System.out.print("*");
		} 
		
		
		System.out.println();
		}
}

  
  
  public static void main(String[] args) {
    int n = 6;
    butterfly(n);

  }
}