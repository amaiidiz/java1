import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Class1 
{
	public String Comparison (String word1, String word2) 
	{
		if (word1.equals(word2))
			return "Words are the same";
		else 
			return "Words are different";
	}
	
	public void BiggestNumber(List<Integer> myNumbers)
	{
		Iterator<Integer> myIterator = myNumbers.iterator(); 
		int currentNumber = 0;
		int biggestNumber = 0;
		while (myIterator.hasNext())
		{
			currentNumber = myIterator.next();
			if (currentNumber >= biggestNumber)
			{
				biggestNumber = currentNumber;
			}
					
		}
		System.out.println("----Exercise 2----");
		System.out.println("The biggest Number is: " +biggestNumber);
	}
	
	public void SortAsc (String[] myWords)
	{
		String[] s = myWords;
		Arrays.sort(s, Comparator.naturalOrder());
		System.out.println("----Exercise 3----");
		System.out.println("Ascending order: " + Arrays.toString(s));		
	}
	
	public void SortDesc(String[] myWords)
	{
		String[] s = myWords;
		Arrays.sort(s, Comparator.reverseOrder());
		System.out.println("----Exercise 4----");
		System.out.println("Descending order: " + Arrays.toString(s));
	}
}
