import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] RunsPerBall = new int[6];
        System.out.println("Enter Run Per Ball ");

        RunsPerBall[0] = sc.nextInt();
        RunsPerBall[1] = sc.nextInt();
        RunsPerBall[2] = sc.nextInt();
        RunsPerBall[3] = sc.nextInt();
        RunsPerBall[4] = sc.nextInt();
        RunsPerBall[5] = sc.nextInt();

        int position = 0;
        while(position < 6){
            System.out.println("Run On the "+position+ "st Ball Of Over IS " + RunsPerBall);
            position++;
        }

    }
}