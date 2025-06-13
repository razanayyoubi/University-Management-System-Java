
package Admin;

import java.util.Scanner;

public class OnlineCourseSection extends CourseSection {

    // Data Fields
    private int nbWeeks;

    // Connstructor
    public OnlineCourseSection(int nbWeeks, String name, String code, int maxNbStudents, Instructor i) {
        super(name, code, maxNbStudents, i);
        Scanner in = new Scanner(System.in);
        while (nbWeeks > 10 || nbWeeks < 5) {
            System.out.println("Invalid number of weeks, re-enter the number of weeks such that its between 5 and 10");
            nbWeeks = in.nextInt();
        }
        this.nbWeeks = nbWeeks;
        this.type = "Online";

    }

    public OnlineCourseSection() {
        this.type="unknown";
        this.nbWeeks=-1;
    }

    @Override
    public double get_average_grade() {
        if (getCourseStudentsGrades().size() == 0) {
            return 0.0;
        } else {
            double sum = 0;
            double average;
            for (int i = 0; i < getCourseStudentsGrades().size(); i++) {
                sum += getCourseStudentsGrades().get(i);
            }
            average = (sum / getCourseStudentsGrades().size()) * (1 + nbWeeks / 20);
            return average;
        }

    }

}

