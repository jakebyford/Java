import java.util.Scanner;

public class TriangleArea {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      double userInput;
      
      Triangle triangle1 = new Triangle();
      Triangle triangle2 = new Triangle();

      // TODO: Read and set base and height for triangle1 (use setBase() and setHeight())
      userInput = scnr.nextDouble();
      triangle1.setBase(userInput);
      
      userInput = scnr.nextDouble();
      triangle1.setHeight(userInput);
      
      // TODO: Read and set base and height for triangle2 (use setBase() and setHeight())
      userInput = scnr.nextDouble();
      triangle2.setBase(userInput);
      
      userInput = scnr.nextDouble();
      triangle2.setHeight(userInput);
      
      // TODO: Determine larger triangle (use getArea())
      triangle1.getArea();
      triangle2.getArea();
      
      System.out.println("Triangle with larger area:");
      // TODO: Output larger triangle's info (use printInfo())
      if (triangle1.getArea() < triangle2.getArea()) {
         triangle2.printInfo();
         }
      else {
         triangle1.printInfo();
         }
   }
}
