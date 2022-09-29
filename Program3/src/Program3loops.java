




import java.util.Scanner;
public class Program3loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i = 0;

Scanner keyboard = new Scanner(System.in);

System.out.print("What is your name?");
String name = keyboard.next();

System.out.print("Please submit a number between 0-100");
int num = keyboard.nextInt();

while(i==0) {
	
	if(num >=0 && num<=100){
		System.out.println("Thank you for the input " +name);
		
		
	}
		else {
			
			System.out.println("Invalid Input.");
	        System.out.print("Please enter a number between 0-100: ");
	        num = sc.nextInt();
	        
		
	
	System.out.println("countdown begins:");
	
	for(int j=num; j==0; j--) {
		
		System.out.println(j+ " seconds to go ");
		j--;
	}
		}
	System.out.println("Countdown Ended");
	{
	
	
		}
	}
}

	}


