// TODO Auto-generated method stub
		//Application: Program 3
		//Name: Brad Messner 
		//GitHub User: j-lawrence2022
		//Date: Sep 29 2022
		//Version: 1.0
		//Description: loops
import java.util.Scanner;
public class Program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		
		String name;
Scanner keyboard = new Scanner(System.in);

System.out.println("What is your name?");
name = keyboard.nextLine();

do 
	
{
	System.out.println("Please pick a number somewhere between 0 and 100");
	int number1 = keyboard.nextInt();
	
	if (number1 < 0 || number1 < 100)
	{
		System.out.println( "This number is the wrong input");
	
	}
	
	else
		
	{
		System.out.println("Thank you for your input" +name );
	}

} while (number1 < 0 || number1 > 100);

for (int i = number; i>0; i-- );

{ System.out.println("I am sorry there is still " +i+ "minutes left");

}
}

	}

}
