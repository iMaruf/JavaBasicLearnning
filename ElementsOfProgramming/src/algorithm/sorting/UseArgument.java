package algorithm.sorting;


public class UseArgument {

	public static void main(String[] args) {
		System.out.print("Hi, ");
		//System.out.print(args[1]);
		System.out.println(". How are you?");
		
		int[] data={8,5,13,528,8};
		bubbleSortForInts(data);
		for (int d : data) {
			System.out.println(d);
		}
		
		}


	// Bubble sort that will take an array of integer values, sort them in
	// ascending order.
	public static void bubbleSortForInts(int[] p) {
		for (int i = 1; i < p.length; i++) {
			for (int j = 0; j < (p.length - i); j++) {
				if (p[j] > p[j + 1]) {
					int temp = p[j + 1];
					p[j + 1] = p[j];
					p[j] = temp;

				}
			}
		}
	}
}
