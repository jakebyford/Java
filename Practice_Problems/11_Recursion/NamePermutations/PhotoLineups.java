import java.util.Scanner;
import java.util.ArrayList;

public class PhotoLineups {
	static int permutationCount = 0;
	
   // TODO: Write method to create and output all permutations of the list of names.
   public static void allPermutations(ArrayList<String> permList, ArrayList<String> nameList) {
      
      ArrayList<String> tmpList;
      ArrayList<String> valsList;
      int i = 0;
      String removedStr;
      String sub;
      
      if (nameList.size() == 0) {
		 ++permutationCount;
		 System.out.print(permutationCount + ") ");
         for (i = 0; i < permList.size(); ++i) {
            System.out.print(permList.get(i) + " ");
            }
            System.out.println();
         }
         
      else {
         for (i = 0; i < nameList.size(); ++i) {
            tmpList = new ArrayList<String>(nameList);
            removedStr = tmpList.remove(i);
            permList.add(removedStr);
            
            allPermutations(permList, tmpList);
            permList.remove(permList.size() - 1);
            }
         }
   }

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      ArrayList<String> nameList = new ArrayList<String>();
      ArrayList<String> permList = new ArrayList<String>();
      String name;
      
      System.out.println("Enter different names to see all the different permutations: ");
      name = scnr.next();
      
      while (!(name.equals("-1"))) {
         nameList.add(name);
         name = scnr.next();
         }
      // System.out.println(nameList);
      
      allPermutations(permList, nameList);
   }
}
