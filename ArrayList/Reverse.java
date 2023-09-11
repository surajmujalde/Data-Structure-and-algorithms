import java.util.ArrayList;
class Main {

  public static ArrayList<Integer> reverse(ArrayList<Integer>list){

    for (int index = list.size()-1; index >=0 ; index--) {
      System.out.print(list.get(index)+ " ");
}
    return list;
    }
  
  public static void main(String[] args) {
    ArrayList<Integer>list = new ArrayList<>();
    list.add(5);
    list.add(6);
    list.add(2);
    list.add(15);
    list.add(11);
    reverse(list);
}
}