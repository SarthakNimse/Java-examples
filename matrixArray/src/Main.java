import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int b= sc.nextInt();
    int c = sc.nextInt();

    int max = a;
    if(b > max){
        max = b;
    }
    if(c > max){
        max = c;
    }

System.out.println("Maximum Number bETWEEN THE THREE IS " +max);



    }}
