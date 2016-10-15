package programmingInJava;

public class Transition {

	public static void main(String[] args) {
		int n = StdIn.readInt();
		int[][] counts = new int[n][n];
		int[] outDegree = new int[n];

		while (!StdIn.isEmpty()) {
			int i = StdIn.readInt();
			int j = StdIn.readInt();
			outDegree[i]++;
			counts[i][j]++;
		}
		StdOut.println(n + " " + n);

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				double p = 0.90 * counts[i][j] / outDegree[i] + 0.10 / n;
				StdOut.printf("%7.5f ", p);
			}
			StdOut.println();
		}
	}

}
