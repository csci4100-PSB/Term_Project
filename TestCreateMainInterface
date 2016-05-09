import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
//import java.lang.*;

public class TestCreateMainInterface {



    public static JButton createButton(String name)
    {
        JButton temp = new JButton(name);
        return temp;
    }

    public static JList<String> createList(Vector<String> vlist)
    {
        JList<String> list = new JList<String>(vlist);
        return list;
    }

    public static JComboBox<String> createComboBox(Vector<String> category)
    {
        JComboBox<String> temp = new JComboBox<String>(category);
        temp.setSelectedIndex(0);
        temp.setEnabled(false);
        return temp;
    }

    // CREATES A SCROLLPANE WITH A SCALABLE WINDOW THAT DISPLAYS contents
    public static JScrollPane createScrollList(JList<String> contents)
    {
        contents.setVisibleRowCount(-1);
        contents.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        contents.setLayoutOrientation(JList.VERTICAL);
        JScrollPane displayport = new JScrollPane(contents);

        return displayport;
    }

    //THIS FUNCTION QUERIES THE DATABASE FOR A TABLE TITLED category_name
    // AND RETURNS A VECTOR CONTAINING THE NAMES OF ALL TUPLES IN THE TABLE
    public static Vector<String> getCategoryList(String category_name)
    {
        Vector<String> name_list = new Vector<String>();
        name_list.addElement(" ");
		/* Uncomment this section & comment the second for loop to implement RetrieveFieldInfo
		RetrieveFieldInfo fieldInfo = new RetrieveFieldInfo("./");
		for(String name : fieldInfo.returnFieldValues(category_name))
		{
			name_list.addElement(name);
		}
		*/

        // Delete this for loop once the function to access the DB is ready
        for(int i = 1; i < 4; i++)
            name_list.addElement(category_name + " " + i);

        return name_list;
    }


    // CREATES AND RETURNS A VECTOR THAT CONTAINS ALL ELEMENTS OF questions_List
    // THAT DO NOT EXIST IN selected_Questions
    public static void generateAvailableList(Vector<String> available_List, String[] questions_List, Vector<String> selected_Questions)
    {
        available_List.clear();
        for(String question: questions_List)
            if(!selected_Questions.contains(question))
                available_List.addElement(question);

    }

