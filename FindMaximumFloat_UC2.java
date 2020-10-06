package Maximum;

public class FindMaximumFloat_UC2 {

	public static void testMaximum(Float a, Float b, Float c) {
		Float max = a;
		if (b.compareTo(max) > 0)
			max = b;
		if (c.compareTo(max) > 0)
			max = c;
		print(a, b, c, max);

	}

	private static void print(Float a, Float b, Float c, Float max) {
		// TODO Auto-generated method stub
		System.out.println("Value of a is :" + a);
		System.out.println("Value of b is :" + b);

		System.out.println("Value of c is :" + c);

		System.out.println("Maximum value is :" + max);

	}

	public static void main(String[] args) {
		Float a;
		Float b;
		Float c;

		// testcase1
		testMaximum(a = 50f, b = 20f, c = 10f);

		// testcase2
		testMaximum(a = 50f, b = 200f, c = 10f);

		// testcase3
		testMaximum(a = 50f, b = 20f, c = 150f);

	}
}
