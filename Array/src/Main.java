import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Marks Of any 5 Subjects ");

        int[] subjectMarks = new int[5];
        subjectMarks[0] = scanner.nextInt();
        subjectMarks[1] = scanner.nextInt();
        subjectMarks[2] = scanner.nextInt();
        subjectMarks[3] = scanner.nextInt();
        subjectMarks[4] = scanner.nextInt();

        int position = 0;
        while(position<= 4) {
            System.out.println("5 Subjects marks are = " + position + "=" + subjectMarks[position]);
            position++;
        }



    }
}