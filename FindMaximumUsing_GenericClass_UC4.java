package Maximum;

public class FindMaximumUsing_GenericClass_UC4 <T extends Comparable<T>>{

	T a,b,c;

	public FindMaximumUsing_GenericClass_UC4(T a, T b, T c) {
		this.a = b;
		this.b = b;
		this.c = c;
		testMaximum(a, b, c);
	}

	public static <E extends Comparable<E>>   void testMaximum(E a,E b,E c) {
		E max = a;
		if (b.compareTo(max) > 0)
			max = b;
		if (c.compareTo(max) > 0)
			max = c;
		printMax(a, b, c, max);

	}

	private static<E> void printMax(E a ,E b,E c,E max) {
		// TODO Auto-generated method stub
		System.out.println("Value of a is :" + a);
		System.out.println("Value of b is :" + b);

		System.out.println("Value of c is :" + c);

		System.out.println("Maximum value is :" + max);

	}

	public static void main(String[] args) {
     Integer a,b,c;
     Float   x,y,z;
     String p,q,r;
     
     System.out.println("Printing  all values & maximum value for each case : ");
     
     new FindMaximumUsing_GenericClass_UC4<Integer>(a=50, b=10, c=7);
     new FindMaximumUsing_GenericClass_UC4<Integer>(a=5, b=10, c=7);
     new FindMaximumUsing_GenericClass_UC4<Integer>(a=5, b=10, c=70);

     System.out.println("    ");
     
     new FindMaximumUsing_GenericClass_UC4<Float>(x=50f, y=10f, z=7f);
     new FindMaximumUsing_GenericClass_UC4<Float>(x=50f, y=100f, z=7f);
     new FindMaximumUsing_GenericClass_UC4<Float>(x=50f, y=10f, z=700f);
     
     System.out.println("     ");
     new FindMaximumUsing_GenericClass_UC4<String>(p="Peach", q="Apple", r="Banana");
     new FindMaximumUsing_GenericClass_UC4<String>(p="Apple", q="Peach", r="Banana");
     new FindMaximumUsing_GenericClass_UC4<String>(p="Banana", q="Apple", r="Peach");



     

			}
}
