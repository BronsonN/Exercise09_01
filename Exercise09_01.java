

public class Exercise09_01 {

   private double width = 1.0;
   private double height = 1.0;

   public void Exercise09_01() {

   }

    public Exercise09_01(double x, double y) {
     width = x;
     height = y;
   }

    double getArea() {
     return width * height;
   }

    double getPerimeter() {
     return width + width + height + height;
   }



public static void main(String[] args) {

    Exercise09_01 one = new Exercise09_01(4, 40);
    Exercise09_01 two = new Exercise09_01(3.5, 35.9);

    System.out.println("The area of a rectangle with width 4.0 and height 40.0 is " +one.getArea());
    System.out.println("The perimeter of a ractangle is " +one.getPerimeter());

    System.out.println("The area of a retangle with width 3.5 and height 35.9 is " +two.getArea());
    System.out.println("The perimeter of a ractangle is " +two.getPerimeter());
  }

}
