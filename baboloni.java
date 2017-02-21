package hwTwo;

public class baboloni 
{
	//the variable containing the original statement x/2
	private static float dummyGuess;
	
	//the number being square rooted
	private static float userEntry;
	
	//variable that holds the calculated root
	private static float calculatedAnswer;
	
	//error allowed
	private static double error;
	
	//percent error between dummmyGuess^2 and userEntry
	private static double calculatedError;
	
	
	//user Entry = the calculated root^2
	//use that to derive the threshold for error
	public static float babyRoot(float entry, double tollerance)
	{
		dummyGuess= entry/2;
		System.out.print("dummyGuess is "+dummyGuess);
		calculatedError = entry - (Math.pow(dummyGuess,2));
		System.out.print("calculatedError is "+calculatedError);
		
		//too much error present
		if(tollerance<calculatedError)
		{
			//(1/2 * guess + userEntry/guess) Babylons method
			calculatedAnswer = (float) (.5*(dummyGuess+entry/dummyGuess));
			System.out.println(calculatedAnswer);
			return babyRoot(calculatedAnswer,error);
		}
		else
		{
			return calculatedAnswer;
		}
		
	}
	
	public static void main(String[] args) 
	{
		userEntry = 25;
		error = 0;
		System.out.println(babyRoot(userEntry,error));

	}

}
