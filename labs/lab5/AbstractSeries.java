public abstract class AbstractSeries implements Series {

    public double[] take(int k) {
        // implement the method
        double[] theSeries = new double[k];

    	for( int i = 0; i < theSeries.length; i++){
    		theSeries[i] = next();
    	}
    	return theSeries;
    }

    public double next() {
    	return 0;
    }

}