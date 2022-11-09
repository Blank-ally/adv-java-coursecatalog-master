package lab1;

public class Main {
    public static void main(String[] args) {

        String courseNumber = "123456765434567";
        String courseName = "java";
        Course course = new AdvancedJavaCourse(courseName,courseNumber);
        System.out.println(course.getCourseName());
    }
}
