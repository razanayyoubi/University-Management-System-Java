
package Admin;

import java.io.Serializable;

public class Student extends Person implements Comparable, Serializable {

    // Data Fields
    private int ID;
    static int IDCounter = 1;

    static int totalNbStudents;
    private static int studentsCounter = 0;

    // Constructors
    public Student(String name, int age, int ssn, String phoneNb, String address) { // add age here
        super(name, age, ssn, address, phoneNb);
        this.ID = IDCounter++;

    }

    public Student() {
        this.ID = IDCounter++;
    }

    // Setters and Getters
    public int getID() {
        return ID;
    }

    public static int getTotalNbStudents() {
        return totalNbStudents;
    }

    public static void setTotalNbStudents(int totalNbStudents) {
        Student.totalNbStudents = totalNbStudents;
    }

    // Methods
    @Override
    public int compareTo(Object o) {
        if (o instanceof Student) {
            Student other = (Student) o;
            if (this.ID > other.getID()) {
                return 1;
            } else if (this.ID < other.getID()) {
                return -1;
            } else {
                return 0;
            }
        } else {
            throw new IllegalArgumentException("Object is not a Student");
        }
    }

    @Override
    public String toString() {
        return "Student{" + "ID=" + ID + ", name=" + super.getName() + ", SSN=" + super.getSsn()
                + ", phoneNb=" + super.getPhoneNb() + ", address=" + super.getAddress() + '}';
    }

    public static int getIDCounter() {
        return IDCounter;
    }

    public static void setIDCounter(int IDCounter) {
        Student.IDCounter = IDCounter;
    }

}


