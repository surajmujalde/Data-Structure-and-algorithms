import java.util.Scanner; 

class Main {
  
	public static void selectionSort (int arr[]) {
		for(int i =0; i<arr.length-1; i++){
      int minIndex = i;
      for(int j= i+1; j<arr.length; j++){
        if(arr[minIndex] >arr[j]){
          minIndex = j;
        }
      }
      int temp = arr[minIndex];
      arr[minIndex] = arr[i];
      arr[i] = temp;
    }
		
		
}
  public static void main(String[] args) {
    int arr[] = {25,3,45,34,81,61,4,67,14,51,12};
    selectionSort(arr);

    for(int i =0; i<arr.length; i++){
      System.out.print(arr[i] + " ");
    }

  }
}