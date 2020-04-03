import java.util.ArrayList;
import java.util.List;

public class Exercise1 {
	
	public static void main (String args[])
	{
		Class1 MyProgram = new Class1();
		System.out.println("----Exercise 1----");
		System.out.println(MyProgram.Comparison("eneida", "sanchez"));
		System.out.println(MyProgram.Comparison("eneida", "eneida"));
		
		List<Integer> misNumeros = new ArrayList <Integer> ();
			misNumeros.add(4);
			misNumeros.add(5);
			misNumeros.add(6);
			misNumeros.add(10);
			misNumeros.add(34);
			misNumeros.add(8);
			
		MyProgram.BiggestNumber(misNumeros);
		
		String[] myWords = { "Eneida", "Andreyna", "Juan", "Pedro", "America" };
			
		MyProgram.SortAsc(myWords);
		MyProgram.SortDesc(myWords);
		
		
		Class2 MyProgram2 = new Class2();
		List<Integer> misNumeros2 = new ArrayList <Integer> ();
			misNumeros2.add(4);
			misNumeros2.add(5);
			misNumeros2.add(6);
			misNumeros2.add(10);
			misNumeros2.add(34);
			misNumeros2.add(8);
			
			MyProgram2.SmallestNumber(misNumeros);
			
			MyProgram2.HashMapTest();
			
	}


}
