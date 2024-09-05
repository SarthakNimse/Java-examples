import java.util.Scanner;

public class Andoperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a positive number : ");
        int no = scanner.nextInt();
        int a = Integer.valueOf(no);

        if (no % 2 == 0 && no > 100) {
            System.out.println("-------------This no is Titanium No------------------");
        }

        if (no % 2 == 0 && no < 100) {
            System.out.println("-------------This no is Golden No------------------");
        }
        if (no % 2 == 0 && no >= 100) {
            System.out.println("-------------This no is Silver No------------------");
        }

        if (no % 2 == 0 && no <= 100) {
            System.out.println("-------------This no is Platinum No------------------");
        }

    }
}
