package javaapplication22;

class Courses implements MainMethods {

    private int courseID;
    private String courseName;
    private Lecturers lecturer = new Lecturers();
    private int numberOfRegisteredStudents;
//    non-arg constructor.
    public Courses() {
    }
//    arg constructor.
    public Courses(String courseName, int courseID) {
        this.courseName = courseName;
        this.courseID = courseID;
    }
//    arg constructor.
    public Courses(String courseName, int courseID, Lecturers lecturer) {
        this.courseName = courseName;
        this.courseID = courseID;
        this.lecturer = lecturer;
    }
//    getter method
    @Override
    public int getCourseID() {
        return courseID;
    }
//    getter method
    @Override
    public String getCourseName() {
        return courseName;
    }
//    getter method
    @Override
    public Lecturers getLecturer() {
        return lecturer;
    }
//    getter method
    @Override
    public int getNumberOfRegisteredStudents() {
        return numberOfRegisteredStudents;
    }
//    arg constructor.
    public Courses(int courseID, String courseName) {
        this.courseID = courseID;
        this.courseName = courseName;
        numberOfRegisteredStudents = 0;
    }
//    setter method
    @Override
    public void setNumberOfRegisteredStudents(int num) {
        numberOfRegisteredStudents = num;
    }
//    setter method
    @Override
    public void setcourseID(int courseID) {
        this.courseID = courseID;
    }
//    setter method
    @Override
    public void setcourseName(String courseName) {
        this.courseName = courseName;
    }
//    setter method
    @Override
    public void setLecturer(Lecturers lecturer) {
        this.lecturer = lecturer;
    }
//    overridden from toString method in Object class to print the object accurately.
    @Override
    public String toString() {
        return "Course name: " + courseName + "\nCourse ID: " + courseID + "\nCourse's lecturer: " + lecturer.getName()+ "\n\n";
    }
}
