import java.util.Scanner;



public class Evenodd{
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a Positive Number: ");

        int no1 = scanner.nextInt();

        int a= Integer.valueOf(no1);

        if(no1 % 2 == 0){
            System.out.println("Given number is Even");
        }else{
            System.out.println("Given number is odd");
        }
    }
}