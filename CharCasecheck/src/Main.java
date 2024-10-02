import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Character In Any Case ");

        char ch =sc.next().trim().charAt(0);

        if( ch >= 'a' && ch <= 'z'){
            System.out.println("The Given Character Is in lowercase");
        }else{
            System.out.println("The Given character is in Uppercase");
        }
    }
}