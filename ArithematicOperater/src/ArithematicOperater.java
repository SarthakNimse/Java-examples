import java.util.Scanner;

  public class ArithematicOperater {
    public static void main(String[] args) {

        System.out.println("Plz Enter A Positive Number: ");

        Scanner scanner= new Scanner(System.in);
        int no = scanner.nextInt();

        System.out.println("Plz Enter Another Positive Number: ");
        int no2 = scanner.nextInt();

        int a = Integer.valueOf(no);
        int b = Integer.valueOf(no2);

        if(a<=b){
            System.out.println("Integer a is less then or equal to b");
        }else{
            System.out.println("Integer a is greater then or equal to b");
        }
    }
}