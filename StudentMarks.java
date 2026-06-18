import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[5];

        System.out.println("Enter marks of 5 students:");
        for (int i = 0; i < marks.length; i++) {
            marks[i] = sc.nextInt();
        }

        int sum = 0;
        for (int m : marks) {
            sum += m;
        }

        double average = (double) sum / marks.length;
        System.out.println("\nAverage marks: " + average);


        int highest = marks[0];
        for (int m : marks) {
            if (m > highest) {
                highest = m;
            }
        }
        System.out.println("Highest marks: " + highest);

        int countAboveAvg = 0;
        for (int m : marks) {
            if (m > average) {
                countAboveAvg++;
            }
        }
        System.out.println("Number of students scoring above average: " + countAboveAvg);
    }
}

