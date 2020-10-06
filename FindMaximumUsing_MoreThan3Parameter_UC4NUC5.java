package Maximum;

import java.util.ArrayList;

public class FindMaximumUsing_MoreThan3Parameter_UC4NUC5 {

	
	public static <E extends Comparable<E>>   void testMaximum(E ...args) {
		System.out.println("argument length : " +args.length);
	ArrayList<E> arr = new ArrayList<>();
	for (E e : args)
	{
		arr.add(e);	}
	
	E max = arr.get(0);
	
		for (E e : args)
		{
			if(e.compareTo(max)>0)
				max = e;
		}
		 
		printMax(max);
		
	}

	private static<E> void printMax(E max) {
		// TODO Auto-generated method stub
		

		System.out.println("Maximum value is :" + max);

	}

	public static void main(String[] args) {
     Integer a,b,c,d,e;
     Float   x,y,z,l,m;
     String p,q,r,s,t;
     
     System.out.println("Printing  all values & maximum value for each case : ");
     
     testMaximum(a=50, b=10, c=7);
     testMaximum(a=5, b=10, c=7,d=60);
     testMaximum(a=5, b=10, c=70,d=60,e=8);

     System.out.println("    ");
     
     testMaximum(x=50f, y=10f, z=7f);
     testMaximum(x=50f, y=100f, z=7f,l=7f);
     testMaximum(x=50f, y=10f, z=700f,l=1000f,m=7f);
     
     System.out.println("     ");
     testMaximum(p="Peach", q="Apple", r="Banana");
     testMaximum(p="Apple", q="Peach", r="Banana",s="Zebra");
     testMaximum(p="Banana", q="Apple", r="Peach",s="Queen",t="King");



     

			}
}

