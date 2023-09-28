class Main {

  public static void reverseChar(char ch[]){
    int n = ch.length;
    
    int i=0, j=n-1;

    while(i<j){
      char temp = ch[j];
       ch[j] = ch[i];
      ch[i]= temp;

      i++;
      j--;
      
      
    }
  }
    
  public static void main(String[] args) {
    char ch[] = {'s','u','r','a','j'};
    reverseChar(ch);

    for(char c : ch){
      System.out.print(c);
    }
    
  }
}