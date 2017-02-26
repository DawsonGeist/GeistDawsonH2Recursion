package hwTwo;
import java.util.*;
public class baboloni 
{
	
	
	public static void main(String[] args) 
	{
		double userFirstEntry=0;
		double userGivenError=0;;
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
		
		//testing the abylonian method
		System.out.println("the first guess is " + question1.generateFirstGuess(question1.originalValue));
		for(int i=1;i<=5;i++)
		{
			System.out.println("Guess " + i + "= "+ question1.updateEntry(question1.userEntry));
		}
	}

}
