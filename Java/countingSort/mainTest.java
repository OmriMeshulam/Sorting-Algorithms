import java.util.Random;

public class mainTest {

    public static void main(String[] args) {
        testDrive();
    }
    
    public static void testDrive(){
    	int arraySize = 20;
    	int [] iArray = new int [arraySize];
    	Random randomGenerator = new Random();
    	
    	System.out.print("The unsorted array: ");
    	for (int i = 0; i < arraySize; i++){
    		iArray[i] = randomGenerator.nextInt(100);
    		System.out.print((iArray[i]) + " ");
    	}
    	
    	// Figuring min and max
    	int min = iArray[0];
    	int max = iArray[0];
    	for (int i = 0; i < iArray.length - 1; i++){
    	    if (iArray[i] < min){
    	    	min = iArray[i];
    	    }
    	}
    	for (int i = 0; i < iArray.length - 1; i++){
    	    if (iArray[i] > max){
    	    	max = iArray[i];
    	    }
    	}
    	System.out.println("min: " + min + " max: " + max);
    	
    	countingSort.countingSort(iArray,min,max);
    	System.out.print("\nThe sorted array: ");
    	for (int i = 0; i < arraySize - 1; i++){
    		System.out.print((iArray[i]) + " ");
    	}
    }

}