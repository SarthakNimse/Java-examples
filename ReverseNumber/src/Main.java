import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Positive number");
       int no = sc.nextInt();

        int ans = 0;

        while(no  > 0){
            int rem = no % 10;
             no /= 10;
            ans = ans * 10 + rem;

        } System.out.println(ans);

    }
}