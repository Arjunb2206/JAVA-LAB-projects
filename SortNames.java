import java.util.*;

public class SortNames {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        students.add("Arjun");
        students.add("Ravi");
        students.add("Meena");
        students.add("Kiran");

        System.out.println("Original List: " + students);

        Collections.sort(students); 
        System.out.println("Sorted List: " + students);
    }
}
