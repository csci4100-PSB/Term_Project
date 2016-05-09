import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.*;
import java.util.*;
import java.awt.Color;
import javax.xml.*;

public class Window1 {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try {
					Window1 window = new Window1();
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
	public Window1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);
		
		/**
		 * Create Title
		 */
		JLabel lblNewLabel = new JLabel("MathTG");
		lblNewLabel.setForeground(Color.LIGHT_GRAY);
		lblNewLabel.setBackground(Color.LIGHT_GRAY);
		lblNewLabel.setFont(new Font("Eurostile", Font.BOLD, 50));
		lblNewLabel.setBounds(132, 36, 198, 52);
		frame.getContentPane().add(lblNewLabel);
		
		/**
		 * Label for ask user to input database file name.
		 */
		JLabel lblNewLabel_1 = new JLabel("Enter Database XML File:");
		lblNewLabel_1.setForeground(Color.GRAY);
		lblNewLabel_1.setFont(new Font("Eurostile", Font.BOLD, 13));
		lblNewLabel_1.setBounds(72, 124, 159, 29);
		frame.getContentPane().add(lblNewLabel_1);
		/**
		 * TextField for input file name
		 */
		textField = new JTextField(15);
		textField.setBounds(227, 124, 144, 26);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		/**
		 * Create New Exam Button
		 */
		JButton Create_Button = new JButton("Create New Exam");
		Create_Button.setForeground(Color.BLACK);
		Create_Button.setFont(new Font("Eurostile", Font.BOLD, 13));
		Create_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String fileName = textField.getText();
				System.out.println(fileName);
				
				Window2 newWindow2 = new Window2();
				newWindow2.setVisible(true);
				frame.dispose();
			}
		});
		Create_Button.setBounds(144, 174, 168, 29);
		frame.getContentPane().add(Create_Button);
		/**
		 * Exit Button
		 */
		JButton Exit_Button = new JButton("Exit");
		Exit_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		Exit_Button.setFont(new Font("Eurostile", Font.BOLD, 13));
		Exit_Button.setBounds(166, 220, 117, 29);
		frame.getContentPane().add(Exit_Button);
		
	}

}
