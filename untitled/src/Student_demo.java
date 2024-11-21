import java.util.ArrayList;
import java.util.List;

public class Student_demo {
    public static void main(String[] args) {

        Student shantanu = new Student();
        shantanu.name = "Shantanu Rangari";
        shantanu.roll_no = 01;
        shantanu.departement = "Computer Science";

        Student yogesh = new Student();
        yogesh.name = "Yogesh Jadhav";
        yogesh.roll_no = 03;
        yogesh.departement = "Electrical";


        List<Student> studentlist = new ArrayList<>();
        studentlist.add(shantanu);
        studentlist.add(yogesh);


        for (Student student : studentlist) {

            System.out.println("Student Information Is As Follows " + student);
        }
    }
}
