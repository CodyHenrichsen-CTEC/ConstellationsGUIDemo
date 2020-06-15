import javax.swing.JOptionPane;

public class Popup
{
	public String askQuestion(String question)
	{
		String result = "" + JOptionPane.showInputDialog(null, question);
		
		return result;
	}
	
	public void displayMessage(String text)
	{
		JOptionPane.showMessageDialog(null, text);
	}

}
