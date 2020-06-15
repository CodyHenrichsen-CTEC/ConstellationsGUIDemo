import java.util.Scanner;

public class Demo2
{
	private Scanner textScanner;
	private Popup view;
	
	public Demo2()
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
		
		response = view.askQuestion("How silly should we be: Type in a number");
		
		while (!validateInt(response))
		{
			view.displayMessage("Keep trying to use a number");
		}
		
		int loop = Integer.parseInt(response);
		
		for (int index = 0; index < loop; index++)
		{
			view.displayMessage("This is the " + index + "st/nd/rd/th iteration");
		}
		
	}
	
	private boolean validateInt(String text)
	{
		boolean isValid = false;
		
		try
		{
			Integer.parseInt(text);
			isValid = true;
		}
		catch(NumberFormatException error)
		{
			view.displayMessage("Try using an integer value");
		}
		
		return isValid;
	}
	
	private boolean validateDouble(String text)
	{
		boolean isValid = false;
		
		try
		{
			Double.parseDouble(text);
			isValid = true;
		}
		catch(NumberFormatException error)
		{
			view.displayMessage("Try using an double value");
		}
		
		return isValid;
	}
	
	
}
