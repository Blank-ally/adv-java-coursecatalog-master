package lab1;

/**
 * Describe responsibilities here.
 *
 * @author your name goes here
 * @version 1.00
 */
public class IntroJavaCourse extends Course{

    private String courseName;
   private double credits;
   private  String prerequisites;
    private String courseNumber;

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
        return null;
    }

    @Override
    public void setCourseName(String courseName) {

    }

    public double getCredits() {
        return credits;
    }

    public void setCredits(double credits) {
        if (credits < 0 || credits > 5.0) {
            System.out.println(
                    "Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
        }
        this.setCredits(credits);
    }

    public String getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(String prerequisites) {
        this.prerequisites = prerequisites;
    }

}
