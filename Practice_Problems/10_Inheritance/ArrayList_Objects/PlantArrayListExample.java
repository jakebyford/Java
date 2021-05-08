import java.util.Scanner;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class PlantArrayListExample {

   // TODO: Define a printArrayList method that prints an ArrayList of plant (or flower) objects                                                       
   public static void printArrayList(ArrayList<Plant> myGarden) {
      for (int i =0; i < myGarden.size(); ++i) {
         myGarden.get(i).printInfo();
         System.out.println();
      }
   }
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String input;
      
      // TODO: Declare an ArrayList called myGarden that can hold object of type plant
      ArrayList<Plant> myGarden = new ArrayList<Plant>();
      
      // TODO: Declare variables - plantName, plantCost, colorOfFlowers, isAnnual
      String plantName, plantCost, colorOfFlowers;
      boolean isAnnual;
      
      input = scnr.next();
      while(!input.equals("-1")){
         // TODO: Check if input is a plant or flower
         //       Store as a plant object or flower object
         //       Add to the ArrayList myGarden
         if (input.equals("plant")) {
            
        	Plant plant = new Plant();
            
            plantName = scnr.next();
            plantCost = scnr.next();
            
            plant.setPlantName(plantName);
            plant.setPlantCost(plantCost);
            myGarden.add(plant);
            
            }

         else if (input.equals("flower")) {
            
        	Flower flower = new Flower();
            
            plantName = scnr.next();
            plantCost = scnr.next();
            isAnnual = scnr.nextBoolean();
            colorOfFlowers = scnr.next();
            
            flower.setPlantName(plantName);
            flower.setPlantCost(plantCost);
            flower.setPlantType(isAnnual);
            flower.setColorOfFlowers(colorOfFlowers);
            myGarden.add(flower);
            
            }
         input = scnr.next();
      }
      // System.out.print(myGarden);
      // TODO: Call the method printArrayList to print myGarden
      printArrayList(myGarden);
   }
}
