package hwTwo;
import java.util.*;
public class baboloni 
{
	private static double userFirstEntry;
	private static double userGivenError;
	private static double calculatedError;
	private static double developingAnswer;
	private static boolean stopLoop = false;
	
	
	
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		//prompt user
		System.out.println("Please enter the value you want to find the square root of");
		//save answer and preserve it for later checking purposes
		System.out.print("Value: ");
		userFirstEntry = keyboard.nextDouble();
		//after the user hits enter it will display Value: x
		System.out.print(userFirstEntry+"\n");
		System.out.println("Please enter the percent for acceptable error");
		userGivenError = keyboard.nextDouble();

		//this is the first value entered
		developingAnswer/=2;
		
		//start the Babylonian Method
		do
		{
		//call rootFinder - updates developing answer
			//test return value to see if it is less than userGivenError
				//if true stopLoop = true
				//if false do nothing
					//loop restarts with the developing answer updated
		}while(!stopLoop);
		
	}

}
