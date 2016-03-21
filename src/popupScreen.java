import javax.swing.JOptionPane;
public class popupScreen {

	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("What is your name?");
		String drink = JOptionPane.showInputDialog("What would you like to drink?");
		JOptionPane.showMessageDialog(null, "Hello " + name + "! I'm sorry that I don't have " + drink);
		System.exit(0);
	}

}
