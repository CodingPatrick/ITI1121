/**
* this class represents many manipulations of a rational number
*
* @author Patrick Loranger
*/

public class Rational {

    private int numerator;
    private int denominator;

    // constructors

    public Rational(int numerator) {
	     // Your code here
        this.numerator = numerator;
        this.denominator = 1;
    }

    public Rational(int numerator, int denominator) {
	     // Your code here
        if( denominator < 0){
            numerator = numerator * -1;
            denominator = denominator * -1;
        }

        this.numerator = numerator;
        this.denominator = denominator;
        reduce();
    }

    // getters

    public int getNumerator() {
	     return this.numerator;
    }

    public int getDenominator() {
	     return this.denominator;
    }

    // instance methods

    public Rational plus(Rational other) {
        // Your code here
        int numeratorNew, denominatorNew;
        numeratorNew = (numerator * other.denominator) + (other.numerator * denominator);
        denominatorNew = denominator * other.denominator;
        return new Rational(numeratorNew, denominatorNew);
    }

    public static Rational plus(Rational a, Rational b) {
    	// Your code here
        Rational addition;
        addition = a.plus(b);
        return addition;
    }

    // Transforms this number into its reduced form

    private void reduce() {
        // Your code here
        int cd;
        cd = gcd(numerator, denominator);
        this.numerator = numerator / cd;
        this.denominator = denominator / cd;
    }

    // Euclid's algorithm for calculating the greatest common divisor
    private int gcd(int a, int b) {
      // Note that the loop below, as-is, will time out on negative inputs.
      // The gcd should always be a positive number.
      // Add code here to pre-process the inputs so this doesn't happen.
        if( a < 0 ){
            a = a * - 1;
        }
    	while (a != b)
    	    if (a > b)
    		     a = a - b;
    	    else
    		     b = b - a;
    	return a;
    }

    public int compareTo(Rational other) {
        // Your code here
        int minuend, subtrahend, comparison;
        minuend = numerator * other.denominator;
        subtrahend = denominator * other.numerator;

        comparison = minuend - subtrahend;

        return comparison;
    }

    public boolean equals(Rational other) {
        // Your code here
        if ( (other.numerator == numerator) && (other.denominator == denominator) ){
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
    	String result;
    	if (denominator == 1) {
    	    // Your code here
            result = numerator + "";
    	} else {
    	    // Your code here
            result = numerator + "/" + denominator;
    	}
    	return result;
    }

}
