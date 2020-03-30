// Question 3.1

public class Q3_SquareArray {

	public static int[] createArray(int size) {
		// Your code here
		int[] anArray;
		anArray = new int[size];
		for(int i = 0; i < anArray.length; i++){
			anArray[i] = i * i;
		}
		return anArray;
	}

	public static void main(String[] args) {
		// Your code here
		int[] arrayToPrint = createArray(13);
		for(int i = 0; i <arrayToPrint.length; i++){
			System.out.println("The square of " + i + " is: " + arrayToPrint[i]);
		}
	}

}