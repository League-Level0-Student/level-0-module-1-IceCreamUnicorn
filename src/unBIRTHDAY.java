import javax.swing.JOptionPane;
public class unBIRTHDAY {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = JOptionPane.showInputDialog("What is your birthday in mm/dd");
		if(input.equals("9/9")) 
		{
			JOptionPane.showMessageDialog(null, "Happy Birthday!");
		}
		else
		{
			JOptionPane.showMessageDialog(null, "I wish you a very merry UNbirthday!");
		}
	}

}
