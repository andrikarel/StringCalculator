package is.ru.stringcalculator;

public class Calculator 
{

	public static int add(String text)
	{
		if(text.equals(""))
		{
			return 0;
		}
			
		else if(text.contains(","))
		{
			String[] numbers = text.split(",");
			
			return sumOfNums(numbers);
		}

		else
			return 1;
			
	}

	private static int sumOfNums(String[] numbers)
	{
		int sum = 0;
		for(String nums : numbers)
			{
				sum += Integer.parseInt(nums);
			}
		return sum;
	}

	



}