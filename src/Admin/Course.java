
package Admin;

import static Admin.AdminDashboard2.getAllCourses;
import java.io.Serializable;

public class Course implements Serializable {

    static Instructor TBA = new Instructor();
    // Data Fields
    private String name;
    private String code;
    private int maxNbStudents;
    String type;
    private Instructor CourseInstructor;

    // Constructors
    public Course(String name, String code, int maxNbStudents, Instructor i) {
        this.name = name;
        this.code = code;
        this.maxNbStudents = maxNbStudents;
        this.CourseInstructor= i;
    }

    public Course() {
        
        this("Unknown", "Unknown", -1,TBA);
    }

    // Setters and Getters
    public void setName(String name) {
        this.name = name;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setMaxNbStudents(int maxNbStudents) {
        this.maxNbStudents = maxNbStudents;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public int getMaxNbStudents() {
        return maxNbStudents;
    }

    @Override
    public String toString() {
        return "Course{" + "name=" + name + ", code=" + code + ", maxNbStudents=" + maxNbStudents + '}';
    }

    public static Instructor getTBA() {
        return TBA;
    }

    public static void setTBA(Instructor TBA) {
        Course.TBA = TBA;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Instructor getCourseInstructor() {
        return CourseInstructor;
    }

    public void setCourseInstructor(Instructor CourseInstructor) {
        this.CourseInstructor = CourseInstructor;
    }

}
