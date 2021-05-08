import java.util.Scanner;

public class WordFrequencies{
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int numOfWords = scnr.nextInt();
      
      String words[] = new String[numOfWords];
      int frequency[] = new int[numOfWords];
      int i;
      int j;
      int count;
      String word;
       

      for (i = 0; i < numOfWords; ++i){
         words[i] = scnr.next();
      }

      count = 0;
      for (i = 0; i < numOfWords; ++i) {
         word = words[i];
         count = 0;
         
         for (j = 0; j < numOfWords; ++j) {
            if(words[j].equals(word)) {
               ++count;
            }
         }
         
         for (j = 0; j < numOfWords; ++j) {
            if(words[j].equals(word)) {
               frequency[j] = count;
            }
         }
      }
      
      for (i = 0; i < numOfWords; ++i){
         System.out.println(words[i] + " - " + frequency[i]);
      }
                
   }
}