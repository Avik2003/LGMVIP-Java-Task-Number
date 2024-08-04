import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class currencyconverter extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField textField;
	private JComboBox comboBox ;
	private JLabel lblNewLabel_1 ;
	private JLabel lblNewLabel_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					currencyconverter frame = new currencyconverter();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public currencyconverter() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 542, 398);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		//contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(47, 192, 175, 41);
		contentPane.add(textField);
		textField.setColumns(10);
		String[]choices= {"","Dollars to Pesos","Pesos to Dollars","Dollars to Yen","Dollars to Euros","Dollars to Indian Rupee"};
		comboBox= new JComboBox(choices);
		
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 14));
		comboBox.setBounds(297, 190, 183, 41);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel = new JLabel("Enter a Number to convert");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(45, 128, 314, 67);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setBounds(167, 265, 244, 35);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("CURRENCY CONVERTER");
		lblNewLabel_2.setFont(new Font("Candara", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel_2.setBounds(137, 32, 262, 67);
		contentPane.add(lblNewLabel_2);
		comboBox.addActionListener(this);
		
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String text=textField.getText();
		double x=Double.parseDouble(text);
		if(e.getSource()==comboBox) {
			String selected=comboBox.getSelectedItem().toString();
			if(selected.equalsIgnoreCase("Dollars to Pesos")) {
				x=x*18.43;
				String s=Double.toString(x);
				int result=s.indexOf(".");
				String output=s.substring(0, result+3);
				lblNewLabel_1.setText(output+"Pesos");
			}
			else if(selected.equalsIgnoreCase("Pesos to Dollars")) {
				x=x*0.054;
				String s=Double.toString(x);
				int result=s.indexOf(".");
				String output=s.substring(0, result+3);
				lblNewLabel_1.setText(output+"Dollars");
			}
			else if(selected.equalsIgnoreCase("Dollars to Yen")) {
				x=x*134.71;
				String s=Double.toString(x);
				int result=s.indexOf(".");
				String output=s.substring(0, result+3);
				lblNewLabel_1.setText(output+"Yen");
			}
			else if(selected.equalsIgnoreCase("Dollars to Euros")) {
				x=x*0.94;
				String s=Double.toString(x);
				int result=s.indexOf(".");
				String output=s.substring(0, result+3);
				lblNewLabel_1.setText(output+"Euros");
			}
			else if(selected.equalsIgnoreCase("Dollars to Indian Rupee")) {
				x=x*81.97;
				String s=Double.toString(x);
				int result=s.indexOf(".");
				String output=s.substring(0, result+3);
				lblNewLabel_1.setText(output+"Rupee");
			}
			
		}
		
	}
}
