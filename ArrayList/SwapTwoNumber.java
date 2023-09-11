import java.util.ArrayList;
class Main {

  public static void swap(ArrayList<Integer>list, int index1, int index2){
    
    int temp = list.get(index1);
    list.set(index1, list.get(index2));
    list.set(index2, temp);
    }
  
  public static void main(String[] args) {
    ArrayList<Integer>list = new ArrayList<>();
    list.add(5);
    list.add(6);
    list.add(2);
    list.add(15);
    list.add(11);

    System.out.println(list);

    int index1=1, index2 = 4;
    swap(list, index1,index2);
    System.out.println(list);
}
}