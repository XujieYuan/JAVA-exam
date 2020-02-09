import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Review
{
    /**
     * Method to start the program
     */
    public void start()
    {
        displayMenu();
        selectPractice();
    }

    /**
     * Method to display the Main Menu
     */
    public void displayMenu()
    {
        System.out.println("***************************");
        System.out.println("Press 1 to do practice 2.3");
        System.out.println("Press 2 to do practice 2.4");
        System.out.println("Press 3 to do practice 2.6");
        System.out.println("Press 4 to do practice 2.7");
        System.out.println("Press 5 to do practice 2.8");
        System.out.println("Press 6 to do practice 2.9");
        System.out.println("Press 7 to do practice 2.10");
        System.out.println("Press 8 to do Exercises");
        System.out.println("Press 9 to Exit");
        System.out.println("***************************");
    }

    /**
     * Method to choose a practice item
     */
    public void selectPractice()
    {
        Input input = new Input();
        String prompt = "Please choose a practice!";
        String choice = input.acceptUserInput(prompt);
        switch (choice)
        {
            case "1":
                getRandomNumber();
                start();
                break;
            case "2":
                testStringMethod();
                start();
                break;
            case "3":
                select();
                start();
                break;
            case "4":
                createSubject("JAVA", "FIT9131", "Bella", "1");
                start();
                break;
            case "5":
                calSpace();
                start();
                break;
            case "6":
                writeToFile();
                start();
                break;
            case "7":
                readAndCreate();
                start();
                break;
            case "8":
                Exercise ex = new Exercise();
                ex.beginExercise();
                break;
            case "9":
                System.exit(0);
                break;
            default:
                System.out.println("Invalid Option! Please choose again!");
                start();
                break;
        }
    }

    /**
     * Method to test random number method
     *
     * @return
     */
    public double getRandomNumber()
    {
        double rand = Math.random();
        System.out.println(rand);
        return rand;
    }

    /**
     * Method to test String's Methods
     */
    public void testStringMethod()
    {
        String str = "Bella loves JAVA";
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.charAt(5));
        System.out.println(str.length());
        System.out.println(str.isEmpty());
        System.out.println(str.substring(3, 5));
        System.out.println(str.substring(2));
        System.out.println(str.replace('a', 'u'));
        System.out.println(str.indexOf('e'));
        System.out.println(str.split("e")[1]);
    }

    /**
     * Method for practice 2.6
     * I used for-each in 2.6, Iterator in 2.9
     */
    public void select()
    {
        ArrayList<String> str = new ArrayList<>();
        ArrayList<String> output = new ArrayList<>();
        str.add("celine");
        str.add("java");
        str.add("Acne");
        str.add("exception");
        str.add("ce");
        int i = 0;
        for (String s : str)
        {
            for (int j = 0; j < s.length() - 1; j++)
            {
                if (s.charAt(j) == 'c' && s.charAt(j + 1) == 'e')
                {
                    output.add(s);
                }
            }
            i++;
        }
        for (int m = 0; m < output.size(); m++)
        {
            System.out.print(output.get(m) + " ");
        }
    }

    /**
     * Method for practice 2.7
     * Another solution is shown below in the comment
     * <p>
     * Subject sub1 = new Subject();
     * sub1.setSubjectName(sn);
     * ...
     *
     * @param sn
     * @param uc
     * @param lec
     * @param ter
     * @return
     */
    public Subject createSubject(String sn, String uc, String lec, String ter)
    {
        //sn = "JAVA";
        //uc = "FIT9131";
        //lec = "Bella";
        //ter = "1";
        Subject sub = new Subject(sn, uc, lec, ter);
        //System.out.println(sub.getSubjectName());
        //System.out.println(sub.getUnitCode());
        //System.out.println(sub.getLecturer());
        //System.out.println(sub.getTerm());
        return sub;
    }

    /**
     * Method for practice 2.8
     * <p>
     * Another solution
     * <p>
     * String prompt = "Please type something";
     * Input inp = new Input();
     * String str = inp.acceptUserInput(prompt).trim();
     * ...
     */
    public int calSpace()
    {
        System.out.println("Please type something");
        Scanner console = new Scanner(System.in);
        String str = console.nextLine().trim();
        int count = 0;
        for (int i = 0; i < str.length(); i++)
            if (str.charAt(i) == ' ')
            {
                count++;
            }
        System.out.println("The number of spaces in the middle is " + count);
        return count;
    }

    /**
     * Method for practice 2.9
     * Use Iterator here
     * If do not want to use StringBuffer, can use //output += content + "\n";
     * to replace //output = sb.append(content + "\n").toString();
     */
    public void writeToFile()
    {
        ArrayList<String> str = new ArrayList<>();
        String content = "";
        String output = "";
        str.add("celine");
        str.add("java");
        str.add("Acne");
        str.add("exception");
        str.add("ce");
        Iterator<String> it = str.iterator();
        StringBuffer sb = new StringBuffer();
        int i = 0;
        while (it.hasNext())
        {
            content = it.next();
            output = sb.append(content + "\n").toString();
            String fileName = "test.txt";
            try
            {
                File file = new File(fileName);
                if (!file.exists())
                {
                    file.createNewFile();
                }
                PrintWriter pw = new PrintWriter(fileName);
                pw.println(output);
                pw.close();
            }
            catch (IOException e)
            {
                System.out.println("Unable to save to " + fileName);
            }
            i++;
        }
    }

    /**
     * Method for practice 2.10
     */
    public ArrayList<Subject> readAndCreate()
    {
        ArrayList<Subject> s = new ArrayList<>();
        try
        {
            FileReader fileReader = new FileReader("file.txt");
            try
            {
                Scanner parser = new Scanner(fileReader);
                while (parser.hasNextLine())
                {
                    String[] sub = parser.nextLine().split(",");
                    Subject subjects = new Subject();
                    subjects.setSubjectName(sub[0]);
                    subjects.setUnitCode(sub[1]);
                    subjects.setLecturer(sub[2]);
                    subjects.setTerm(sub[3]);
                    s.add(subjects);
                }
            }
            finally
            {
                fileReader.close();
            }
        }
        catch (FileNotFoundException e)
        {
            System.out.println("File not found ");
            System.exit(0);
        }
        catch (IOException e)
        {
            System.out.println("Unexpected I/O error occured");
        }
        checkRead(s);
        return s;
    }

    /**
     * Method to check whether 2.10 done correctly
     */
    public void checkRead(ArrayList<Subject> subjects)
    {
        for (int i = 0; i < subjects.size(); i++)
        {
            System.out.println("SubjectName is " + subjects.get(i).getSubjectName());
            System.out.println("UnitCode is " + subjects.get(i).getUnitCode());
            System.out.println("Lecturer is " + subjects.get(i).getLecturer());
            System.out.println("Term is " + subjects.get(i).getTerm());
            System.out.println();
        }
    }
}
