import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;

public class Calculator {

	private JFrame frame;
	private JTextField textField;
	
	double first;
	double second;
	double result;
	String operation;
	String answer;

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
		frame.setBounds(100, 100, 422, 653);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField.setBounds(10, 20, 393, 65);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("\u221A");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.sqrt(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(10, 109, 75, 65);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("1/X");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=1/(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1.setBounds(10, 180, 75, 65);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("X^Y");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="X^Y";	
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_2.setBounds(10, 250, 75, 65);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnX_1 = new JButton("X^3");
		btnX_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=(Double.parseDouble(textField.getText()));
				a=a*a*a;
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnX_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnX_1.setBounds(10, 322, 75, 67);
		frame.getContentPane().add(btnX_1);
		
		JButton btnX = new JButton("X^2");
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=(Double.parseDouble(textField.getText()));
				a=a*a;
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnX.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnX.setBounds(10, 396, 75, 65);
		frame.getContentPane().add(btnX);
		
		JButton btnN = new JButton("n!");
		btnN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			double a=Double.parseDouble(textField.getText());
			double fact=1;
			while(a!=0)
			{
				fact=fact*a;
				a--;
			}
			textField.setText("");
			textField.setText(textField.getText()+fact);
			}
		});
		btnN.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnN.setBounds(10, 468, 75, 67);
		frame.getContentPane().add(btnN);
		
		JButton btnplusminus = new JButton("+/-");
		btnplusminus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a= Double.parseDouble(String.valueOf(textField.getText()));
				a=a*(-1);
				textField.setText(String.valueOf(a));
			}
		});
		btnplusminus.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnplusminus.setBounds(10, 537, 75, 69);
		frame.getContentPane().add(btnplusminus);
		
		JButton btnNewButton_7 = new JButton("e^x");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.exp(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnNewButton_7.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_7.setBounds(88, 109, 75, 65);
		frame.getContentPane().add(btnNewButton_7);
		
		JButton btnNewButton_1_1 = new JButton("log");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.log(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1_1.setBounds(88, 180, 75, 65);
		frame.getContentPane().add(btnNewButton_1_1);
		
		JButton btnpercent = new JButton("%");
		btnpercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="%";
			}
		});
		btnpercent.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnpercent.setBounds(88, 250, 75, 65);
		frame.getContentPane().add(btnpercent);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn7.getText();
				textField.setText(number);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn7.setBounds(88, 322, 75, 65);
		frame.getContentPane().add(btn7);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn4.getText();
				textField.setText(number);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn4.setBounds(88, 396, 75, 65);
		frame.getContentPane().add(btn4);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn1.getText();
				textField.setText(number);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn1.setBounds(88, 468, 75, 67);
		frame.getContentPane().add(btn1);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn0.getText();
				textField.setText(number);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn0.setBounds(88, 539, 153, 67);
		frame.getContentPane().add(btn0);
		
		JButton btnNewButton_8 = new JButton("sin");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double a=Math.sin(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnNewButton_8.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_8.setBounds(166, 109, 75, 65);
		frame.getContentPane().add(btnNewButton_8);
		
		JButton btnNewButton_1_2 = new JButton("sinh");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.sinh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnNewButton_1_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_1_2.setBounds(166, 180, 75, 65);
		frame.getContentPane().add(btnNewButton_1_2);
		
		JButton btnclear = new JButton("C");
		btnclear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnclear.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnclear.setBounds(166, 250, 75, 65);
		frame.getContentPane().add(btnclear);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn8.getText();
				textField.setText(number);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn8.setBounds(166, 322, 75, 65);
		frame.getContentPane().add(btn8);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn5.getText();
				textField.setText(number);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn5.setBounds(166, 396, 75, 65);
		frame.getContentPane().add(btn5);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn2.getText();
				textField.setText(number);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn2.setBounds(166, 468, 75, 68);
		frame.getContentPane().add(btn2);
		
		JButton btnNewButton_9 = new JButton("cos");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.cos(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnNewButton_9.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_9.setBounds(244, 109, 75, 65);
		frame.getContentPane().add(btnNewButton_9);
		
		JButton btnNewButton_1_3 = new JButton("cosh");
		btnNewButton_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.cosh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnNewButton_1_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_1_3.setBounds(244, 180, 75, 65);
		frame.getContentPane().add(btnNewButton_1_3);
		
		JButton btnbackspace = new JButton("\uF0E7");
		btnbackspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backSpace=null;
				if(textField.getText().length()>0)
				{
					StringBuilder str=new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					backSpace=str.toString();
					textField.setText(backSpace);
				}
				
			}
		});
		btnbackspace.setFont(new Font("Wingdings", Font.BOLD, 20));
		btnbackspace.setBounds(244, 250, 75, 65);
		frame.getContentPane().add(btnbackspace);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn9.getText();
				textField.setText(number);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn9.setBounds(244, 322, 75, 65);
		frame.getContentPane().add(btn9);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn6.getText();
				textField.setText(number);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn6.setBounds(244, 396, 75, 65);
		frame.getContentPane().add(btn6);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn3.getText();
				textField.setText(number);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn3.setBounds(244, 467, 75, 68);
		frame.getContentPane().add(btn3);
		
		JButton btndot = new JButton(".");
		btndot.setFont(new Font("Tahoma", Font.BOLD, 20));
		btndot.setBounds(244, 541, 75, 65);
		frame.getContentPane().add(btndot);
		
		JButton btnNewButton_10 = new JButton("tan");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.tan(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnNewButton_10.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_10.setBounds(323, 110, 75, 65);
		frame.getContentPane().add(btnNewButton_10);
		
		JButton btnNewButton_1_4 = new JButton("tanh");
		btnNewButton_1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.tanh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnNewButton_1_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_1_4.setBounds(323, 180, 75, 65);
		frame.getContentPane().add(btnNewButton_1_4);
		
		JButton btnadd = new JButton("+");
		btnadd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="+";
			}
		});
		btnadd.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnadd.setBounds(323, 250, 75, 66);
		frame.getContentPane().add(btnadd);
		
		JButton btnsub = new JButton("-");
		btnsub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="-";
			}
		});
		btnsub.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnsub.setBounds(323, 324, 75, 65);
		frame.getContentPane().add(btnsub);
		
		JButton btnmultiply = new JButton("*");
		btnmultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="*";
			}
		});
		btnmultiply.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnmultiply.setBounds(323, 396, 75, 67);
		frame.getContentPane().add(btnmultiply);
		
		JButton btndivide = new JButton("/");
		btndivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="/";
			}
		});
		btndivide.setFont(new Font("Tahoma", Font.BOLD, 20));
		btndivide.setBounds(323, 466, 75, 69);
		frame.getContentPane().add(btndivide);
		
		JButton btnequal = new JButton("=");
		btnequal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				second=Double.parseDouble(textField.getText());
				if(operation=="+")
				{
					result=first+second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="-")
				{
					result=first-second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="*")
				{
					result=first*second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="/")
				{
					result=first/second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="%")
				{
					result=first%second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="X^Y")
				{
					double resultt=1;
					for(int i=0;i<second;i++)
					{
						resultt=first*resultt;
					}
					
					answer=String.format("%.2f", resultt);
					textField.setText(answer);
				}
			}
		});
		btnequal.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnequal.setBounds(323, 537, 75, 69);
		frame.getContentPane().add(btnequal);
		
		
	}
}
