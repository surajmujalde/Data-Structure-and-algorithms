import java.util.Scanner;  
import java.util.Arrays;
class Main {

  public static boolean checkAnagram(String str1, String str2){
      str1 = str1.toLowerCase();
      str2 = str2.toLowerCase();
    boolean result = false;

    if(str1.length() == str2.length()){
      char[] str1CharArray = str1.toCharArray();
      char[] str2CharArray = str2.toCharArray();

      Arrays.sort(str1CharArray);
      Arrays.sort(str2CharArray);

      result = Arrays.equals(str1CharArray, str2CharArray);
      return result;
    }
    return result; 
    }
  
  public static void main(String[] args) {
    String str1 = "listen";
    String str2 = "silent";

    if(checkAnagram(str1,str2)){
      System.out.println(str1 + " and " + str2 + " are anagrams of each other");
    }
    else{
      System.out.println(str1 + " and " + str2 + " are not anagrams");
    }
    
   
}
}