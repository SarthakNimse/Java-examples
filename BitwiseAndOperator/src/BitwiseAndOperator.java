import java.util.Scanner;

public class BitwiseAndOperator {



     private static void bitwiseAndOperation(){

     }
    public static void main(String[] args) {

        System.out.println("Please enter two values ");
        Scanner sc = new Scanner(System.in);
                 firstnumber = Integer.valueOf(sc.nextLine());
                 secondnumber = Integer.valueOf(sc.nextLine());

        int result = firstnumber & secondnumber;
        System.out.println("bitwise And Result " + result);

        bitwiseAndOperation();


    }
}