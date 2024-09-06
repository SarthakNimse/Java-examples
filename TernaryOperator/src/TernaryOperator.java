import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Positive Number");
        int no1 = sc.nextInt();
        System.out.println("Enter another Positive number ");
        int no2 =sc.nextInt();

        int a = Integer.valueOf(no1);
        int b = Integer.valueOf(no2);


        System.out.println((a >= b)? "a is Greater then b" : "b is greater then a" );



    }
}