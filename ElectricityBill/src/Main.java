import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number Of Units Consumed----->  ");
        double units = sc.nextDouble();

        System.out.print("Enter Rate Per Units Consumed----->  ");
        double rate = sc.nextDouble();

        double fixcharge= 40.30;
        System.out.println("Fixed Charges On Electricity Are----->  "+fixcharge);

        double addcharge=4.20;
        System.out.println("Additional Charges On Electricity Are----->  "+addcharge);

        double totalcost;
        totalcost = units * rate;
        System.out.println("Electricity Bill Without Additional & Fixed Charges is----->  "+totalcost);

        double totalBill;
        totalBill= totalcost + addcharge + fixcharge;
        System.out.println("Total Electricity Bill Of Consumer Is ----->  "+totalBill);


    }
}