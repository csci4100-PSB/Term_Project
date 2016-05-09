import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.Font;
import javax.swing.JList;
import javax.swing.JDesktopPane;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JToolBar;
import java.awt.Color;
import java.awt.Dimension;
import java.io.*;
import java.util.*;
import javax.xml.parsers.*;
import org.xml.sax.*;
import org.w3c.dom.*;

public class Window2 extends JFrame {


	private JPanel contentPane;
	/**
	 * @wbp.nonvisual location=43,401
	 */

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Window2 frame = new Window2();
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
	public Window2() {
		setForeground(Color.GRAY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 790, 353);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		/**
		*	Course Label
		*/
		JLabel Course_Label = new JLabel("Course");
		Course_Label.setBackground(Color.WHITE);
		Course_Label.setForeground(Color.GRAY);
		Course_Label.setBounds(19, 69, 61, 16);
		contentPane.add(Course_Label);
		
		/**
		*	Chapter Label
		*/
		JLabel Chapter_Label = new JLabel("Chapter");
		Chapter_Label.setForeground(Color.GRAY);
		Chapter_Label.setBounds(19, 125, 61, 16);
		contentPane.add(Chapter_Label);
		
		/**
		*	Diffilculty JLabel
		*/
		JLabel Diffulculty_Label = new JLabel("Difficulty");
		Diffulculty_Label.setForeground(Color.GRAY);
		Diffulculty_Label.setBackground(Color.WHITE);
		Diffulculty_Label.setBounds(19, 178, 61, 16);
		contentPane.add(Diffulculty_Label);
		
		/**
		*	Random Selection Button
		*/
		JButton Random_Button = new JButton("Random Selection");
		Random_Button.setForeground(Color.BLACK);
		Random_Button.setBackground(Color.WHITE);
		Random_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Random_Button.setBounds(19, 226, 174, 36);
		Random_Button.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		contentPane.add(Random_Button);

		
		/**
		*	 Window 2: Title
		*/
		JLabel Window2_Title = new JLabel("Select Questions");
		Window2_Title.setForeground(Color.LIGHT_GRAY);
		Window2_Title.setBounds(19, 17, 220, 27);
		Window2_Title.setFont(new Font("Eurostile", Font.BOLD, 30));
		contentPane.add(Window2_Title);
		
		
		/**
		*	Course JComboBox
		*/
		JComboBox comboBox_course = new JComboBox<String>(new String[] {"Calculus I"});
		//JComboBox comboBox_course = new JComboBox();
		comboBox_course.setBounds(76, 57, 117, 43);
		comboBox_course.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		contentPane.add(comboBox_course);
		
		/**
		*	Chapter JComboBox
		*/
		JComboBox comboBox_chapter = new JComboBox<String>(new String[] { "2.2","2.3","2.5","2.6","2.7","3.1","3.2","3.3","3.4","3.5","3.6"});
		//JComboBox comboBox_chapter = new JComboBox();
		comboBox_chapter.setBounds(76, 121, 117, 27);
		contentPane.add(comboBox_chapter);
		
		/**
		*	Diffulculty JComboBox
		*/
		JComboBox comboBox_diffulculty = new JComboBox<String>(new String[] {"1","2","3","4","5"});
		//JComboBox comboBox_diffulculty = new JComboBox();
		comboBox_diffulculty.setBounds(76, 174, 117, 27);
		contentPane.add(comboBox_diffulculty);
		
		/**
		*	Help Button
		*/
		JButton Help_Button = new JButton("Help");
		Help_Button.setBounds(19, 280, 81, 29);
		contentPane.add(Help_Button);
		
		/**
		*	Exit Button
		*/
		JButton Exit_Button = new JButton("Exit");
		Exit_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		Exit_Button.setBounds(106, 280, 87, 29);
		contentPane.add(Exit_Button);
		
		/**
		*	Play Jeopardy Button
		*/
		JButton Jeopardy_Button = new JButton("Play Jeopardy");
		Jeopardy_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Jeopardy_Button.setBounds(637, 280, 127, 29);
		contentPane.add(Jeopardy_Button);
		
		/**
		*	Create Exam Button
		*/
		JButton CreateExam_Button = new JButton("Create Exam");
		CreateExam_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		CreateExam_Button.setBounds(518, 280, 117, 29);
		contentPane.add(CreateExam_Button);
		
		/**
		* 	Delete Button
		*/
		JButton Delete_Button = new JButton("Delete");
		Delete_Button.setBounds(224, 280, 68, 29);
		contentPane.add(Delete_Button);
		
		/**
		*	Add Button
		*/
		JButton Add_Database_Button = new JButton("Add");
		Add_Database_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddToXML AddWindow = new AddToXML();
				AddWindow.setVisible(true);
			}
		});
		Add_Database_Button.setBounds(299, 280, 75, 29);
		contentPane.add(Add_Database_Button);
		
		/**
		*	Edit Button
		*/
		JButton Edit_Button = new JButton("Edit");
		Edit_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					Edit AddWindow = new Edit();
					AddWindow.setVisible(true);
			}
		});
		Edit_Button.setBounds(375, 280, 80, 29);
		contentPane.add(Edit_Button);
		
		/**
		*	Available JList
		*/
		// For test
		
		String[] question = {"Q 1","Q 2","Q 3","Q 4","Q 5","Q 6","Q 7","Q 8"};
		
		JList Available_List = new JList<>(question);

		//JList Available_List = new JList();
		Available_List.setBackground(Color.WHITE);
		Available_List.setBounds(224, 69, 225, 191);
		
		JScrollPane menu = new JScrollPane(Available_List);
		
		contentPane.add(Available_List);
		

		
		
		/**
		*	Selected JList
		*/
		JList Selected_List = new JList();
		Selected_List.setForeground(Color.BLACK);
		Selected_List.setBounds(524, 69, 231, 191);
		contentPane.add(Selected_List);
		
		/**
		*	Available Questions Label
		*/
		JLabel Available_Label = new JLabel("Available Questions");
		Available_Label.setForeground(Color.GRAY);
		Available_Label.setFont(new Font("Euphemia UCAS", Font.BOLD, 13));
		Available_Label.setBounds(315, 46, 140, 16);
		contentPane.add(Available_Label);
		
		/**
		*	Selected Questions Label
		*/
		JLabel Selected_Label = new JLabel("Selected Questions");
		Selected_Label.setForeground(Color.GRAY);
		Selected_Label.setFont(new Font("Euphemia UCAS", Font.BOLD, 13));
		Selected_Label.setBounds(620, 41, 135, 27);
		contentPane.add(Selected_Label);
		
		/**
		*	Button for add question from Available to Selected
		*/
		JButton Add_Selected_Button = new JButton(">>");
		Add_Selected_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Add_Selected_Button.setBounds(461, 109, 51, 29);
		contentPane.add(Add_Selected_Button);
		
		/**
		*	Button for add question from Selected to Available
		*/
		JButton Add_Available_Button = new JButton("<<");
		Add_Available_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Add_Available_Button.setBounds(461, 200, 51, 29);
		contentPane.add(Add_Available_Button);
		

	
	}

	
}
