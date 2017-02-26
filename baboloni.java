package hwTwo;
import java.util.*;
public class baboloni 
{
	
	
	public static void main(String[] args) 
	{
		double userFirstEntry=0;
		double userGivenError=0;
		double calculatedError=0;
		
		Scanner keyboard = new Scanner(System.in);
		//prompt user
		System.out.println("Please enter the value you want to find the square root of");
		//save answer and preserve it for later checking purposes
		System.out.print("Value: ");
		userFirstEntry = keyboard.nextDouble();
		if(userFirstEntry<0)
		{	
			do
			{
				System.out.println("Invalid input, input must be greater than 0");
				System.out.println("Please enter the value you want to find the square root of");
				System.out.print("Value: ");
				userFirstEntry = keyboard.nextDouble();
			}while(userFirstEntry<0);
		}
		 
		
		
		//prompt
		System.out.println("Please enter the percent for acceptable error");
		
		//fail safe
		if(keyboard.nextDouble()<0)
		{	
			do
			{
				System.out.println("Invalid input, input must be greater than 0");
				System.out.println("Please enter the percent for acceptable error");
				userGivenError = keyboard.nextDouble();
			}while(userFirstEntry<0);
		}
		
		
		keyboard.close();
		rootFinder question1 = new rootFinder(userFirstEntry,userGivenError);
		// fixing the loop is the last improvement needed to be made
		question1.calculateRoot();
		
		System.out.println("The calculated root is: "+ question1.userEntry );
		System.out.println("The error is " + question1.calculateError()+"%");
	}

}
