public class Main {

    private static final int PATTERN_SIZE = 5;
    public static void main(String[] args) {


        int columnno = 0;
        while (columnno < PATTERN_SIZE) {


            int rowno = 0;
            while (rowno <= columnno) {

                System.out.print("*["+ rowno +"," +columnno+ "] \t");
                rowno++;
            }
            System.out.println();
            columnno++;
        }
    }
}