import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JButton;

public class Edit extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Edit frame = new Edit();
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
	public Edit() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Edit Question");
		lblNewLabel.setForeground(Color.LIGHT_GRAY);
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setFont(new Font("Eurostile", Font.BOLD, 27));
		lblNewLabel.setBounds(17, 6, 165, 42);
		contentPane.add(lblNewLabel);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(17, 58, 414, 145);
		contentPane.add(textArea);
		
		JButton UpdateButton = new JButton("Update");
		UpdateButton.setBounds(17, 226, 117, 29);
		contentPane.add(UpdateButton);
		
		JButton Exit_Button = new JButton("Exit");
		Exit_Button.setBounds(314, 226, 117, 29);
		contentPane.add(Exit_Button);
		
		JButton Help_Button = new JButton("Help");
		Help_Button.setBounds(166, 226, 117, 29);
		contentPane.add(Help_Button);
	}
}
