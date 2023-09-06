import java.util.Scanner; 

class Main {
  
	public static void areaOfCircle(int radius){
    double PI= Math.PI;
    double area = PI * Math.pow(radius, 2); ;
    System.out.println("area of circle is :" + area);
		
}
  public static void main(String[] args) {
    int radius = 5;
   areaOfCircle(radius);
  }
}