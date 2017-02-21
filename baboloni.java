package hwTwo;

public class baboloni 
{
	//the variable containing the original statement x/2
	private static float dummyGuess;
	//the number being square rooted
	private static float userEntry;
	//error allowed
	private static double error;
	//percent error between dummmyGuess^2 and userEntry
	private static double calculatedError;
	
	//user Entry = the calculated root^2
	//use that to derive the threshold for error
	public static float babyRoot(float entry, double tollerance)
	{
		dummyGuess= entry/2;
		calculatedError = (Math.pow(dummyGuess,2)) - entry;
		
		//too much error present
		if(tollerance<calculatedError)
		{
			//(1/2 * guess + userEntry/guess) Babs method
			dummyGuess = (float) (.5*(dummyGuess+entry/dummyGuess));
			return babyRoot(dummyGuess,error);
		}
		else
		{
			return dummyGuess;
		}
		
	}
	
	public static void main(String[] args) 
	{
		userEntry = 125348;
		error = .90;
		System.out.println(babyRoot(userEntry,error));

	}

}
