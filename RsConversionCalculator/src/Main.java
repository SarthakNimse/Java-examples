import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int option;
        System.out.println("--------------------Choose An Option From The Given Selection ------------------ ");
        System.out.println("1.INR TO Us Doller ");
        System.out.println("2.INR TO Pounds ");
        System.out.println("3.INR To Rubel ");
        System.out.println("4.INR To Dinnar");
        System.out.println("5.Exit ");

        System.out.println("Enter User Choice: ");
         option = sc.nextInt();

         switch (option){
            case 1:
                System.out.println("Enter The Amount In INR ");
                double INR_TO_USD = sc.nextDouble();
                System.out.println("Conversion Of INR To USD Is:  " +convertInr_To_Pound(INR_TO_USD));
                break;

            case 2:
                System.out.println("Enter The Amount In INR ");
                double INR_TO_Pound = sc.nextDouble();
                System.out.println("Conversion Of INR To Pounds Is:  " +convertInr_To_Pound(INR_TO_Pound));
                break;

            case 3:
                System.out.println("Enter The Amount In INR ");
                double INR_TO_Rubel = sc.nextDouble();
                System.out.println("Conversion OF INR To Rubel Is: " +convertInr_To_Rubel(INR_TO_Rubel));
                break;

            case 4:
                System.out.println("Enter Amount IN INR ");
                double INR_To_Dinnar = sc.nextDouble();
                System.out.println("Conversion Of INR To Dinnar Is:  " +convertInr_To_Dinnar(INR_To_Dinnar));
                break;

            case 5:
                System.out.println("Exiting the Program");
                break;
        }


    }
    // Function to convert INR to USD
    public static double convertInr_To_Usd(double INR) {
        // INR to USD conversion rate
        double USD_Doller_Rate =0.012;
        return INR * USD_Doller_Rate;
    }

    // Function to convert INR to Pound
    public static double convertInr_To_Pound(double INR) {
        // INR to Pound conversion rate
        double Pound_Rate= 0.0090;
        return INR * Pound_Rate;
    }
    //Function to convert INR to Rubel
    public static double convertInr_To_Rubel(double INR) {
        // INR to Rubel Conversion Rate
        double Rubel_Rate = 1.09;
        return INR * Rubel_Rate;
    }
    //Function to convert INR to Dinnar
    public static double convertInr_To_Dinnar(double INR) {
        //INR to Dinnar Conversion Rate
        double Dinnar_Rate = 0.0036;
        return INR * Dinnar_Rate;

    }
}