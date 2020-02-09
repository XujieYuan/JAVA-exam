import com.sun.xml.internal.xsom.impl.scd.Step;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Exercise
{
    //private ArrayList<Student> tutorialGroup;


    public void beginExercise()
    {
        showMenu();
        begin();
    }

    public void showMenu()
    {
        System.out.println("Press 1 to do exercise 33");
        System.out.println("Press 2 to find longest String in array");
        System.out.println("Press 3 to find longest String in ArrayList");
        System.out.println("Press 4 to find shortest String in array");
        System.out.println("Press 5 to find shortest String in ArrayList");
        System.out.println("Press 6 to do exercise 35");
        System.out.println("Press 7 to print stars1");
        System.out.println("Press 8 to print stars2");
        System.out.println("Press 9 to print Dengyao Sanjiaoxing");
        System.out.println("Press 0 to go back to the main menu");
    }

    public void begin()
    {
        Scanner scan = new Scanner(System.in);
        String choice = scan.nextLine();
        switch (choice)
        {
            case "1":
                ArrayList<String> name = new ArrayList<>();
                name.add(0, "A");
                name.add(1, "B");
                name.add(2, "C");
                name.add(3, "D");
                name.add(4, "E");
                name.add(5, "F");
                studentName(name);
                begin();
                break;
            case "2":
                String[] s = {"ab", "z", "abc", "abcdefg"};
                findLongestIna(s);
                begin();
                break;
            case "3":
                ArrayList<String> S = new ArrayList<>();
                S.add("aaa");
                S.add("ab");
                S.add("abcdef");
                S.add("abcd");
                findLongestInA(S);
                begin();
                break;
            case "4":
                String[] s1 = {"ab", "z", "abc", "abcdefg"};
                findShortestIna(s1);
                begin();
                break;
            case "5":
                ArrayList<String> S1 = new ArrayList<>();
                S1.add("aaa");
                S1.add("ab");
                S1.add("abcdef");
                S1.add("abcd");
                findShortestInA(S1);
                begin();
                break;
            case "6":
                validateLength();
                begin();
                break;
            case "7":
                star1();
                begin();
                break;
            case "8":
                star2();
                begin();
                break;
            case "9":
                star();
                begin();
                break;
            case "0":
                Review review = new Review();
                review.start();
                break;
            default:
                System.out.println("Invalid choice, please choose again!");
                begin();
                break;
        }
    }

    /**
     * Method for exercise 33
     *
     * @param students
     * @return
     */
    public String studentName(ArrayList<String> students)
    {
        String content = "";
        Iterator<String> it = students.iterator();
        StringBuffer sb = new StringBuffer();
        int i = 0;
        while (it.hasNext())
        {
            String current = it.next();
            if (i % 2 == 1)
            {
                sb.append(current);
            }
            i++;
        }
        content = sb.toString();
        System.out.println(content);
        return content;
    }

    /**
     * Method for find longest String in array
     */
    public String findLongestInA(ArrayList<String> S)
    {
        int longest = 0;
        String output = "";
        for (String str : S)
        {
            if (str.length() > longest)
            {
                longest += str.length();
                output = str;
            }
        }
        System.out.println(output);
        return output;
    }

    /**
     * Method for find longest String in ArrayList
     */
    public String findLongestIna(String[] s)
    {
        int longest = 0;
        String output = "";
        for (String str : s)
        {
            if (str.length() > longest)
            {
                longest += str.length();
                output = str;
            }
        }
        System.out.println(output);
        return output;
    }

    /**
     * Method for find shortest String in array
     *
     * @param s
     * @return
     */
    public String findShortestIna(String[] s)
    {
        String output = "";
        for (int i = 0; i < s.length; i++)
        {
            for (int j = 0; j < s.length - 1; j++)
            {
                if (s[j].length() > s[j + 1].length())
                {
                    output = s[j];
                    s[j] = s[j + 1];
                    s[j + 1] = output;
                }
            }
        }
        System.out.println(output);
        return output;
    }

    /**
     * Method for find shortest String in ArrayList
     *
     * @param S
     * @return
     */
    public String findShortestInA(ArrayList<String> S)
    {
        int longest = 0;
        String output = "";
        for (String str : S)
        {
            if (str.length() > longest)
            {
                longest += str.length();
                output = str;
            }
        }
        System.out.println(output);
        return output;
    }

    /**
     * Method for exercise 35
     *
     * @return
     */
    public boolean validateLength()
    {
        boolean check = true;
        Scanner console = new Scanner(System.in);
        String input = console.nextLine();
        if (input.length() < 3 || input.length() > 5)
        {
            check = false;
        }
        if (input.trim().equals(""))
        {
            System.out.println("Input is empty");
            check = false;
        }
        System.out.println(check);
        return check;
    }

    public void star1()//Fan
    {
        Scanner scan = new Scanner(System.in);
        int linesNumber = scan.nextInt();
        for (int i = 1; i <= linesNumber; i++)
        {
            for (int j = linesNumber; j >= i; j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void star2()//Zheng
    {
        Scanner console = new Scanner(System.in);
        int linesNumber = console.nextInt();
        for (int i = 1; i <= linesNumber; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void star()//Dengyao sanjiaoxing
    {
        Scanner console = new Scanner(System.in);
        int linesNumber = console.nextInt();
        for (int i = 1; i <= linesNumber; i++)
        {
            for (int j = linesNumber - i; j >= 1; j--)
            {
                System.out.print(" ");
            }
            for (int m = 1; m <= 2 * i - 1; m++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
