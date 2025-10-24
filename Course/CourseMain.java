package Course;


public class CourseMain {
    public static void main(String[] args) {
        Course c = new Course("Filipino", "Elger", 3);
        c.displayCourseDetails();
        
        OnlineCourse oc = new OnlineCourse("INST 3", "Mark", 4, "Coursera", 25);
        oc.displayCourseDetails();
        System.out.println("Eligible for Certificate: " + oc.isEligibleForCertificate());
    }
}
