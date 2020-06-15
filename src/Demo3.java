import java.util.Scanner;

public class Demo3
{
	private Scanner textScanner;
	private Popup view;
	
	public Demo3()
	{
		textScanner = new Scanner(System.in);
		view = new Popup();
	}
	
	
	public void start()
	{
		interact();
	}

	
	private void interact()
	{
//		System.out.println("Hello, and welcome to the Constellations Center");
		view.displayMessage("Hello, and welcome to the Constellations Center");
		
//		System.out.println("We need to address systemic racism, sexism, and gender in CS");
		view.displayMessage("We need to address systemic racism, sexism, and gender in CS");
		
//		System.out.println("What is your first suggestion?");
		String response = view.askQuestion("What is your first suggestion?");
		
//		String answer = textScanner.nextLine();
		
//		System.out.println("I read that you said: " + answer + ". Thank you");
		view.displayMessage("I read that you said: " + response + ". Thank you");
	}
}
