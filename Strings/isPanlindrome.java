import java.util.Scanner;  
class Main {

  public static int isPanlindrome(String word){
    int start = 0,end = word.length()-1;
      while(start<end){
        if(word.charAt(start) != word.charAt(end)){
          return -1;
        }
        start++;
          end--;
      }
    return 1;
  }
  
  public static void main(String[] args) {
   String word= "madam";
    int value =isPanlindrome(word);
    if(value==1){
      System.out.print("palindrome");
      
    }else{
       System.out.print("Not a palindrome");
    }
  }
}