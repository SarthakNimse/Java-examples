import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        HashSet<String>set1 = new HashSet<>();

        set1.add("Ravi");
        set1.add("Ravi");
        set1.add("Ajay");
        set1.add("Vijay");
        set1.add("Ajay");
        set1.add("Yogesh");
        set1.add("");
        System.out.println(set1);

        set1.remove(4);
        System.out.println(set1);

        set1.remove(5);
        System.out.println(set1);

        set1.remove(1);
        System.out.println(set1);

        set1.removeAll(set1);
        System.out.println(set1);


    }


    }
