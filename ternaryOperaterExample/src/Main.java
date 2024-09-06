import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new  Scanner(System.in);
        System.out.println("Enter Any Number ");
        int no1 = sc.nextInt();
        System.out.println("Enter Another Number");
        int no2 = sc.nextInt();

        int a = Integer.valueOf(no1);
        int b = Integer.valueOf(no2);


        System.out.println((a > b) ? "Then a  Is Larger" : (b > a) ? " Then b Is Larger" : "Both number are Equal");
    }
}