import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Class2 {

	public void SmallestNumber(List<Integer> myNumbers)
	{
		Iterator<Integer> myIterator = myNumbers.iterator(); 
		int currentNumber = 0;
		int smallestNumber = 100; 
		while (myIterator.hasNext())
		{
			currentNumber = myIterator.next();
			if (currentNumber <= smallestNumber)
			{
				smallestNumber = currentNumber;
			}
					
		}
		System.out.println("----Exercise 5----");
		System.out.println("The smallest Number is: " +smallestNumber);
		
	}
	
	public void HashMapTest () {
		Map<String, Integer> MyHashMap = new HashMap<>();;
		
		MyHashMap.put("Juan", 50);
		MyHashMap.put("Diana", 22);
		MyHashMap.put("Eneida", 28);
		MyHashMap.put("Pedro", 10);
		
		System.out.println("----Exercise 6----");
		for (Map.Entry<String, Integer> CurrentEntry : MyHashMap.entrySet())
		{
			System.out.println(CurrentEntry.getKey()  + " " + CurrentEntry.getValue() );
			
		}
	}

}
