public class Geometric extends AbstractSeries {

    // instance variables
    double n = -1;
    double total = 0;
    
    public double next() {
        // implement the method

        total = total + Series();
        return total;
    }

    public double Series() {
    	n = n + 1;
        return ( 1 / ( Math.pow(2, n) ) );
    }
}