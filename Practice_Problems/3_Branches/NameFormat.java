import java.util.Scanner; 

public class NameFormat {
   public static void main(String[] args) {
      Scanner scnr = new Scanner (System.in);
      String firstName;
      String middleName;
      String lastName;
      String name;
      int firstSpace;
      int secondSpace;
      
      name = scnr.nextLine();
      
      firstSpace = name.indexOf(" ");                  // finds the specific index number of 3 when using "Pat Doe".
      
      firstName = name.substring(0, firstSpace);       // 0 - 3.
      
      secondSpace = name.indexOf(" ", firstSpace + 1); // starts at the specific index number of 5 
                                                       // and ends at second space aka index number 9 
                                                       // of "Pat Silly Doe".
      
      if (secondSpace < 0) {
         lastName = name.substring(firstSpace +1);
         char firstInitial = firstName.charAt(0);
         System.out.println(lastName + ", " + firstInitial + ".");
         }
      else {
         middleName = name.substring(firstSpace + 1, secondSpace);
         lastName = name.substring(secondSpace + 1);
         char firstInitial = firstName.charAt(0);
         char middleInitial = middleName.charAt(0);
         System.out.println(lastName + ", " + firstInitial + "." + middleInitial + ".");
         }
   }
}
