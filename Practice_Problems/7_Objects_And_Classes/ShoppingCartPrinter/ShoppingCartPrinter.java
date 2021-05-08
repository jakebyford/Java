import java.util.Scanner;

public class ShoppingCartPrinter {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      /*  In main(), prompt the user for two items and create two objects of the ItemToPurchase class. 
      Before prompting for the second item, call scnr.nextLine(); to allow the user to input a new string. */
     
      ItemToPurchase item1 = new ItemToPurchase();
      ItemToPurchase item2 = new ItemToPurchase();      
      
      item1.setName(scnr.nextLine());
      item1.setPrice(scnr.nextInt());
      item1.setQuantity(scnr.nextInt());
      scnr.nextLine();
      item2.setName(scnr.nextLine());
      item2.setPrice(scnr.nextInt());
      item2.setQuantity(scnr.nextInt());      
      
      System.out.println("Item 1");
      System.out.println("Enter the item name:");
      // System.out.println(item1.getName());
      System.out.println("Enter the item price:");
      // System.out.println(item1.getPrice());
      System.out.println("Enter the item quantity:");
      // System.out.println(item1.getQuantity());
      
      System.out.println("");
      
      System.out.println("Item 2");
      System.out.println("Enter the item name:");
      // System.out.print(item2.getName());
      System.out.println("Enter the item price:");
      // System.out.print(item2.getPrice());
      System.out.println("Enter the item quantity:");
      // System.out.print(item2.getQuantity());
      
      System.out.println("");   
      
      
      // Could probably make variables for all of these
      System.out.println("TOTAL COST");
      System.out.println(item1.getName() + " " + item1.getQuantity() + " @ $" + item1.getPrice() + " = $" + item1.getQuantity() * item1.getPrice());
      System.out.println(item2.getName() + " " + item2.getQuantity() + " @ $" + item2.getPrice() + " = $" + item2.getQuantity() * item2.getPrice());
      System.out.println("");
      System.out.println("Total: $" + ((item1.getQuantity() * item1.getPrice()) + (item2.getQuantity() * item2.getPrice())));
   
   }
}
