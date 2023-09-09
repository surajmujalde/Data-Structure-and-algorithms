import java.util.Scanner;  
import java.util.Arrays;
class Main {

  public static int countVowel(String str){
    int count =0;
     for(int i= 0; i<str.length(); i++){
       char ch = str.charAt(i);
       if(ch =='a' || ch =='e' || ch =='i' || ch== 'o' || ch== 'u'){
         count ++;
       }
     }
    return count ;
    }
  
  public static void main(String[] args) {
    String str = "suraj";
      System.out.println("Vowel in " + str + ": " + countVowel(str));
}
}