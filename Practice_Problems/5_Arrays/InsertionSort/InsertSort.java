public class InsertSort {
	public static int COMPCOUNT;
	public static void main(String[] args) {
		int[] size100 = new int[100];
		int n;
		
		for (n = 0; n < 100; ++n) {
			size100[n] = (int)(Math.random() * 100);
		}
		InsertionSort(size100);
		
		int[] size1000 = new int[1000];
		
		for (n = 0; n < 1000; ++n) {
			size1000[n] = (int)(Math.random() * 1000);
		}
		InsertionSort(size1000);
		int[] size10000 = new int[10000];
		
		for (n = 0; n < 10000; ++n) {
			size10000[n] = (int)(Math.random() * 10000);
		}
		InsertionSort(size10000);
		}

	public static void InsertionSort(int[] input) {
		int i;
		int index;
		COMPCOUNT = 0;	// reset the counter every time when executing the new array.
		System.out.print(input.length + "\n");
		
		for (index = 0; index < input.length - 1; ++index) {
			for (i = index + 1; i > 0; --i) {
				if(SMALLER(input, i - 1, i))
					break;
				int temp = input[i];
				input[i] = input[i - 1];
				input[i - 1] = temp;
			}
		}
	System.out.print(COMPCOUNT + "\n");
}

	public static Boolean SMALLER(int[] A, int i, int j) {
		++COMPCOUNT;
		if(A[i] < A[j])
			return true;
		else
			return false;
	}
}
