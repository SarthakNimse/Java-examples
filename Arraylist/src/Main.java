import com.sun.jdi.IntegerValue;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> Fruits = new ArrayList<>();

        //Adding the elements in Arraylist
        Fruits.add("Mango");
        Fruits.add("Apple");
        Fruits.add("Banana");
        Fruits.add("Grapes");
        Fruits.add("Guava");
        Fruits.add("Watermelon");
        Fruits.add("");

        //Sorting in Ascending Order
        Collections.sort(Fruits);
        System.out.println(Fruits);

        System.out.println("----------------------------------------------------------------------");
//      Iterates the list
        Fruits.iterator();
        System.out.println(Fruits);

        System.out.println("----------------------------------------------------------------------");

//Get and Set Method
        System.out.println("Through Get Method gets the index element of list "+Fruits.get(2));

        System.out.println("Through Set Method we change or replace the elemrnt of the list "+Fruits.set(2,"Dragon Fruit"));

        System.out.println("----------------------------------------------------------------------");


        //sorting in descending order
        Collections.sort(Fruits, Collections.reverseOrder());
        System.out.println(Fruits);

        System.out.println("----------------------------------------------------------------------");

        //Displaying the list using for loop
        for (int i = 0; i < Fruits.size(); i++) {
            System.out.println(Fruits.get(i));

        }
        System.out.println("----------------------------------------------------------------------");

//        check if the element conatins in the list or not

        if (Fruits.contains("Guava")) {

            System.out.println("Guava IS Available In the Given Arraylist  " + Fruits);

        } else {
            System.out.println("Guava Is Not Available In Given Arraylist  " + Fruits);
        }

        System.out.println("----------------------------------------------------------------------");

        if (Fruits.contains("DragonFruit")) {
            System.out.println("DragonFruit IS Available In the Given Arraylist  " + Fruits);

        } else {
            System.out.println("DragonFruit IS Not Available In the Given Arraylist  " + Fruits);

        }

        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");

        ArrayList<Integer> number = new ArrayList<>();

        number.add(52);
        number.add(215);
        number.add(35);
        number.add(455);
        number.add(35);
        number.add(25);
        number.add(11115);

        Collections.sort(number);
        System.out.println(number);

        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");

        int minvalue = Collections.min(number);
        System.out.println("Minimum Value In Arraylist IS  " + minvalue);
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");

        int maxvalue = Collections.max(number);
        System.out.println("Maximum Value In Arraylist Is  " + maxvalue);


//Converting Arraylist To Array

        String[] FruitArray = new String[Fruits.size()];
        Fruits.toArray(FruitArray);

        System.out.println("Displaying Array");

        for (String fruit : FruitArray) {
            System.out.println(fruit);

        }
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");

//        To Remove Element From The Array
        number.remove(2);
        System.out.println(number);

        number.remove(Integer.valueOf(25));
        System.out.println(number);


        number.clear();
        System.out.println(number);

    }
    }

