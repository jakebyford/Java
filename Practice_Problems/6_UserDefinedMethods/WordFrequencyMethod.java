import java.util.Scanner;

public class WordFrequencyMethod {

   public static int getFrequencyOfWord(String[] wordsList, int listSize, String currWord) {
      int i;
      int count = 0;
      for (i = 0; i < listSize; ++i) {
         if (currWord.equals(wordsList[i])) {
            ++count;
            }
         }
      return count;
      }

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int numElements = scnr.nextInt();
      String [] wordsArr = new String[numElements];
      int [] frequencies = new int[numElements];
      int i;
      int count;
      
      for (i = 0; i < numElements; ++i) {
         wordsArr[i] = scnr.next();
         }
         
      for (i = 0; i < numElements; ++i) {
         frequencies[i] = getFrequencyOfWord(wordsArr, numElements, wordsArr[i]);
         }
         
      for (i = 0; i < numElements; ++i) {
         System.out.println(wordsArr[i] + " " + frequencies[i]);
         }
   }
}
