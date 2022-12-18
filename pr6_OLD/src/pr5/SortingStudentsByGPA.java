package pr5;
import java.util.Random;

public class SortingStudentsByGPA {

     public int partition(Comparator[] array, int begin, int end) {
        int pivot = end; // опорный элемент

        int counter = begin;
        for (int i = begin; i < end; i++) {
            if (array[i].compareTo(array[i], array[pivot])) {
                Comparator temp = array[counter];
                array[counter] = array[i];
                array[i] = temp;
                counter++;
            }
        }
        Comparator temp = array[pivot]; // меняем местами
        array[pivot] = array[counter];
        array[counter] = temp;

        return counter;
    }

    public void quickSort(Comparator[] array, int begin, int end) {
        if (end <= begin) return;
        int pivot = partition(array, begin, end); // раскидывание меньшее влево, большее вправо
        quickSort(array, begin, pivot-1); // слева и справа рекурсивно
        quickSort(array, pivot+1, end);
    }

        public static void main (String args[])
        {

            Students[] students; // объявление массива
            students = new Students[100];
            SortingStudentsByGPA list = new SortingStudentsByGPA();
            for (int i =0; i<100; i++)
            {
                 Random rand = new Random();
                 students[i] = new Students("no", rand.nextInt(6), 1);
            }


            for (int i =0 ; i < students.length; i++)
            {
                System.out.print(students[i].grade + " ");
            }

            list.quickSort(students, 0, 99);

            for (int i =0 ; i < students.length; i++)
            {
                System.out.println(students[i].grade + " ");
            }

        }

}
