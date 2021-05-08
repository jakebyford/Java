
import java.util.Arrays;

public class Sort {
	public static int COMPCOUNT;

	public static void main(String[] args) {
	int[] temp = new int[32];
	int n;

	for (n = 0; n < 32; ++n) {
		temp[n] = 32 - n;
	}
	InsertionSort(temp);	// Execute with the worst – case data
	
	for (n = 0; n < 32; ++n) {
		temp[n] = n + 1;
	}
	InsertionSort(temp);	// Execute with the best – case data
	for (n = 0; n < 32; ++n) {
		temp[n] = (int)(Math.random() * 100);
	}
	InsertionSort(temp);	// Execute with the random data.
	}

	public static void InsertionSort(int[] input) {
		int i;
		int index;
		COMPCOUNT = 0;	// reset the counter every time when executing the new array.
		System.out.print(input.length + "\n" + Arrays.toString(input) + "\n");
		
		for (index = 0; index < input.length - 1; ++index) {
			for (i = index + 1; i > 0; --i) {
				if(SMALLER(input, i - 1, i)) {
				break;
				}
			int temp = input[i];
			input[i] = input[i - 1];
			input[i - 1] = temp;
		}
	}
	System.out.print(Arrays.toString(input) + "\n" + COMPCOUNT + "\n");
}

	public static Boolean SMALLER(int[] A, int i, int j) {
		++COMPCOUNT;
		if(A[i] < A[j])
			return true;
		else {
			return false;
		}
	}
}
