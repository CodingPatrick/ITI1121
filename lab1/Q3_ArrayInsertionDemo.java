// Question 3.3

public class Q3_ArrayInsertionDemo{

	public static int[] insertIntoArray(int[] beforeArray, int indexToInsert, int valueToInsert){
		// Your code here

		int[] afterInsert;
		afterInsert = new int[(beforeArray.length + 1)];

		for(int i = 0; i < (beforeArray.length + 1); i++){
			if(i < indexToInsert){
				afterInsert[i] = beforeArray[i];
			} else if(i == indexToInsert){
				afterInsert[i] = valueToInsert;
			} else{
				afterInsert[i] = beforeArray[i - 1];
			}
		}

		return afterInsert;

	}

	public static void main(String[] args){
		// Your code here

		// Printing the Array before the insertion
		int[] beforeArray;
		beforeArray = new int[]{1,5,4,7,9,6};
		System.out.println("Array before insertion: ");
		for(int i = 0; i < beforeArray.length; i++){
			System.out.println(beforeArray[i]);
		}

		// The value and the index of what will be inserted
		int indexToInsert = 3;
		int valueToInsert = 15;
		
		// Calling the function to insert the new value
		int[] afterInsert;
		afterInsert = insertIntoArray(beforeArray, indexToInsert, valueToInsert);

		// Printing the new Array after the insertion
		System.out.println("Array after insertion of " + valueToInsert + " at position " + indexToInsert + ":");
		for(int i = 0; i < afterInsert.length; i++){
			System.out.println(afterInsert[i]);
		}

	}

}