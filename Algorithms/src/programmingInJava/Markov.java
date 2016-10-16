package programmingInJava;

public class Markov {

	public static void main(String[] args) {
		int trials = Integer.parseInt(args[0]);
		int n = StdIn.readInt();
		StdIn.readInt();

		double[][] p = new double[n][n];
		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++)
				p[i][j] = StdIn.readDouble();

		double[] rank = new double[n];
		rank[0] = 1.0;
		for (int t = 0; t < trials; t++) {

			double[] newRank = new double[n];
			for (int j = 0; j < n; j++) {
				for (int k = 0; k < n; k++)
					newRank[j] += rank[k] * p[k][j];
			}
			rank = newRank;
		}
		for (int i = 0; i < n; i++) {
			StdOut.printf("%8.5f", rank[i]);
		}
		StdOut.println();

		StdOut.println();

		for (int i = 0; i < n; i++) {
			StdOut.printf("%2d %5.3f\n", i, rank[i]);
		}
	}

}
