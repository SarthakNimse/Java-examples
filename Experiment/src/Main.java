import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//Armstrong Number Program
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter Any 3 digit Number");
      int no = sc.nextInt();
      int ans;
      int sum = 0;

      while(no > 0) {
          int temp = no %10;
          no = no /= 10;
          sum = sum + temp * temp * temp;

      }
        System.out.println(sum);
      if (sum == no){
          System.out.println("The Given Number Is Armstrong Number");
      }else{
          System.out.println("The Given Number Is Not Armstrong Number");
      }
    }
}