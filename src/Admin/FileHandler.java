
package Admin;

import java.io.*;
import java.util.ArrayList;

public class FileHandler {

    // Save students to file
    public static void saveStudents(ArrayList<Student> students, String filename) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(students);
            System.out.println("Students saved to " + filename);
        } catch (IOException e) {
            System.err.println("Error saving students: " + e.getMessage());
        }
    }

    // Load students from file
    public static ArrayList<Student> loadStudents(String filename) {
        ArrayList<Student> students = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            students = (ArrayList<Student>) ois.readObject();
            System.out.println("Students loaded from " + filename);
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error loading students: " + e.getMessage());
        }
        return students;
    }

    // Save courses to file
    public static void saveCourses(ArrayList<Course> courses, String filename) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(courses);
            System.out.println("Courses saved to " + filename);
        } catch (IOException e) {
            System.err.println("Error saving courses: " + e.getMessage());
        }
    }
    
    

    // Load courses from file
    public static ArrayList<Course> loadCourses(String filename) {
        ArrayList<Course> courses = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            courses = (ArrayList<Course>) ois.readObject();
            System.out.println("Courses loaded from " + filename);
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error loading courses: " + e.getMessage());
        }
        return courses;
    }
    
    // load instructors from file
    public static ArrayList<Instructor> loadInstructors(String filename) {
        ArrayList<Instructor> instructor = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            instructor = (ArrayList<Instructor>) ois.readObject();
            System.out.println("Instructor loaded from " + filename);
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error loading courses: " + e.getMessage());
        }
        return instructor;
    }
    
    // Save instructors to file
    public static void saveInstructors(ArrayList<Instructor> instructors, String filename) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(instructors);
            System.out.println("Instructors saved to " + filename);
        } catch (IOException e) {
            System.err.println("Error saving instructors: " + e.getMessage());
        }
    }
}
