import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        13        Scanner in = new Scanner(System.in);1415        System.out.print("How many numbers do you need to draw? ");16        int k = in.nextInt();1718        System.out.print("What is the highest number you can draw? ");19        int n = in.nextInt();2021        /*22         * compute binomial coefficient n*(n-1)*(n-2)*...*(n- k+1)/(1*2*3*...*k)23         */2425        BigInteger lotteryOdds = BigInteger.valueOf(1);2627        for (int i = 1; i <= k; i++)28           lotteryOdds = lotteryOdds.multiply(BigInteger.valueOf(n - i + 1)).divide(29                 BigInteger.valueOf(i));3031        System.out.println("Your odds are 1 in " + lotteryOdds + ". Good luck!");32     }33  }
    }
}