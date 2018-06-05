import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculator {

	private JFrame frame;
	private JTextField textField1;
	private JTextField textField2;
	private JTextField textFieldansw;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 455, 236);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField1 = new JTextField();
		textField1.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField1.setBounds(21, 24, 128, 48);
		frame.getContentPane().add(textField1);
		textField1.setColumns(10);
		textField1.setToolTipText("Please enter your number here"); 
		//hmm i can set html for tooltip. 
		//textField.setToolTipText("<html><b><font color=red>"   + "Please enter your number here" + "</font></b></html>");
		
		textField2 = new JTextField();
		textField2.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField2.setBounds(176, 24, 128, 48);
		frame.getContentPane().add(textField2);
		textField2.setColumns(10);
		textField2.setToolTipText("Please enter your number here");
		
		textFieldansw = new JTextField();
		textFieldansw.setFont(new Font("Tahoma", Font.BOLD, 14));
		textFieldansw.setBounds(176, 128, 128, 48);
		frame.getContentPane().add(textFieldansw);
		textFieldansw.setColumns(10);
		textFieldansw.setEditable(false);
		
		JLabel lblNewLabel = new JLabel("Answer: ");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel.setBounds(62, 145, 87, 31);
		frame.getContentPane().add(lblNewLabel);
		
		JButton buttonSum = new JButton("+");
		buttonSum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					//oke let's assign value from textfield to variables
					double num1,num2,answ;					
					num1=Double.parseDouble(textField1.getText());
					num2=Double.parseDouble(textField2.getText());
					answ=num1+num2;
					textFieldansw.setText(Double.toString(answ));
					//let's try ternary here | didn't worked here for now.
					//var =(answ % 2 ==0) ? case1 : case2;
					/*if (answ % 2 != 0) {
						textFieldansw.setText(Double.toString(answ));}
						else {
							a = (int) answ;
							textFieldansw.setText(Integer.toString(a));}	*notifyAll();
							I simply wanted to drop down this .0 in answer...*/				
				}
				catch(Exception e1){
					JOptionPane.showMessageDialog(null,"Enter valid number or fill field with number");
					
				}
			}
		});
		buttonSum.setBounds(323, 24, 89, 23);
		frame.getContentPane().add(buttonSum);
		
		JButton buttonMinus = new JButton("-");
		buttonMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				double num1,num2,answ;				
				num1=Double.parseDouble(textField1.getText());
				num2=Double.parseDouble(textField2.getText());
				answ=num1-num2;
				textFieldansw.setText(Double.toString(answ));
			}
			catch(Exception e1){
				JOptionPane.showMessageDialog(null,"Enter valid number or fill field with number");				
			}
			}
		});
		buttonMinus.setBounds(323, 66, 89, 23);
		frame.getContentPane().add(buttonMinus);
		
		JButton buttonMultiplication = new JButton("*");
		buttonMultiplication.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double num1,num2,answ;				
					num1=Double.parseDouble(textField1.getText());
					num2=Double.parseDouble(textField2.getText());
					answ=num1*num2;
					textFieldansw.setText(Double.toString(answ));
				}
				catch(Exception e1){
					JOptionPane.showMessageDialog(null,"Enter valid number or fill field with number");				
				}
			}
		});
		buttonMultiplication.setBounds(323, 112, 89, 23);
		frame.getContentPane().add(buttonMultiplication);
		
		JButton buttonDivision = new JButton("/");
		buttonDivision.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double num1,num2,answ;				
					num1=Double.parseDouble(textField1.getText());
					num2=Double.parseDouble(textField2.getText());
					answ=num1/num2;
					textFieldansw.setText(Double.toString(answ));
				}
				catch(Exception e1){
					JOptionPane.showMessageDialog(null,"Enter valid number or fill field with number");				
				}
			}
		});
		buttonDivision.setBounds(323, 152, 89, 23);
		frame.getContentPane().add(buttonDivision);
	}
}
