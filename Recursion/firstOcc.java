class Main {

  public static int firstOcc(int arr[], int index,int len, int key){
    if(index == len){
      return -1 ;
    }

    if(arr[index] == key){
      return index;
    }
    return firstOcc(arr,index+1,len,key);
  }
    
  public static void main(String[] args) {
    int arr[] = {12,32,13,54};
    int len = arr.length;
    System.out.print(firstOcc(arr,0,len,54));
    
  }
}