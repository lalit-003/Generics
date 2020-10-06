package Maximum;

public class FindMaximumInterger_UC1 {

	public static void testMaximum(Integer a, Integer b, Integer c) {
		Integer max = a;
		if (b.compareTo(max) > 0)
			max = b;
		if (c.compareTo(max) > 0)
			max = c;
		print(a, b, c, max);

	}

	private static void print(Integer a, Integer b, Integer c, Integer max) {
		// TODO Auto-generated method stub
		System.out.println("Value of a is :" + a);
		System.out.println("Value of b is :" + b);

		System.out.println("Value of c is :" + c);

		System.out.println("Maximum value is :" + max);

	}

	public static void main(String[] args) {
		Integer a;
		Integer b;
		Integer c;

		// testcase1
		testMaximum(a = 5, b = 2, c = 1);

		// testcase2
		testMaximum(a = 5, b = 10, c = 1);

		// testcase3
		testMaximum(a = 5, b = 2, c = 15);

	}
}
