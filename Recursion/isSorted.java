class Main {

  public static boolean isSorted(int arr[], int index,int len){
    if(index == len-1){
      return true ;
    }

    if(arr[index] > arr[index+1]){
      return false;
    }
    return isSorted(arr,index+1,len);
  }
    
  public static void main(String[] args) {
    int arr[] = {1,2,3,4};
    int len = arr.length;
    System.out.print(isSorted(arr,0,len));
    
  }
}