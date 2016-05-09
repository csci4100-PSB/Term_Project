/**
 * Created by patrick on 4/30/16.
 */
import java.io.*;
import java.io.IOException;
import java.util.Scanner;
import java.net.*;
import java.awt.*;

public class menu {
    public static void main(String args[]) throws IOException, InterruptedException
    {

        Scanner scan = new Scanner(System.in);

        System.out.println("TEST GENERATION PROGRAM");
        System.out.println("Enter database name:");
        String file = scan.nextLine();

        System.out.println("Select type of test to create:");
        System.out.println("A. LaTeX/PDF");
        System.out.println("B. Web");
        System.out.println("C. Jeopardy");
        String test = scan.nextLine();

        System.out.println("Enter test name (alphanumeric characters and spaces only)");
        String testname = scan.nextLine();
        String useablename = testname;
        testname = testname.replaceAll(" ", "_");

        LatexFile database1 = null;
        htmlFile database2 = new htmlFile(file);
        Jeopardy database3 = new Jeopardy(file);
        boolean lbase = false; //true = Latex
        boolean hbase = false; //true = HTML
        boolean jbase = false; //true = Jeopardy
        if (test.charAt(0) == 'A' || test.charAt(0) == 'a')
        {
            lbase = true;
            hbase = false;
            jbase = false;
        }
        else if(test.charAt(0) == 'B' || test.charAt(0) == 'b')
        {
            hbase = true;
            lbase = false;
            jbase = false;
        }
        else if (test.charAt(0) == 'C' || test.charAt(0) == 'c')
        {
            hbase = false;
            lbase = false;
            jbase = true;
        }

        System.out.println("Enter subject covered");
        String subject = scan.nextLine();
        if(lbase==true)
        {
            database1 = new LatexFile(testname + ".tex",file);
            database1.WriteLatexHead(useablename);
        }

        boolean continuance = true;
        while (continuance == true)
        {
            System.out.println("Enter sections to print");
            Double section = scan.nextDouble();
            System.out.println("Enter question difficulties to print");
            int difficulty = scan.nextInt();
            System.out.println("Enter max number of questions to print");
            int number = scan.nextInt();
            if (jbase){
                database3.WritehtmlQuestions(subject,section,difficulty,number);
            }
            if(lbase)
                database1.WriteLatexQuestions(subject,section,difficulty,number);
            if (hbase)
                database2.WritehtmlQuestions(subject,section,difficulty,number);
            System.out.println("Do you want to continue adding questions? Y = yes, N = no");

            String resp = scan.next();
            if (resp.charAt(0) == ('Y' | 'y'))
                continuance = true;
            else
                continuance = false;
        }

        System.out.println("Test file generated. Goodbye");
        if(lbase==true)
        {
            database1.WriteLatexFoot();
            Runtime run = Runtime.getRuntime();
            Process pr = run.exec("pdflatex " + testname + ".tex");
            pr.waitFor();
        }

        if(hbase==true){
            database2.GeneratehtmlTest(useablename);
        }
        if(jbase){
            database3.GeneratehtmlTable(useablename);
        }
    }

    /*
    File htmlFile = new File(url);
    Desktop.getDesktop().browse(htmlFile.toURI());
     */

    public static void openWebpage(URI uri) {
        Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
        if (desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
            try {
                desktop.browse(uri);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void openWebpage(URL url) {
        try {
            openWebpage(url.toURI());
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }
}
