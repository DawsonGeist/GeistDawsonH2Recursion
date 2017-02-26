package hwTwo;

public class rootFinder 
{
	private double userEntry;
	private double userError;
	private double calculatedError;
	private double originalValue;
	
	public rootFinder(double entry, double error)
	{
		userEntry = entry;
		originalValue = entry;
		userError = calculatedError;
	}
	
	public double updateEntry(double value)
	{
		//1/2(guess+OriginalValue/guess)
		
		value+=originalValue/value;
		value/=2;
		userEntry = value;
		return userEntry;
	}

	
	public double generateFirstGuess(double entry)
	{
		userEntry=entry/2;
		
		if((Math.pow(userEntry, 2))>entry)
		{
			do
			{
				userEntry--;
			}while(Math.pow(userEntry, 2)>entry);
			return userEntry;
		}
		else
		{
		return userEntry;
		}
	}

}
