import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        float[] marks = new float[8];
        float sum = 0, avg;
        int i, n;
        System.out.print("Enter number of Subjects: ");
        n = s.nextInt();
        System.out.print("Enter Marks Obtained in each Subjects: ");
        for (i = 0; i < n; i++)
            marks[i] = s.nextFloat();
        for (i = 0; i < n; i++)
            sum = sum + marks[i];
        avg = sum / n;
        System.out.print("\nGrade = ");
        if (avg >= 90) {
            System.out.println("O");
        } else if (avg >= 80 && avg < 90) {
            System.out.println("A+");
        } else if (avg >= 70 && avg < 80) {
            System.out.println("A");
        } else if (avg >= 60 && avg < 70) {
            System.out.println("B+");
        } else if (avg >= 50 && avg < 60) {
            System.out.println("B");
        } else if (avg >= 40 && avg < 50) {
            System.out.println("C");
        } else if (avg > 40) {
            System.out.println("F");
        } else {
            System.out.println("Absent");
        }
    }
}
