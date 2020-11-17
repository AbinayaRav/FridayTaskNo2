package fridayTask2Example;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word to find the frequency of consecutive letters in it :");
        String s = new String(scan.nextLine());
        Task1 t = new Task1();
        System.out.println(t.findFrequency(s));
    }
    public StringBuffer findFrequency(String s)
    {
        StringBuffer s1 = new StringBuffer();
        int counter = 1;
        for (int i = 0; i< s.length(); i++)
        {
            while((i+1<s.length())&&(s.charAt(i)==s.charAt(i+1)))
            {
                counter++;
                i++;
            }
            s1.append(s.charAt(i));
            s1.append(counter);
            counter = 1;
        }
        return s1;
    }
}
