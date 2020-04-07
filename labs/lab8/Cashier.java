public class Cashier {

	private Queue<Customer> queue;
	private Customer currentCustomer;
	private int totalCustomerWaitTime;
	private int customersServed;
	private int totalItemsServed;


	public Cashier() {
		queue = new ArrayQueue<Customer>();
		currentCustomer = null;
		totalCustomerWaitTime = 0;
		customersServed = 0;
		totalItemsServed = 0;
	}

	public void addCustomer(Customer c) {
		queue.enqueue(c);
	}

	public int getQueueSize() {
		return queue.size();
	}

	public void serveCustomers(int currentTime) {

		if (currentCustomer == null && getQueueSize() == 0){
			return;
    	}
    	else if (currentCustomer != null) {
    		if (currentCustomer.getNumberOfItems() == 0 && ! queue.isEmpty()) {
    			currentCustomer = queue.dequeue();
            	totalCustomerWaitTime = totalCustomerWaitTime + (currentTime - currentCustomer.getArrivalTime());
            	currentCustomer.serve();
            	customersServed = customersServed + 1;
            	totalItemsServed = totalItemsServed + 1;
    		}
    		else {
    			currentCustomer.serve();
    			totalItemsServed = totalItemsServed + 1;
    		}
    	}
    	else {
    		currentCustomer = queue.dequeue();
    		totalCustomerWaitTime = totalCustomerWaitTime + (currentTime - currentCustomer.getArrivalTime());
    		currentCustomer.serve();
    		customersServed = customersServed + 1;
    		totalItemsServed = totalItemsServed + 1;
    	}
    }

	public int getTotalCustomerWaitTime() {
		return totalCustomerWaitTime;
	}

	public int getTotalCustomersServed() {
		return customersServed;
	}

	public int getTotalItemsServed() {
		return totalItemsServed;
	}
	
	public String toString(){
		return "The total number of customers served is: " + customersServed + 
				"\nThe total number of items served is: " + totalItemsServed +
				"\nThe total customer wait time is: " + totalCustomerWaitTime;
	}

}
