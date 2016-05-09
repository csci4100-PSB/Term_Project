import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.Color;

import java.io.*;
import javax.xml.parsers.*;
import javax.xml.transform.*;
import org.w3c.dom.*;
import org.xml.sax.*;

public class AddToXML extends JFrame {

	private JPanel contentPane;
	private JTextField CourseTextField;
	private JTextField ChaperTextField_1;
	private JTextField DifficultyTextField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					/**
					String filepath = "c:\\file.xml";
					DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
					DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
					Document doc = docBuilder.parse(filepath);
					
					Node company = doc.getFirstChild();
					*/
					AddToXML addToXML = new AddToXML();
					addToXML.setVisible(true);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	/**
	 * 
	 */
	public AddToXML() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 573, 294);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		/**
		 *  Label for Add Question to XML
		 */
		JLabel Title_Label = new JLabel("Add Question to XML");
		Title_Label.setForeground(Color.LIGHT_GRAY);
		Title_Label.setBackground(Color.WHITE);
		Title_Label.setFont(new Font("Eurostile", Font.BOLD, 27));
		Title_Label.setBounds(16, 6, 253, 46);
		contentPane.add(Title_Label);
		
		/**
		 *  Label for Course name
		 */
		JLabel lblNewLabel = new JLabel("Course Name:");
		lblNewLabel.setForeground(Color.GRAY);
		lblNewLabel.setBounds(16, 64, 95, 16);
		contentPane.add(lblNewLabel);
		/**
		 *  TextField for Course Name
		 */
		CourseTextField = new JTextField();
		CourseTextField.setBounds(16, 79, 142, 32);
		contentPane.add(CourseTextField);
		CourseTextField.setColumns(10);
		
		/**
		 *  Label for Chapter Number
		 */
		JLabel lblNewLabel_1 = new JLabel("Chapter:");
		lblNewLabel_1.setForeground(Color.GRAY);
		lblNewLabel_1.setBounds(16, 137, 61, 16);
		contentPane.add(lblNewLabel_1);
		
		/**
		 *  TextField Chapter
		 */
		ChaperTextField_1 = new JTextField();
		ChaperTextField_1.setBounds(16, 151, 142, 32);
		contentPane.add(ChaperTextField_1);
		ChaperTextField_1.setColumns(10);
		
		/**
		 *  Label for Difficulty Level
		 */
		JLabel lblNewLabel_2 = new JLabel("Difficulty Level:");
		lblNewLabel_2.setForeground(Color.GRAY);
		lblNewLabel_2.setBounds(16, 204, 106, 16);
		contentPane.add(lblNewLabel_2);
		
		/**
		 *  TextField for Difficulty Level
		 */
		DifficultyTextField_2 = new JTextField();
		DifficultyTextField_2.setBounds(16, 220, 142, 32);
		contentPane.add(DifficultyTextField_2);
		DifficultyTextField_2.setColumns(10);
		
		
		/**
		 *  Label for Enter Question
		 */
		JLabel lblNewLabel_3 = new JLabel("Enter Question:");
		lblNewLabel_3.setForeground(Color.GRAY);
		lblNewLabel_3.setBounds(184, 64, 106, 16);
		contentPane.add(lblNewLabel_3);
		
		/**
		 *  TextArea for let user to enter new question
		 */
		JTextArea textArea = new JTextArea();
		textArea.setBounds(184, 87, 360, 128);
		contentPane.add(textArea);
		
		/**
		 *  Button for Add new question to XML file after user enter question in TextArea.
		 */
		JButton Add_Button = new JButton("ADD");
		Add_Button.setBounds(184, 223, 117, 29);
		contentPane.add(Add_Button);
		
		/**
		 *  Button for Exit
		 */
		JButton Exit_Button = new JButton("EXIT");
		Exit_Button.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			}
		});
		Exit_Button.setBounds(438, 223, 117, 29);
		contentPane.add(Exit_Button);
		
		/**
		 *  Button for Help
		 */
		JButton Help_Button_2 = new JButton("HELP");
		Help_Button_2.setBounds(313, 223, 117, 29);
		contentPane.add(Help_Button_2);
		

	}
}
