import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Member
{
    private String name;
    private int age;

    public Member()
    {
        name = "";
        age = 0;
    }

    public Member(String newName, int newAge)
    {
        name = newName;
        age = newAge;
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public static void testIterator()
    {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("ab");
        list.add("abc");
        Iterator<String> it = list.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }

    public static void testInput()
    {
        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();
        String a = scan.nextLine();
        String name = scan.nextLine();
        System.out.println(age + "," + name);
    }
}
