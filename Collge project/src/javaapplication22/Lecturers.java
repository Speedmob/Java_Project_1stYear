package javaapplication22;

import java.util.*;

class Lecturers extends Persons {

    private int NumOfCoursesTaught;
    private ArrayList<Courses> co = new ArrayList<>();
//    non-arg constructor.
    public Lecturers() {
        super();
        NumOfCoursesTaught = 0;
        co = new ArrayList<>();
    }
//    args constructor.
    public Lecturers(String name, int ID) {
        super(name, ID);
        NumOfCoursesTaught = 0;
        co = new ArrayList<>();
    }
//    args constructor for ArrayList.
    public Lecturers(String name, int ID, ArrayList<Courses> time, int num) {
        super(name, ID);
        NumOfCoursesTaught = num;
        co = (ArrayList) time.clone();
    }
//    overridden from toString method in Object class to print the object accurately.
    @Override
    public String toString() {
        return "Lecturer name: " + name + "\nLecturer ID: " + ID + "\n\n";
    }
//    getter method
    public int getNumOfCoursesTaught() {
        return NumOfCoursesTaught;
    }
//    getter method
    public ArrayList<Courses> getCo() {
        return co;
    }
//    setter method
    public void setNumOfCoursesTaught(int NumOfCoursesTaught) {
        this.NumOfCoursesTaught = NumOfCoursesTaught;
    }
//    setter method
    public void setCo(ArrayList<Courses> co) {
        this.co = co;
    }
//    takes Courses object as an input to add to the Courses ArrayList in Lecturers Object (association).
    public void addForLecturer(Courses cr) {
        co.add(cr);
        NumOfCoursesTaught++;
    }
}
