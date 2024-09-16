import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Any Positive number:- ");
        int num = sc.nextInt();

        switch(num % 2 ){
            case 0:
                System.out.println("The Number Is EVEN");
                break;
            case 1:
                System.out.println("The Number Is ODD");
                break;

        }

    }
}