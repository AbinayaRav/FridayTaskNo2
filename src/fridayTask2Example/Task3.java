package fridayTask2Example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the  size of the first array : ");
        int n = scan.nextInt();
        Integer[] a = new Integer[n];
        System.out.println("Enter the array elements : ");
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        System.out.println("Enter the  size of the second array : ");
        int m = scan.nextInt();
        Integer[] b = new Integer[m];
        System.out.println("Enter the array elements : ");
        for (int j = 0; j < m; j++) {
            b[j] = scan.nextInt();
        }
        ArrayList<Integer> arrl1 = new ArrayList<Integer>(Arrays.asList(a));
        ArrayList<Integer> arrl2 = new ArrayList<Integer>(Arrays.asList(b));
        arrl1.addAll(arrl2);
        System.out.println(arrl1);
    }
}
