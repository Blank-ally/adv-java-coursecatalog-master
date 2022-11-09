package lab2;

/**
 * Describe responsibilities here.
 *
 * @author your name goes here
 * @version 1.00
 */
public class IntroJavaCourse implements Course, Prequisites{

    String courseName;
    private String courseNumber;
    private double credits;
    private String prerequisites;

    public IntroJavaCourse(String courseName, String courseNumber) {
      setCourseName(courseName);
      setCourseNumber(courseNumber);
    }

    public String getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }

    @Override
    public String getCourseName() {
        return courseName ;
    }

    @Override
    public void setCourseName(String courseName) {

    }

    public double getCredits() {
        return credits;
    }

    public void setCredits(double credits) {
        this.credits = credits;
    }

    public String getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(String prerequisites) {
        this.prerequisites = prerequisites;
    }

    @Override
    public void setPrequisite() {

    }

    @Override
    public String getPrequisite() {
        return null;
    }
}
