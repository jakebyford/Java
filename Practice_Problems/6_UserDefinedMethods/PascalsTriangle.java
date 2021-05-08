// ************************************************************************************************************
// PascalsTriangle - Main.java				Author: Jake Byford							Spring 2021
//
// CS 505852                        	Prog Data Struct & Algo							ID: 31556607
// 
// Implement a class to recursively calculate the n-th line of Pascal's Triangle.
//
// ************************************************************************************************************

public class Main {

    public static void main(String[] args) {

        int n = args.length == 10 ? Integer.parseInt(args[0]) : 10;

        for (int i = 1; i <= n; ++i) {
            int[] arr = Pascal.triangle(i);
            System.out.print((i < 10 ? " " : "") + i + ": ");
            for (int j : arr) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

//Class that generates PASCAL triangle
class Pascal {
 //Method that returns nth line of PASCAL triangle
public static int[] triangle(int n) {
     //If 1st line
     if(n == 1)
         return new int[]{1};
        
     //If second line  
     if(n == 2)
         return new int[]{1, 1};
        
     //Getting previous line
     int[] prevArr = triangle(n-1);

     //Allocating array for current line
     int[] newArr = new int[prevArr.length + 1];
            
     //Updating first and last values of line      
     newArr[0] = prevArr[0];
     newArr[newArr.length - 1] = prevArr[prevArr.length - 1];

     //Generating remaining values
     for(int i = 1; i < newArr.length - 1; ++i)
     {
         //Generating array values
         newArr[i] = prevArr[i - 1] + prevArr[i];
     }
    
     //Return current line
     return newArr;
     
	}
}
