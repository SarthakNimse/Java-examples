import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        System.out.println("Enter names (separated by spaces)  ");

        while(true){
            String name = sc.nextLine();

            if(name.equalsIgnoreCase("done")){
                break;
            }
            names.add(name);
        }

        System.out.println("The Raw Arraylist that we have is  "+names);


        Collections.sort(names);

        System.out.println("Sorted ArrayList In Alphabetical Format is  "+names);



    }
}