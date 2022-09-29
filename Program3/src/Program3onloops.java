//Application: Program 3
//Name: Brad Messner 
//GitHub User: j-lawrence2022
//Date: Sep 29 2022
//Version: 1.0
//Description: loops
import  java.util.Scanner;
public class Program3onloops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner keyboard = new Scanner(System.in);
		
		//Collect input from user.
		System.out.print("name:");
		String name = keyboard.nextLine();
		
		System.out.println("Submit a number between 0 and 100");
	int number = keyboard.nextInt();
		
		//check if given input is between 0 and 100

	while(number<0 || number>100 )
	{
	System.out.println("Please submit another number this one is not between 0 and 100.");
	number = keyboard.nextInt();
	} 
	
	//Thank user for input 
	System.out.println("Thank you for the input " +name+ " and this inout is the number of berries that will be eaten.");
	
	// Count down the input to zero
	for(int x = number; x>=0; x-- ) {
	System.out.println("There are " +x+ " berries left to be eaten");
	}
	System.out.println("There are no more berries left to be eaten.");	
		
		
	}

}
