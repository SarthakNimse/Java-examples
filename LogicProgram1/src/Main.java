public class Main {

    private static final int PATTERN_SIZE = 5;
    public static void main(String[] args) {



        int lineNo = 0;
        while(lineNo < PATTERN_SIZE){

         int columNo = PATTERN_SIZE - lineNo;
         while(columNo > 0){
             System.out.print("*\t");
             columNo--;
         }
            System.out.println();
            lineNo++;
        }
        //System.out.println(lineNo);
        //lineNo--;





        }
    }
