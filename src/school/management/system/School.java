package school.management.system;

import java.util.List;

/**
 * Many teachers, many students.
 *
 * Implements teachers and students
 * using an ArrayList
 * Created by Gregory Roberts on 5/26/21
 * This class is responsible for keeping
 * track of a school.
 *
 */

public class School {

    private List<Teacher> teachers;
    private List<Student> students;
    private static int totalMoneyEarned;
    private static int totalMoneySpent;

    /**
     * A new school object is created.
     * @param teachers The list of teachers in the school
     * @param students This is a list of students in the school
     */
    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned = 0;
        totalMoneySpent = 0;
    }

    /**
     * returns the list of teachers in the school
     * @return List of teachers
     */
    public List<Teacher> getTeachers() {
        return teachers;
    }

    /**
     * Adds a teacher to the school
     * @param teacher the teacher to be added in the school
     */
    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    /**
     * Adds multiple teachers to the school
     * @param teachers the teachers to be added in the school
     */
    public void addTeacher(List<Teacher> teachers) {
        this.teachers.addAll(teachers);
    }

    /**
     * Gets a list of students in the school
     * @return returns the list of students in the school
     */
    public List<Student> getStudents() {
        return students;
    }

    /**
     * Adds a student to the school
     * @param student the student to be added to the school
     */
    public void addStudents(Student student) {
        students.add(student);
    }

    /**
     * Adds multiple students to the school
     * @param students the students to be added to the school
     */
    public void addStudents(List<Student> students) {
        this.students.addAll(students);
    }

    /**
     * gets the total money earned by the school
     * @return int: total money earned by the school
     */
    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    /**
     * adds money earned by the school, to total money earned
     * @param totalMoneyEarned int: the money that is supposed to be added
     */
    public static void addTotalMoneyEarned(int totalMoneyEarned) {
        totalMoneyEarned += totalMoneyEarned;
    }

    /**
     * gets the total money spent by the school
     * @return int: the total money spent by the school
     */
    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    /**
     * updates total money spent by the school which
     * is the salary given by the school to its teachers
     * @param moneySpent int: the money spent by the school
     */
    public void updateTotalMoneySpent(int moneySpent) {
        this.totalMoneySpent-=moneySpent;
    }
}
