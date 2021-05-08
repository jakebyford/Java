/* Build the ItemToPurchase class with the following specifications:

Private fields
String itemName - Initialized in default constructor to "none"
int itemPrice - Initialized in default constructor to 0
int itemQuantity - Initialized in default constructor to 0
Default constructor
Public member methods (mutators & accessors)
setName() & getName() (2 pts)
setPrice() & getPrice() (2 pts)
setQuantity() & getQuantity() (2 pts) 

Extend the ItemToPurchase class per the following specifications:

Private fields
string itemDescription - Initialized in default constructor to "none"
Parameterized constructor to assign item name, item description, item price, and item quantity (default values of 0). (1 pt)
Public member methods
setDescription() mutator & getDescription() accessor (2 pts)
printItemCost() - Outputs the item name followed by the quantity, price, and subtotal
printItemDescription() - Outputs the item name and description*/

public class ItemToPurchase {
   private String itemName;
   private int itemPrice;
   private int itemQuantity;
   private String itemDescription;
   
   public ItemToPurchase() {
      itemName = "none";
      itemPrice = 0;
      itemQuantity = 0;
      itemDescription = "none";
      }
   
   public ItemToPurchase(String userName, String userDescription, int userPrice, int userQuantity) {
      itemName = userName;
      itemDescription = userDescription;
      itemPrice = userPrice;
      itemQuantity = userQuantity;
      }
      
   public String getName() {
      return itemName;
      }
   
   public void setName(String userName) {
      itemName = userName;
      }
   
   public String getDescription() {
      return itemDescription;
      }
	   
   public void setDescription(String userDescription) {
	   itemDescription = userDescription;
      }
      
   public int getPrice() {
      return itemPrice;
      }
   
   public void setPrice(int userPrice) {
      itemPrice = userPrice;
      }
      
   public int getQuantity() {
      return itemQuantity;
      }
   
   public void setQuantity(int userQuantity) {
      itemQuantity = userQuantity;
      }
   /* printItemCost() - Outputs the item name followed by the quantity, price, and subtotal
	  printItemDescription() - Outputs the item name and description*/
   public void printItemCost() {
	   System.out.println(itemName + " " + itemQuantity + " @ $" + itemPrice + " = $" + (itemQuantity * itemPrice));
   }
   
   public void printItemDescription() {
	   System.out.println(itemName + ":" + itemDescription);
   }
}