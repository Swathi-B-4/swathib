import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;
import javax.swing.JTextArea;

public class applicarion {

	private JFrame frame;
	private JTextField fn;
	private JTextField LN;
	private JTextField DOB;
	private JTextField MN;
	private JTextField EM;
	private JRadioButton m;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextArea Form;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					applicarion window = new applicarion();
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
	public applicarion() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 803, 526);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("User Application Form");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 20));
		lblNewLabel.setBounds(230, 32, 251, 22);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel Last_Name = new JLabel("LastName");
		Last_Name.setFont(new Font("Arial", Font.PLAIN, 20));
		Last_Name.setBounds(31, 120, 89, 16);
		frame.getContentPane().add(Last_Name);
		
		JLabel First_Name = new JLabel("FirstName");
		First_Name.setFont(new Font("Arial", Font.PLAIN, 20));
		First_Name.setBounds(30, 91, 109, 16);
		frame.getContentPane().add(First_Name);
		
		fn = new JTextField();
		fn.setFont(new Font("Arial", Font.PLAIN, 20));
		fn.setBounds(193, 90, 116, 22);
		frame.getContentPane().add(fn);
		fn.setColumns(10);
		
		LN = new JTextField();
		LN.setFont(new Font("Arial", Font.PLAIN, 20));
		LN.setBounds(193, 119, 116, 22);
		frame.getContentPane().add(LN);
		LN.setColumns(10);
		
		JLabel label = new JLabel("New label");
		label.setBounds(40, 130, 11, 1);
		frame.getContentPane().add(label);
		
		JLabel Date_Of_Birth = new JLabel("Date of Birth");
		Date_Of_Birth.setFont(new Font("Arial", Font.PLAIN, 20));
		Date_Of_Birth.setBounds(30, 157, 133, 16);
		frame.getContentPane().add(Date_Of_Birth);
		
		DOB = new JTextField();
		DOB.setFont(new Font("Arial", Font.PLAIN, 20));
		DOB.setBounds(193, 151, 116, 22);
		frame.getContentPane().add(DOB);
		DOB.setColumns(10);
		
		JLabel Mobile_Numebr = new JLabel("Mobile Number");
		Mobile_Numebr.setFont(new Font("Arial", Font.PLAIN, 20));
		Mobile_Numebr.setHorizontalAlignment(SwingConstants.CENTER);
		Mobile_Numebr.setBounds(30, 191, 133, 16);
		frame.getContentPane().add(Mobile_Numebr);
		
		JLabel Gender = new JLabel("Gender");
		Gender.setFont(new Font("Arial", Font.PLAIN, 20));
		Gender.setBounds(31, 220, 108, 16);
		frame.getContentPane().add(Gender);
		
		JLabel Email_ID = new JLabel("Email ID");
		Email_ID.setFont(new Font("Arial", Font.PLAIN, 20));
		Email_ID.setBounds(31, 249, 97, 16);
		frame.getContentPane().add(Email_ID);
		
		MN = new JTextField();
		MN.setFont(new Font("Arial", Font.PLAIN, 20));
		MN.setBounds(193, 185, 116, 22);
		frame.getContentPane().add(MN);
		MN.setColumns(10);
		
		EM = new JTextField();
		EM.setFont(new Font("Arial", Font.PLAIN, 20));
		EM.setBounds(193, 248, 116, 22);
		frame.getContentPane().add(EM);
		EM.setColumns(10);
		
		JButton Sub = new JButton("Submit");
		Sub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String a = fn.getText();
				String b = LN.getText();
				String c = DOB.getText();
				String d = MN.getText();
				String e;
				if(m.isSelected())
				{
					e="M";
				}
				else
				{
					e="F";
				}
				String f = EM.getText();
				Form.setText("Registeration Successful!! Your details are:\nFirst Name\t" +""+ a +""+ "\nLast Name\t" +""+ b +""+ "\nDate of Birth\t" +""+ c +""+ "\nMobile Number\t" +""+ d +""+ "\nGender\t" +""+ e +""+ "\nEmail ID\t" +""+ f);
				
			}
		});
		Sub.setFont(new Font("Arial", Font.PLAIN, 20));
		Sub.setBounds(154, 301, 155, 25);
		frame.getContentPane().add(Sub);
		
		 m = new JRadioButton("M");
		 buttonGroup.add(m);
		m.setFont(new Font("Arial", Font.PLAIN, 20));
		m.setBounds(193, 218, 127, 25);
		frame.getContentPane().add(m);
		
		JRadioButton f = new JRadioButton("F");
		buttonGroup.add(f);
		f.setFont(new Font("Arial", Font.PLAIN, 20));
		f.setBounds(363, 218, 127, 25);
		frame.getContentPane().add(f);
		
		Form = new JTextArea();
		Form.setFont(new Font("Courier New", Font.PLAIN, 20));
		Form.setBounds(517, 78, 256, 248);
		frame.getContentPane().add(Form);
	}
}
