import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new  Scanner(System.in);
        System.out.println("Enter Any Positive Number ");
        int no = sc.nextInt();

        int sum = 0;
        int product = 1;
        int temp = no;

        while( temp> 0){

            int digit = temp % 10;
            sum += digit;
            product *= digit;
            temp /= 10;

        }
        int result = product - sum;

        System.out.println("Answer Of The Given Program Is " +result);
    }
}