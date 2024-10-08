import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//Define two methods to print the maximum and the minimum number respectively
// among three numbers entered by the user. in java using functions
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any 3 Numbers");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        Maximum(num1,num2,num3);
        Minimum(num1,num2,num3);
    }

        static void Minimum(int a , int b, int c) {

        int min = a;

        if (b < min) {
            b = min;
        }
        if(c < min){

            c = min;
        }

        System.out.println("Minimum Number Between This Three Number Is " +min);
    }


    static void Maximum(int a, int b, int c){

        int max = a;

        if(b > max){

            max = b;
        }
        if(c > max){

            max = c;

        }
        System.out.println("Maximum Number Between This THree NUmbers Is " +max);

    }


}
