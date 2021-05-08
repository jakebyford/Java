import java.util.Scanner;

public class WhatOrder {
   // TODO: Define a generic method called checkOrder() that 
   //       takes in four variables of generic type as arguments. 
   //       The return type of the method is integer
   public static <TheType extends Comparable<TheType>>
   Integer checkOrder(TheType item1, TheType item2, TheType item3, TheType item4) {
      TheType minVal = item1;
      TheType maxVal = item1;
      Integer result = 0;
      
      if (item2.compareTo(minVal) < 0) {
         minVal = item2;
         if (item3.compareTo(minVal) < 0) {
            minVal = item3;
            if (item4.compareTo(minVal) < 0) {
               result = 1;
               }
            }
         }
      else if (item2.compareTo(maxVal) > 0) {
         maxVal = item2;
         if (item3.compareTo(maxVal) > 0) {
            maxVal = item3;
            if (item4.compareTo(maxVal) > 0) {
               result = -1;
               }
            }
         }
      else {
         result = 0;
         }
         return result;
      }
   
      // Check the order of the input: return -1 for ascending, 
      // 0 for neither, 1 for descending



   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      // Check order of four strings
      System.out.println("Order: " + checkOrder(scnr.next(), scnr.next(), scnr.next(), scnr.next())); 

      // Check order of four doubles
      System.out.println("Order: " + checkOrder(scnr.nextDouble(), scnr.nextDouble(), scnr.nextDouble(), scnr.nextDouble()));
   }
}
