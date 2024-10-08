import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //A person is eligible to vote if his/her age is greater than or equal to 18.
        // Define a method to find out if he/she is eligible to vote.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Name Of The Person");
        String name = sc.next();
        System.out.println("Enter The Age OF He/She ");
        int age = sc.nextInt();


        ElectionAge(age,name);
    }

    static void ElectionAge(int a, String b){

        if(a >= 18){
            System.out.println("Given Person " + b +" Is Eligeble For Voting!!!");
        }else{
            System.out.println("Given Person " + b +" Is NOT ELigeble For Voting");
        }

    }
}