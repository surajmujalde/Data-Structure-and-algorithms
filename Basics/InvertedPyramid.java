/*package whatever //do not write package name here */

import java.io.*;

class InvertedPyramid {
	public static void main (String[] args) {
		
		 int z = 5;
        for(int i = 1; i<=z ; i++){
            
            for(int j=1 ; j<=z-i ; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=i ; k++){
                 System.out.print("*");
             }
            System.out.println();
        }
	}
}