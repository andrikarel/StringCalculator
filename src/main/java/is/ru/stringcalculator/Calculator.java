package is.ru.stringcalculator;
import java.util.*;

public class Calculator 
{

	public static int add(String text)
	{
		if(text.equals(""))
		{
			return 0;
		}
			
		else if(text.contains(",") || text.contains("n"))
		{
			String[] numbers = text.split(",|\n");
			testIfNeg(numbers);
			
			return sumOfNums(numbers);
		}

		else
			return 1;
			
	}
	private static void testIfNeg(String[] numbers)
	{
		List<String> negs = new ArrayList<String>();
		for(String num : numbers)
			{
				if(Integer.parseInt(num) < 0)
				{
					negs.add(num);
				}

			}
			
			if(!negs.isEmpty())
			{
				throw new IllegalArgumentException("Negatives not allowed: " + numbers);

			}
	}

	private static int sumOfNums(String[] numbers)
	{
		int sum = 0;
		for(String nums : numbers)
			{	
				if(Integer.parseInt(nums) <= 1000)
				{
					sum += Integer.parseInt(nums);
				}
				
			}
		return sum;
	}

	



}