    private static void createUI()
    {
        JFrame main_frame = new JFrame("MathTG");
        main_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Vector<String> Course_List = new Vector<String>();
        Vector<String> Chapter_List = new Vector<String>();
        Vector<String> Difficulty_List = new Vector<String>();

        final Vector<String> vAvailableList = new Vector<String>();
        final Vector<String> vSelectedList = new Vector<String>();

        //Create comboboxes for parameter filters
        Course_List = getCategoryList("Course");
        final JComboBox<String> coursebox = createComboBox(Course_List);
        coursebox.setEnabled(true);


        Chapter_List = getCategoryList("Chapter");
        final JComboBox<String> chapterbox = createComboBox(Chapter_List);


        Difficulty_List = getCategoryList("Difficulty");
        final JComboBox<String> difficultybox = createComboBox(Difficulty_List);


        JButton random_SelectButton = createButton("Random Selection");
        JButton add_AvailableButton = createButton("ADD");
        JButton edit_AvailableButton = createButton("EDIT");
        JButton delete_AvailableButton = createButton("DELETE");
        JButton select_AvailableButton = createButton(">");
        JButton remove_SelectedButton = createButton("<");
        JButton create_TestButton = createButton("CREATE TEST");
        JButton play_JeopardyButton = createButton("Jeopardy");

        //temporary code
        /*String[] list = {"Q1", "Q2", "Q3","Q4", "Q5", "Q6", "Q7", "Q8", "Q9", "Q10"};
        
        for(int i = 0; i < 10; i++)
        {
        	vAvailableList.add(list[i]);
        }*/
        //end temporary code
        
        
        
        
        
        /* GUI setup. Bingna, you can ignore this. */
        final JList<String> available_List = createList(vAvailableList);
        final JScrollPane available_pane = createScrollList(available_List);

        final JList<String> selected_List = createList(vSelectedList);
        final JScrollPane selected_pane = createScrollList(selected_List);



        //define left side panels of GUI
        JPanel combo_panel = new JPanel(new BorderLayout());
        JPanel combo_midpanel = new JPanel(new BorderLayout());
        JPanel combo_panel2 = new JPanel(new BorderLayout());
        JPanel combo_labelpanel = new JPanel(new BorderLayout());
        JPanel combo_buttonpanel = new JPanel(new BorderLayout());





        main_frame.getContentPane().add(combo_panel, BorderLayout.WEST);

        combo_panel.add(combo_midpanel, BorderLayout.CENTER);
        combo_midpanel.add(combo_panel2, BorderLayout.CENTER);
        combo_midpanel.add(combo_labelpanel, BorderLayout.WEST);

        combo_panel2.add(coursebox, BorderLayout.NORTH);
        combo_panel2.add(chapterbox, BorderLayout.CENTER);
        combo_panel2.add(difficultybox, BorderLayout.SOUTH);
        combo_labelpanel.add(new JLabel("Course"), BorderLayout.NORTH);
        combo_labelpanel.add(new JLabel("Chapter"), BorderLayout.CENTER);
        combo_labelpanel.add(new JLabel("Difficulty"), BorderLayout.SOUTH);

        combo_panel.add(combo_buttonpanel, BorderLayout.SOUTH);
        combo_buttonpanel.add(new JLabel("   "), BorderLayout.WEST);
        combo_buttonpanel.add(new JLabel("   "), BorderLayout.EAST);
        combo_buttonpanel.add(random_SelectButton, BorderLayout.CENTER);

        //define list windows, mid and right side of GUI
        JPanel lists_bigpanel = new JPanel(new BorderLayout());
        JPanel available_listpanel = new JPanel(new BorderLayout());
        JPanel middle_listpanel = new JPanel(new BorderLayout());
        JPanel selected_listpanel = new JPanel(new BorderLayout());

        JPanel available_buttons = new JPanel(new BorderLayout());
        JPanel middle_buttons = new JPanel(new BorderLayout());
        JPanel selected_buttons = new JPanel(new BorderLayout());

        lists_bigpanel.add(available_listpanel, BorderLayout.WEST);
        lists_bigpanel.add(middle_listpanel, BorderLayout.CENTER);
        lists_bigpanel.add(selected_listpanel, BorderLayout.EAST);

        available_listpanel.add(new JLabel("Available"), BorderLayout.NORTH);
        available_listpanel.add(available_buttons, BorderLayout.SOUTH);
        available_listpanel.add(available_pane, BorderLayout.CENTER);

        available_buttons.add(delete_AvailableButton, BorderLayout.WEST);
        available_buttons.add(add_AvailableButton, BorderLayout.CENTER);
        available_buttons.add(edit_AvailableButton, BorderLayout.EAST);

        middle_listpanel.add(middle_buttons, BorderLayout.CENTER);
        //add empty panels to NORTH and SOUTH
        middle_buttons.add(select_AvailableButton, BorderLayout.NORTH);
        middle_buttons.add(remove_SelectedButton, BorderLayout.SOUTH);

        selected_listpanel.add(selected_buttons, BorderLayout.SOUTH);
        selected_listpanel.add(selected_pane, BorderLayout.CENTER);
        selected_listpanel.add(new JLabel("Selected"), BorderLayout.NORTH);
        selected_buttons.add(create_TestButton, BorderLayout.WEST);
        selected_buttons.add(play_JeopardyButton, BorderLayout.EAST);
        selected_buttons.add(new JLabel("      "), BorderLayout.CENTER);


        main_frame.getContentPane().add(lists_bigpanel,BorderLayout.CENTER);

        /* end of GUI setup */




        // Functionality
        
        /* Left-side comboboxes will populate the available_list with 
         * String entries for each question. The rest of the controls will
         * interact with these Strings to produce the desired result. */

        //Creates a dialogue that allows the user to state the number of questions
        // that will be selected. This number of Qs will be chosen using
        // the categories currently selected in the Course, Chapter, and
        // Difficulty comboboxes. The chosen Qs will be added to the Selected
        // List and removed from the Available List.
        random_SelectButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent click)
            {
                //stuff happens
            }
        });

        // UPDATES chapterbox LIST OF OPTIONS, DISABLES difficultybox
        // AND SETS THE CURRENT INDEX OF BOTH COMBOBOXES TO 0
        coursebox.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent select)
            {
                //update the list of options for chapterbox based on coursebox.getSelected()
                chapterbox.setEnabled(true);
                chapterbox.setSelectedIndex(0);
                difficultybox.setEnabled(false);
                difficultybox.setSelectedIndex(0);
            }
        });

        chapterbox.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent select)
            {
                //update the list of options for difficultybox based on chapterbox.getSelected()
                difficultybox.setEnabled(true);
                difficultybox.setSelectedIndex(0);
            }
        });

        difficultybox.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent select)
            {
        		
        		/*
        		 * generateAvailableList(vAvailableList, GetQuestions(
        				coursebox.getSelectedItem(),
        				chapterbox.getSelectedItem(),
        				difficultybox.getSelectedItem()), vSelectedList);
        		*/
                String[] list = {"Q1", "Q2", "Q3","Q4", "Q5", "Q6", "Q7", "Q8", "Q9", "Q10"};
                generateAvailableList(vAvailableList, list, vSelectedList);
                available_List.setListData(vAvailableList);
            }
        });

        add_AvailableButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent click)
            {
                //stuff happens
            }
        });

        edit_AvailableButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent click)
            {
                //stuff happens
            }
        });

        delete_AvailableButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent click)
            {

            }
        });

        select_AvailableButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent click)
            {
                //stuff happens
            }
        });

        remove_SelectedButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent click)
            {
                //stuff happens
            }
        });

        create_TestButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent click)
            {
                //stuff happens
            }
        });

        play_JeopardyButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent click)
            {
                //stuff happens
            }
        });

        //Display the window.
        main_frame.pack();
        main_frame.setVisible(true);
    }

    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createUI();
            }
        });
    }
}
