import java.awt.geom.Area;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
          Circle();
          Triangle();
          Rectangle();
          Parallelogram();
    }
    static void Circle(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Radius Of Circle--->  ");

        int r = sc.nextInt();
        double pi = 3.14;
        double Area;

        Area = pi * r * r;

        System.out.println("Area Of Circle Is--->   " +Area);
        System.out.println("----------------------------------------------------------------------------");
    }

   static void Triangle() {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the height of Triangle--->  ");
       int height = sc.nextInt();
       System.out.print("Enter The Base Of Triangle--->   ");
       int base = sc.nextInt();
       double Area;

       Area = 0.5 * height * base;

       System.out.println("Area Of Triangle Is--->   " + Area);
       System.out.println("----------------------------------------------------------------------------");
   }
   static void Rectangle() {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter Length of Rectangle--->    ");
       int length = sc.nextInt();
       System.out.print("Enter Width of Rectangle--->    ");
       int width = sc.nextInt();

       double Area;

       Area = length * width;
       System.out.println("Area Of Rectangle Is--->   " + Area);
       System.out.println("----------------------------------------------------------------------------");
   }

       static void Parallelogram() {

           Scanner sc = new Scanner(System.in);
           System.out.print("Enter the height of Parallelogram--->  ");
           int height = sc.nextInt();
           System.out.print("Enter The Base Of Parallelogram--->   ");
           int base = sc.nextInt();
           double Area;

           Area = height * base;

           System.out.println("Area Of Parallelogram Is--->   " + Area);

           System.out.println("----------------------------------------------------------------------------");

       }

       

}
