package lab1;

public abstract class Course {
    private String courseNumber;
   private  String courseName;
    private double credits;
    String prerequisites;

    public String getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(String prerequisites){
        this.prerequisites = prerequisites;
    };


    public abstract String getCourseNumber();


    protected abstract void setCourseNumber(String courseNumber) ;

    public abstract String getCourseName();


    public abstract void setCourseName(String courseName);

    public abstract double getCredits();


   public abstract void setCredits(double credits);

    @Override
    public String toString() {
        return "Course{" +
                "courseNumber='" + courseNumber + '\'' +
                ", courseName='" + courseName + '\'' +
                ", credits=" + credits +
                ", prerequisites='" + prerequisites + '\'' +
                '}';
    }
}
