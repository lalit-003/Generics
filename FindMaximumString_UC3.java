package Maximum;

public class FindMaximumString_UC3 {

	public static void testMaximum(String a, String b, String c) {
		String max = a;
		if (b.compareTo(max) > 0)
			max = b;
		if (c.compareTo(max) > 0)
			max = c;
		print(a, b, c, max);

	}

	private static void print(String a, String b, String c, String max) {
		// TODO Auto-generated method stub
		System.out.println("Value of a is :" + a);
		System.out.println("Value of b is :" + b);

		System.out.println("Value of c is :" + c);

		System.out.println("Maximum value is :" + max);

	}

	public static void main(String[] args) {
		String a;
		String b;
		String c;

		// testcase1
		testMaximum(a = "Peach", b = "Apple", c = "Banana");

		// testcase2
		testMaximum(a = "Apple", b = "Peach", c = "Banana");

		// testcase3
		testMaximum(a = "Apple", b = "Banan", c = "Peach");

	}
}
