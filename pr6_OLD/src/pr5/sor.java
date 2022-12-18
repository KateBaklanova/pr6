package pr5;

import java.util.Random;

public class sor {

    public static void mergeSort(Comparator[] a, int n) {
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        Comparator[] l = new Comparator[mid];
        Comparator[] r = new Comparator[n - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = a[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = a[i];
        }
        mergeSort(l, mid);
        mergeSort(r, n - mid); // сортируем и потом сливаем вместе
        // System.out.println(mid);

        // System.out.println(n-mid);

        merge(a, l, r, mid, n - mid);
    }

    public static void merge(
            Comparator[] a, Comparator[] l, Comparator[] r, int left, int right) {
        // сливаем в один массив, возвращаем в a
        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (!(l[i].compareTo(l[i], r[j]))) {
                a[k++] = l[i++];
            }
            else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
    }

    public static void main (String[] args)
    {
        Students[] students1; // объявление массива
        students1 = new Students[100];
        sor list = new sor();
        for (int i =0; i<100; i++)
        {
            Random rand = new Random();
            students1[i] = new Students("no", rand.nextInt(6), 1);
        }

        Students[] students2; // объявление массива
        students2 = new Students[100];
        for (int i =0; i<100; i++)
        {
            Random rand = new Random();
            students2[i] = new Students("no", rand.nextInt(6), 1);
        }
        Students[] students3 = new Students[200];

        list.mergeSort(students1, 100);
        list.mergeSort(students2, 100);
        list.merge(students3, students2, students1, 100, 100);
        list.mergeSort(students3, 200);

        for (int i =0; i<200; i++)
        {
            System.out.print(students3[i].grade+" ");
        }
    }
}
