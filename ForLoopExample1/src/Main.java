import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Any Positive  no \t");
        int no = sc.nextInt();

        int no1 = 1;


        for(no1=1 ; no1 <=10; no1++ ){

            int result = no * no1;

            System.out.println(no + " x " + no1+ " = " + result);


        }
    }

    }
