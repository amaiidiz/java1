import java.util.ArrayList;
import java.util.List;

public class Exercise2 {
	
	public static void main (String args[])
	{
		Class2 MyProgram = new Class2();
		List<Integer> misNumeros = new ArrayList <Integer> ();
			misNumeros.add(4);
			misNumeros.add(5);
			misNumeros.add(6);
			misNumeros.add(10);
			misNumeros.add(34);
			misNumeros.add(8);
			
			MyProgram.SmallestNumber(misNumeros);
			
			
	}
}
