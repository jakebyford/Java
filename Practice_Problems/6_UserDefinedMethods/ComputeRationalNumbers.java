/************************************************************************************
* 	ComputeRationalNumbers.java		Author: Jake Byford
* 
*   This program adds, subtracts, multiplies, and divides two rational numbers.
*************************************************************************************/
public class ComputeRationalNumbers {

   //Main method
    public static void main(String[] args) {

        Rational a = new Rational(1, 2);   // input for first rational number
        Rational b = new Rational(1 , 3);   // input for second rational number

        System.out.println(a + " + " + b + " = " + a.add(b));
        System.out.println(a + " - " + b + " = " + a.sub(b));
        System.out.println(a + " * " + b + " = " + a.mul(b));
        System.out.println(a + " / " + b + " = " + a.div(b));
    }
}

class Rational {

    public Rational(int num, int den) {

       numerator = num;
       denominator = den;
      
       //ensures a non-zero denominator
       if (den == 0)
           den = 1;
      
       //stores a negative sign in numerator
       if (den < 0) {
           num = num * -1;
           den = den * -1;
       }
    }

    //return numerator
    public int getNumerator() {
     
       return numerator;
    }
  
    //return denominator
    public int getDenominator() {
     
       return denominator;
    }
  
    //return reciprocal method
    public Rational reciprocal() {
     
       return new Rational(denominator, numerator);
    }

    /*   Addition Class
     *        Find common denominator by multiplying the denominators
     *        Store number values (numerator / common denominator) as num1 and num2
     *        Sum both numbers
     */
    public Rational add(Rational r2) {

       int comDen = denominator * r2.getDenominator();
       int num1 = numerator * r2.getDenominator();
       int num2 = r2.getNumerator() * denominator;
       int sum = num1 + num2;

       return new Rational (sum, comDen);
    }

    //Subtraction Class - same implementation as Addition Class
    public Rational sub(Rational r2) {
    
      int comDen = denominator * r2.getDenominator();
      int num1 = numerator * r2.getDenominator();
      int num2 = r2.getNumerator() * denominator;
      int difference = num1 - num2;

      return new Rational (difference, comDen);
   }
    
   /*   Multiplication Class
    *        Multiply numerator with r2 numerator
    *        Multiply denominator with r2 denominator
    */
   public Rational mul(Rational r2) {
    
      int num = numerator * r2.getNumerator();
      int den = denominator * r2.getDenominator();

      return new Rational (num, den);
   }

   /*   Divide Class
    *        Multiply number by r2 reciprocal
    */
   public Rational div(Rational r2) {

       return mul (r2.reciprocal());
   }

   /*   toString Method
    *        Returns rational number as a string - in parenthesis if a fraction
    */
   public String toString() {
      
       return (((numerator == 0) ? "0" : ( (denominator == 1) ? numerator + "": "(" + numerator + "/" + denominator + ")")));
  
       /* Logic for toString method
       * if (num == 0) {
               return "0";
           } else {
               if (denominator == 1){
                   return numerator;
               } else {
                   return numerator + "/" + denominator;
               }
       */
    }
   // Declare variables
   private int numerator, denominator;
  
}                                                                                                                                