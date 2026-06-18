import java.util.Scanner;

public class StudentMarks01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] marks = new int[n][3];  
        int[] total = new int[n];
        double[] average = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter marks for Student " + (i+1) + ":");
            for (int j = 0; j < 3; j++) {
                marks[i][j] = sc.nextInt();
                total[i] += marks[i][j];
            }
            average[i] = total[i] / 3.0;
        }

        System.out.println("\nResults:");
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i+1) + " - Total: " + total[i] + ", Average: " + average[i]);
        }

    }
}
