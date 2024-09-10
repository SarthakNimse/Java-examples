import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        System.out.println("Enter A Positive Number : ");
        int no = sc.nextInt();

        int Result= 1;

        for(int i =1; i <=no; i++){

            Result = Result * i ;

            //System.out.println("Factorialof"+no+ "is " +Result);


        }
        System.out.println("Factorialof "+no+ "is " +Result);

    }
}