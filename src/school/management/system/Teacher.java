package school.management.system;

/**
 *
 * Created by Gregory Roberts on 5/26/21
 * This class is responsible for keeping
 * track of teacher's id, first name, last name, and salary
 *
 */
public class Teacher {

    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    /**
     * Creates a new teacher object
     * @param id id for the teacher: unique
     * @param firstName Teacher's first name
     * @param lastName Teacher's last name
     * @param salary Salary of the teacher
     */
    public Teacher(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    /**
     * Get the id for the teacher
     * @return int: id for teacher
     */
    public int getId() {
        return id;
    }

    /**
     * get the first name for the teacher
     * @return String: first name for the teacher
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * get the last name for the teacher
     * @return String: last name for the teacher
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * get the full name for the teacher as a String
     * @return String: full name for the teacher
     */
    public String getFullName() {
        return firstName + " " + lastName;
    }

    /**
     * get the salary for the teacher
     * @return int: salary for the teacher
     */
    public int getSalary() {
        return salary;
    }

    /**
     * Set the salary for the teacher
     * @param salary the teacher's new salary
     */
    public void setSalary(int salary) {
        this.salary = salary;
    }


}
