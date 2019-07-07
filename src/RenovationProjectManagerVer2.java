import javax.swing.JOptionPane;

public class RenovationProjectManagerVer2 {

//	public int menuChoice() { //a method that determines which option the user wants to choose.
//		int selection; //initialising selection variable
//		selection = Integer.parseInt(JOptionPane //selection is now whatever the user assigns
//				.showInputDialog("1. Calculate paint requred for a wall.\n 2. Calculate paint requried for project."));
//		return selection;//this is returned to the main method.
//	}

	public void showString(String message) {//show's the message
		JOptionPane.showMessageDialog(null, message);
	}
	
	public double wallCalculation(double val1, double val2, double val3 ) { //method to calculate user entered variables
		double wallCost = val3*(val1*val2);
		return wallCost;
	}
	
	public double costPerSqm() {
		double costPerSqm = Double.parseDouble(JOptionPane.showInputDialog("Please enter cost per sq.m ($)"));
		return  costPerSqm;
	}
	
	public double height() {
		double height = Double.parseDouble(JOptionPane.showInputDialog("Please wall height (m)"));
		return height;
	}
	
	public double length() {
		double length = Double.parseDouble(JOptionPane.showInputDialog("Enter wall length (m)"));
		return length;
	}
	
	public int menuOption(int val1, int val2, int val3) {
		int selection; 
		selection = Integer.parseInt(JOptionPane //selection is now whatever the user assigns
				.showInputDialog("1. Calculate paint requred for a wall.\n 2. Calculate paint requried for project."));
		if (selection == 1) {
			return val1;
		} else if (selection == 2){
			return val2;
		} else { 
		return 0;
		}
	}

	public static void main(String[] args) {
		
		RenovationProjectManagerVer2 obj = new RenovationProjectManagerVer2();
		double a1 = obj.height();
		double a2 = obj.length();
		double paintCost = obj.costPerSqm();
		double calculation = obj.wallCalculation (a1, a2, paintCost);
		
		obj.showString("It will cost $" + calculation + ", you lucky sonofabitch");
		}
	}
