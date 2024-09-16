import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Marks To Get Your Grade  ");
        int score = sc.nextInt();

        if(score >= 75 && score <=99){
            System.out.println("Your Grade Is A");

        }else if(score >= 60 && score < 75){
            System.out.println("Your Grade Is B");

        }else if(score >= 35 && score <60){
            System.out.println("Your Grade Is C");

        }else if(score == 100){
            System.out.println("Congratulations You Got 100 $$$$$$$$$ & Your Grade IS A++");

        }else{
            System.out.println("You Are Fail Dumb Guy!!!!!!!!!!!!GO STUDY HARD!!!!!!!!!!!!!!!!");
        }
    }
}