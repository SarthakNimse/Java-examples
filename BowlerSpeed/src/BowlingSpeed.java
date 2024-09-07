import java.util.Scanner;

public class BowlingSpeed {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Bowling Speed Of Over per Ball ");

        int[] BowlingSpeed = new int[6];
                BowlingSpeed[0] = sc.nextInt();
                BowlingSpeed[1] = sc.nextInt();
                BowlingSpeed[2] = sc.nextInt();
                BowlingSpeed[3] = sc.nextInt();
                BowlingSpeed[4] = sc.nextInt();
                BowlingSpeed[5] = sc.nextInt();

                int position = 0;
                while(position <= 6){
                    System.out.println("Bowling Speed Of Eache Ball Of Ball ="+  BowlingSpeed[position]);
                    position++;
                }


    }
}