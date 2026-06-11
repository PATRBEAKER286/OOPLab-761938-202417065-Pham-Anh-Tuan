package hust.soict.dsai.lab01;

import javax.swing.JOptionPane;
public class ShowTwoNumbers{
      public static void main(String[] args){
	String strNum1, strNum2;
	String strNotification = "You'vs just entered: ";
	strNum1 = JOptionPane.showInputDialog(null,
			"please input the fisrt number:", "input the first number", JOptionPane.INFORMATION_MESSAGE);
	strNotification += strNum1 + " and ";
	strNum2 = JOptionPane.showInputDialog(null,
			"please input the second number:", "input the second number", JOptionPane.INFORMATION_MESSAGE);
	strNotification += strNum2;
	JOptionPane.showMessageDialog(null,strNotification,
			"Show two numbers", JOptionPane.INFORMATION_MESSAGE);
	System.exit(0);
      }
}