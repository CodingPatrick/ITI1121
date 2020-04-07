public class Arithmetic extends AbstractSeries {

    // instance variables
    double n = 0;
    double total = 0;

    public double next() {
        // implement the method
        
        total = total + Series();
        return total;
    }

    public double Series() {
    	n = n + 1;
    	return n;
    }

}