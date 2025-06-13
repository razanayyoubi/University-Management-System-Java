
package Admin;

import java.util.ArrayList;

public class Instructor extends Person {

    private String instructorMajor;
    private String department;

    private static int nbInstructorCounter = 0;

    public Instructor(String instructorMajor, String department, String name, int age, int ssn, String address, String phoneNb) {
        super(name, age, ssn, address, phoneNb);
        this.instructorMajor = instructorMajor;
        this.department = department;
    }

    public Instructor() {
        this.instructorMajor="unknown";
        this.department="unknown";
    }
    
    public String getInstructorMajor() {
        return instructorMajor;
    }

    public void setInstructorMajor(String instructorMajor) {
        this.instructorMajor = instructorMajor;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public static int getNbInstructorCounter() {
        return nbInstructorCounter;
    }

    @Override
    public String toString() {
        return "Instructor{" + "instructorMajor=" + instructorMajor + ", department=" + department + '}';
    }
    
    
}
