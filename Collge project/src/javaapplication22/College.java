package javaapplication22;

import java.util.*;

class College {

    private final int collegeID;
    private final String collegeName;
    private ArrayList<Courses> c = new ArrayList<>();
    private ArrayList<Students> s = new ArrayList<>();
    private ArrayList<Lecturers> l = new ArrayList<>();
    private int numOfStudents;
    private int numOfCourses;
    private int numOfLecturers;
//    arg contrustor
    public College(String collegeName, int collegeID) {
        this.collegeID = collegeID;
        this.collegeName = collegeName;
    }
//    getter method
    public int getCollegeID() {
        return collegeID;
    }
//    getter method
    public String getCollegeName() {
        return collegeName;
    }
//    getter method
    public ArrayList<Courses> getC() {
        return c;
    }
//    getter method
    public ArrayList<Students> getS() {
        return s;
    }
//    getter method
    public ArrayList<Lecturers> getL() {
        return l;
    }
//    getter method
    public int getNumOfStudents() {
        return numOfStudents;
    }
//    getter method
    public int getNumOfCourses() {
        return numOfCourses;
    }
//    getter method
    public int getNumOfLecturers() {
        return numOfLecturers;
    }
//    getter method
    public Courses getCourseFromArray(int i) {
        return c.get(i);
    }
//    getter method
    public Students getStudentFromArray(int i) {
        return s.get(i);
    }
//    getter method
    public Lecturers getLecturerFromArray(int i) {
        return l.get(i);
    }
//    getter method
    public int getLecturerLength() {
        return l.size();
    }
//    getter method
    public int getStudentLength() {
        return s.size();
    }
//    getter method
    public int getCourseLength() {
        return c.size();
    }
//    Adds Courses-type Object to the Courses ArrayList(c).
    public void addCourse(Courses ce) {
        c.add(new Courses(ce.getCourseName(), ce.getCourseID()));
        numOfCourses++;
    }
//    Adds String/int variables in a new Object in the Courses ArrayList(c) (Overload).
    public void addCourse(String name,int ID) {
        c.add(new Courses(name, ID));
        numOfCourses++;
    }
//    Adds Students-type Object to the Students ArrayList(s).
    public void addStudents(Students ss) {
        s.add(new Students(ss.getName(), ss.getID()));
        numOfStudents++;
    }
//    Adds String/int variables in a new Object in the Students ArrayList(s).
    public void addStudents(String name,int ID) {
        s.add(new Students(name, ID));
        numOfStudents++;
    }
//    Adds Lecturers-type Object to the Lecturers ArrayList(l).
    public void addLecturers(Lecturers ll) {
        l.add(new Lecturers(ll.getName(), ll.getID()));
        numOfLecturers++;
    }
//    Adds String/int variables in a new Object in the Lecturers ArrayList(l).
    public void addLecturers(String name,int ID) {
        l.add(new Lecturers(name, ID));
        numOfLecturers++;
    }
//    Takes Students-type object from the ArrayList(s) and puts it in a seperate Object (same with Courses ArrayList(c)), then adds 
//    the Course in the Courses ArrayList in the Students object (association relationship), then replaces the old Students object with the
//    new one in the Students ArrayList(s).
    public void setForstudent(int ee, int ii) {
        Students te = s.get(ii);
        Courses tmp = c.get(ee);
        te.addForStudent(tmp);
    }
//    Takes Lecturer-type object from the ArrayList(l) and puts it in a seperate Object (same with Courses ArrayList(c)), then adds 
//    the Course in the Courses ArrayList in the Lecturers object (association), then replaces the old Lecturer object with the
//    new one in the Lecturer ArrayList(s) then replaces the Courses object in the ArrayList with a new modified one with the new Lecturers object tied to it (association).
    public void setForlecturer(int ee, int ii) {
        Lecturers te = l.get(ii);
        Courses tmp = c.get(ee);
        tmp.setLecturer(te);
        te.addForLecturer(tmp);
    }
//    Overridden from toString method in Object class.
    @Override
    public String toString() {
        return "College name: " + collegeName + "\nCollege ID: " + collegeID + "\nNumber of courses: " + numOfCourses + "\nNumber of students: " + numOfStudents + "\nNumber of lecturers: " + numOfLecturers;
    }
}
