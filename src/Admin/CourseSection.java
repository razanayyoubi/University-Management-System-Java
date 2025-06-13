
package Admin;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public abstract class CourseSection extends Course implements Serializable {

    // Data Fields 
    private ArrayList<Student> courseStudentsNames;
    ArrayList<Double> courseStudentsGrades;
    private int nbRegStudents = 0;

    // Constructors
    public CourseSection(String name, String code, int maxNbStudents, Instructor i) {
        super(name, code, maxNbStudents,i);
        this.courseStudentsNames = new ArrayList();
        this.courseStudentsGrades = new ArrayList();
    }

    public CourseSection() {
        this("Unknown", "Unknown", -1,Course.TBA);
    }

    // Getters and Setters
    public ArrayList<Student> getCourseStudentsNames() {
        return courseStudentsNames;
    }

    public void setCourseStudentsNames(ArrayList<Student> courseStudentsNames) {
        this.courseStudentsNames = courseStudentsNames;
    }

    public ArrayList<Double> getCourseStudentsGrades() {
        return courseStudentsGrades;
    }

    public void setCourseStudentsGrades(ArrayList<Double> courseStudentsGrades) {
        this.courseStudentsGrades = courseStudentsGrades;
    }

    // Methods
    public boolean add_student(Student s) {
        if (nbRegStudents < this.getMaxNbStudents()) {
            

            if (courseStudentsNames.contains(s)) {
                System.out.println("The student is already added.");
                return false;
            } else {
                courseStudentsNames.add(s);                // student added at index i
                courseStudentsGrades.add(0.0);             // grade added at same index i
                this.nbRegStudents++;

                System.out.println("Student added to course successfully!");
                return true;
            }
        } else {
            System.out.println("Student was not added because the section is full!");
            return false;
        }
        
    }

    public boolean remove_student(Student s) {
        int index = courseStudentsNames.indexOf(s);
        if (index != -1) {
            courseStudentsNames.remove(index);         // remove student at index i
            courseStudentsGrades.remove(index);        // remove grade at same index i
            this.nbRegStudents--;

            System.out.println("Student removed from successfully!");
            return true;
        } else {
            System.out.println("The student is not in this course section!");
        }
        return false;
    }

    public boolean move_student(Student s, CourseSection cs) {
        int index = courseStudentsNames.indexOf(s);
        if (index != -1) {
            double grade = courseStudentsGrades.get(index);  // get grade before removal
            this.remove_student(s);                          // remove from this section

            if (cs.courseStudentsNames.contains(s)) {
                System.out.println("The student is already added to the destination section.");
            } else {
                cs.courseStudentsNames.add(s);               // add student to new section
                cs.courseStudentsGrades.add(grade);          // add grade at same index
                System.out.println("Student moved successfully with existing grade!");
                return true;
            }
        } else {
            System.out.println("Error, the student is not in this course section.");
        }
        return false;
    }

    public abstract double get_average_grade();

    public void printStudents() {
        for (int i = 0; i < courseStudentsNames.size(); i++) {
            System.out.println(courseStudentsNames.get(i) + "\t" + courseStudentsGrades.get(i));
        }
    }

    public void sortStudentsByID(boolean ascending) {
        if (ascending) {
            Collections.sort(courseStudentsNames); // Ascending order by ID
        } else {
            courseStudentsNames.sort(Collections.reverseOrder()); // Descending order by ID
        }
    }

    @Override
    public String toString() {
        return super.toString() + " CourseSection{" + ", courseStudentsNames=" + courseStudentsNames + ", courseStudentsGrades=" + courseStudentsGrades + '}';
    }

}