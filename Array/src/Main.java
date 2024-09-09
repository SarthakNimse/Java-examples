import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The Name Of Ticket Holder ");

        String[] TicketDetails = new String[5];
        TicketDetails[0] = scanner.nextLine();

        System.out.println("Enter The Ticket Number ");
        TicketDetails[1] = scanner.nextLine();

        TicketDetails[2] = scanner.nextLine();
        TicketDetails[3] = scanner.nextLine();
        TicketDetails[4] = scanner.nextLine();

       int position = 0;
        while(position<= 4) {
            System.out.println("5 Subjects marks are = " + position + "=" + TicketDetails[position]);
            position++;
        }



    }
}