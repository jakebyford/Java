// ************************************************************************************************************
// Rational.java				        Author: Jake Byford								Spring 2021
//
// CS 505852                        	Prog Data Struct & Algo							ID: 31556607
//
// ************************************************************************************************************
public class Rational extends Number implements Comparable<Rational> {

	int Rational;
	private double numerator;
	private double denominator;
	
	
	public Rational(double num, double den) {
		numerator = num;
		denominator = den;
	}
	
	public Rational add(Rational o) {
		double numerator1 = numerator * o.denominator;
		double numerator2 = o.numerator * denominator;
		double denominator1 = denominator * o.denominator;
	return gcd(new Rational(numerator1 + numerator2, denominator1));
	}
	
	
	public Rational sub(Rational o) {
		double numerator1 = numerator * o.denominator;
		double numerator2 = o.numerator * denominator;
		double denominator1 = denominator * o.denominator;
	return gcd(new Rational(numerator1 - numerator2, denominator1));
	}
	
	
	
	public Rational div(Rational o) {
		double numerator1 = numerator * o.denominator;
		double denominator1 = denominator * o.numerator;
	return gcd(new Rational(numerator1, denominator1));
	}
	
	
	public Rational mul(Rational o) {
		return gcd(new Rational(numerator * o.numerator, denominator * o.denominator));
	}
	
	
	/* Find GCD of two numbers */
	private static Rational gcd(Rational rational) {
		double numerator = Math.abs(rational.numerator);
		double denominator = Math.abs(rational.denominator);
		int gcd = 1;
	  
		for (int k = 1; k <= denominator && k <= denominator; k++) {
			if (numerator % k == 0 && denominator % k == 0)
					gcd = k;
			}
	
	  
			return new Rational(numerator/gcd,denominator/gcd);
		}
	
	
	public String toString() {
		return "(" + numerator + "/" + denominator + ")";
	}
	
	
	
	
	public int compareTo(Rational o){
		if (Rational < o.Rational)
		return -1;   
		else if (Rational > o.Rational)   
		return 1;   
		return 0;
	}
	
	@Override
	
	public int intValue() {
		return (int)doubleValue();
	}
	
	@Override
	
	public float floatValue() {
		return (float)doubleValue();
	}
	
	@Override
	
	public double doubleValue() {
		return numerator * 1.0 / denominator;
	}
	
	@Override
	
	public long longValue() {
		return (long)doubleValue();
		}
	}
