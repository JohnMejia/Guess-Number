
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) 
	{
		System.out.println("Guess the number I'm thinking of.It's between 1-100");
		Scanner tKeyboard = new Scanner(System.in);
		int i = 15;
		int tInput = 0; 

		do
		{
			tInput = tKeyboard.nextInt();

			if (tInput > i)
			{
				System.out.println("Lower.");
			}
			else if( tInput < i)
			{
				System.out.println("Higher.");
			}
		}while(tInput != i);
		System.out.println("You've guessed it!");

	}

}