package fridayTask2Example;

import java.util.*;

public class Task2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the  size of the array whose subsets need to be displayed : ");
        int n = scan.nextInt();
        int[] set = new int[n];
        System.out.println("Enter the array elements : ");
        for (int i = 0; i < n; i++) {
            set[i] = scan.nextInt();
        }
        Task2 t = new Task2();
        Map<Integer, String> result = new HashMap<Integer, String>();
        result = t.getSubsets(set);
        int max = 0;
        for(int key : result.keySet())
        {
            if(key>max) {
                max = key;
            }
        }
        System.out.println("The consecutive subset that gives the maximum sum value from the input array is :\n"+result.get(max));
    }
    public Map<Integer, String> getSubsets(int set[])
    {
        int n = set.length;
        ArrayList<Integer> result = new ArrayList<Integer>();
        Map<Integer, String> map = new HashMap<Integer, String>();
        for (int i = 0; i < (1<<n); i++)
        {
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) > 0) {
                    result.add(set[j]);
                }
            }
            int l = 0;
            for(int k : result)
            {
                l = k+l;
            }
            map.put(l, result.toString());
            result.clear();
        }
        return map;
    }

}
