import java.util.Scanner;

public class Demo
{
	private Scanner textScanner;
	
	public Demo()
	{
		textScanner = new Scanner(System.in);
	}
	
	
	public void start()
	{
		interact();
	}

	
	private void interact()
	{
		System.out.println("Hello, and welcome to the Constellations Center");
		System.out.println("We need to address systemic racism, sexism, and gender in CS");
		System.out.println("What is your first suggestion?");
		
		String answer = textScanner.nextLine();
		
		System.out.println("I read that you said: " + answer + ". Thank you");
		
	}
}
