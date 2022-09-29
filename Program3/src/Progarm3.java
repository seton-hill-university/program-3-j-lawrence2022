//Application: Program 3
//Name: Brad Messner 
//GitHub User: j-lawrence2022
//Date: Sep 29 2022
//Version: 1.0
//Description: loops
import java.util.Scanner;
public class Progarm3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		String name;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("What is your name?");
		name = keyboard.nextLine();
		
		do
		{
			System.out.print("Please enter a number between 0 and 100");
			number = keyboard.nextInt();
			
			if (number < 0 || number > 100);
			{
				System.out.println("The number" +number+ "is wrong");
				
			} 
			
		 {
				System.out.println("Thank you for your input" +name );
			}
			
		} while (number < 0 || number < 100);
		
		for(int x = number; x > 0; x--)
		{ 
			System.out.println("There are only" +x+ "seats left.");
			
			}
		}
			
			
			
		}

	


