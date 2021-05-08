import java.util.Scanner;

public class GenericArrayMapping {
   public static <MapType extends Comparable<MapType>>
                  MapType getMapping(MapType mapMe, MapType[] mappings) {
      MapType result;
      int i;
      int len;
      boolean keepLooking;

      result = mapMe;
      len = mappings.length;
      keepLooking = true;

      System.out.println();
      System.out.print("Mapping range: ");
      for (i = 0; i < len; ++i) {
         System.out.print(mappings[i] + "  ");
      } 
      System.out.println();
      
      i = 0;      // Restart counting
      while ((i < len) && keepLooking) {
         if (mapMe.compareTo(mappings[i]) <= 0) {
            result = mappings[i];
            keepLooking = false;
         }
         else {
            ++i;
         } 
      } 
      System.out.println(mapMe + " is mapped to " + result);

      return result;
   } 

   // ***********************************************************************
   
   public static void main(String [] args) {

      Scanner scnr = new Scanner(System.in);

      // Declare various types to use to call getMapping

      Integer mapInt;
      Integer mapIntResult;
      Integer [] mapIntMappings = { 100, 200, 300, 400, 500, 600 };

      Double mapDouble;
      Double mapDoubleResult;
      Double [] mapDoubleMappings = { -12.0, -6.0, 0.0, 6.0, 12.0 };

      String mapString;
      String mapStringResult;
      String [] mapStringMappings = { "A", "E", "M", "S", "W", "Z" };
      String absorbInput;           // To read a string after a number

      // Get values to map, from user input
      
      System.out.print("\nEnter an integer value to map: ");
      mapInt = scnr.nextInt();
      mapIntResult = getMapping(mapInt, mapIntMappings);

      System.out.print("\nEnter a double value to map: ");
      mapDouble = scnr.nextDouble();
      mapDoubleResult = getMapping(mapDouble, mapDoubleMappings);

      absorbInput = scnr.nextLine();   // Absorb the <Enter> from integer input
      System.out.print("\nEnter a string value to map: ");
      mapString = scnr.nextLine();
      mapStringResult = getMapping(mapString, mapStringMappings);
   } 
}
