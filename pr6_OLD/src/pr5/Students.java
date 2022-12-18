package pr5;

public class Students implements Comparator {
    int grade;
    String name;
    int idNumber;
    Students(String name, int grade, int idNumber)
    {
        this.grade=grade;
        this.name=name;
        this.idNumber = idNumber;
    }

    public void insertionSort(Students[] array) {
        for (int i = 1; i < array.length; i++) {
            Students current = array[i];
            int j = i - 1;
            while(j >= 0 && current.idNumber < array[j].idNumber) { // слева ищем ближайщий меньший
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = current;
        }
    }
    public boolean compareTo(Comparator s1, Comparator s2)
    {
        if (((Students)s1).grade < ((Students)s2).grade)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
