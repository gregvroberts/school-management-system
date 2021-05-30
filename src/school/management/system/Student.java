package school.management.system;

/**
 *
 * Created by Gregory Roberts on 5/26/21
 * This class is responsible for keeping
 * track of student id, first name, last name, grade, fees paid, and fees owed
 *
 */
public class Student {

    private int id;
    private String firstName;
    private String lastName;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    /**
     * To create a new student object by initializing the values
     * Fees for every student is $30,000 / yr.
     * Fees paid initially is $0.
     *
     * @param id id for the student: unique value
     * @param firstName first name of the student
     * @param lastName last name of the student
     * @param grade grade of the student
     */
    public Student(int id, String firstName, String lastName, int grade) {

        this.feesPaid = 0;
        this.feesTotal = 30000;
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;

    }

    //Not going to alter student's name

    /**
     * Used to update the student's grade
     *
     * @param grade new grade of the student
     */
    public void setGrade(int grade) {
        this.grade = grade;
    }

    /**
     * Pays the selected amount as fees to the student's school
     * @param fees the fees that the student pays
     */
    public void payFees(int fees) {
        this.feesPaid+=fees;
    }

    /**
     *  Get the students id
     * @return id for the student
     */
    public int getId() {
        return id;
    }

    /**
     * Get the student's first name
     * @return String: student's first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * get the student's last name
     * @return String: student's last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * get the student's grade
     * @return int: the student's grade
     */
    public int getGrade() {
        return grade;
    }

    /**
     * get the student's total fees paid
     * @return int: the studen't total fees paid amt
     */
    public int getFeesPaid() {
        return feesPaid;
    }

    /**
     * get the total fees due for the student
     * @return int: the total fees the student has due
     */
    public int getFeesTotal() {
        return feesTotal;
    }

    public int getRemainingFees() {
        return feesTotal - feesPaid;
    }

}
