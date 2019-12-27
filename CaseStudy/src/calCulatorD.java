import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class calCulatorD {

	private JFrame frame;
	private JTextField A;
	private JTextField D;
	private JTextField N;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calCulatorD window = new calCulatorD();
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
	public calCulatorD() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 769, 502);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Distance Calculator");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 20));
		lblNewLabel.setBounds(230, 13, 171, 27);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(54, 109, 40, -7);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel PA = new JLabel("Principle Amount");
		PA.setFont(new Font("Arial", Font.PLAIN, 20));
		PA.setBounds(70, 86, 161, 27);
		frame.getContentPane().add(PA);
		
		JLabel DP = new JLabel("Discount Price");
		DP.setFont(new Font("Arial", Font.PLAIN, 20));
		DP.setBounds(70, 139, 140, 16);
		frame.getContentPane().add(DP);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(370, 109, 104, -25);
		frame.getContentPane().add(lblNewLabel_2);
		
		A = new JTextField();
		A.setFont(new Font("Arial", Font.PLAIN, 20));
		A.setBounds(358, 90, 116, 22);
		frame.getContentPane().add(A);
		A.setColumns(10);
		
		D = new JTextField();
		D.setFont(new Font("Arial", Font.PLAIN, 20));
		D.setBounds(358, 138, 116, 22);
		frame.getContentPane().add(D);
		D.setColumns(10);
		
		JButton C = new JButton("Calculate");
		C.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Integer a = Integer.parseInt(A.getText());
				Integer b = Integer.parseInt(D.getText());
				Integer c = (a * b) / 100;
				Integer d = a - c;
				N.setText(String.valueOf(d));
			}
		});
		C.setFont(new Font("Arial", Font.PLAIN, 20));
		C.setBounds(229, 210, 140, 25);
		frame.getContentPane().add(C);
		
		JLabel NP = new JLabel("Net Price");
		NP.setFont(new Font("Arial", Font.PLAIN, 20));
		NP.setBounds(81, 270, 104, 16);
		frame.getContentPane().add(NP);
		
		N = new JTextField();
		N.setFont(new Font("Arial", Font.PLAIN, 20));
		N.setBounds(370, 264, 116, 22);
		frame.getContentPane().add(N);
		N.setColumns(10);
		
		
		JLabel R = new JLabel("RS");
		R.setFont(new Font("Arial", Font.PLAIN, 20));
		R.setBounds(543, 93, 56, 16);
		frame.getContentPane().add(R);
		
		JLabel Per = new JLabel("%");
		Per.setFont(new Font("Arial", Font.PLAIN, 20));
		Per.setBounds(543, 141, 56, 16);
		frame.getContentPane().add(Per);
		
		JLabel Rs = new JLabel("RS");
		Rs.setFont(new Font("Arial", Font.PLAIN, 20));
		Rs.setBounds(543, 272, 56, 16);
		frame.getContentPane().add(Rs);
	}

}
