
package Admin;

public class NormalCourseSection extends CourseSection  {

    // Constructor
    public NormalCourseSection( String name, String code, int maxNbStudents, Instructor i) {
        super( name, code, maxNbStudents,i);
        this.type="Normal";
        
    }

    public NormalCourseSection() {
        this.type="unknow";
    }

    // Methods
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
            average = sum / getCourseStudentsGrades().size();
            return average;
        }

    }

}


