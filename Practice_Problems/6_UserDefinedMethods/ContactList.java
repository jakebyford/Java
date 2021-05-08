import java.util.Scanner; 

public class ContactList {
   
   public static String getPhoneNumber(String[] nameVec, String[] phoneNumberVec, String contactName, int arraySize) {
      int i = 0;
      
      for (i = 0; i < arraySize - 1; ++i) {
         if (contactName.equals(nameVec[i])) {
            break;
            }
         }
         return phoneNumberVec[i];
      }
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int n = scnr.nextInt();
      String [] names = new String[n];
      String [] phoneNums = new String[n];
      String contact;
      int i;
      
      for (i = 0; i < n; ++i) {
         names[i] = scnr.next();
         phoneNums[i] = scnr.next();
         }
      
      contact = scnr.next();
      System.out.println(getPhoneNumber(names, phoneNums, contact, n));
   }
}
