import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The First Number \t");
        int num1 = sc.nextInt();

        System.out.println("Enter The Second Number \t");
        int num2 = sc.nextInt();

        System.out.println("Select Operation which you want to use(+, - , * ,/)\t");
        char operater = sc.next().charAt(0);

        int result;

        switch(operater){

            case '+':
                result = num1 + num2;
                System.out.println("Result IS " +result);
               break;

            case'-':
                result=num1 - num2;
                System.out.println("Result Is " +result);
                break;

            case'*':
                result=num1 * num2;
                System.out.println("Result Is " +result);
                break;

            case'/':
                result = num1/num2;
                System.out.println("Result IS " +result);
                break;

            default:
                System.out.println("INAPPROPRIATE NUMBER/CHARACTER/INTEGER");








        }
    }
}