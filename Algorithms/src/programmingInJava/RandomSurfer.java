package programmingInJava;


public class RandomSurfer {
	
	public static void main(String[] args) {
		int trials = Integer.parseInt(args[0]);
		int m = StdIn.readInt();
		int n = StdIn.readInt();
		if (n != n) throw new RuntimeException("m does not equel n");
		
		double[][] p = new double[n][n];
		for (int i = 0; i < n; i++)
			for (int j =0; j < n; j++)
				p[i][j] = StdIn.readDouble();
		
		int[] freq = new int[n];
		
		int page = 0;
		
		for (int t = 0; t < trials; t++) {
			double r = Math.random();
			double sum = 0.0;
			for (int j = 0; j < n; j++) {
				sum += p[page][j];
				if (r < sum) {
					page = j;
					break;
				}
			}
			freq[page]++;
		}
		for (int i = 0; i < n; i++) {
			StdOut.printf("%8.5f", (double) freq[i] / trials);
		}
		StdOut.println();
	}

}
