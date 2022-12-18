package pr5;

import java.util.Random;

public class studentTest {
    public static void main (String args[])
    {
        Students[] students = new Students[100];
        for (int i =0; i<100; i++)
        {
            Random rand = new Random();
            students[i] = new Students("no", rand.nextInt(6), rand.nextInt(100));
        }
        students[0].insertionSort(students);
        for (int i =0 ; i < students.length; i++)
        {
            System.out.print(students[i].idNumber + " ");
        }
    }
}
