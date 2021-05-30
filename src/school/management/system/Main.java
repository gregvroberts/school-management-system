package school.management.system;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Gregory Roberts on 5/26/21
 */

public class Main {
    public static void main(String[] args) {
        Teacher lizzy = new Teacher(1, "Lizzy", "Smith", 500);
        Teacher glenn = new Teacher(2, "Glenn", "Brown", 600);
        Teacher adam = new Teacher(3, "Adam", "Sandler", 730);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(lizzy);
        teacherList.add(glenn);
        teacherList.add(adam);

        Student greg = new Student(1, "Greg", "Roberts", 4);
        Student jennifer = new Student(2, "Jennifer", "White", 4);
        Student tanner = new Student(3, "Tanner", "Smith", 4);

        List<Student> studentList = new ArrayList<>();
        studentList.add(greg);
        studentList.add(jennifer);
        studentList.add(tanner);

        School hebHS = new School(teacherList,studentList);
        System.out.println("HEB High School has earned $" + hebHS.getTotalMoneyEarned());

        greg.payFees(5000);

        System.out.println("HEB High School has earned $" + hebHS.getTotalMoneyEarned());

    }
}
