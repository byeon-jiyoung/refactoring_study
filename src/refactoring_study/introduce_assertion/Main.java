package refactoring_study.introduce_assertion;

import java.util.Random;

public class Main {
	private static final Random rnd = new Random(1234);

	public static void main(String[] args) {
		execute(10);
		execute(10);
		execute(10);
		execute(10);
		execute(10);
	}

	private static void execute(int length) {
		int[] data = new int[length];
		for (int i = 0; i < data.length; i++) {
			data[i] = rnd.nextInt(data.length);
		}

		SortSample sorter = new SortSample(data);
		System.out.printf("%6s : %s%n", "BEFORE", sorter);

		sorter.sort();
		System.out.printf("%6s : %s%n", "AFTER", sorter);

		System.out.println();
	}

}
