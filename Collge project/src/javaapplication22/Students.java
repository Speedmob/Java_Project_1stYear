package javaapplication22;

import java.util.*;

class Students extends Persons {

    private int NumOfCoursesTaken;
    private ArrayList<Courses> co;
//    non-arg constructor.
    public Students() {
        super();
        NumOfCoursesTaken = 0;
        co = new ArrayList<>();
    }
//    args constructor.
    public Students(String name, int ID) {
        super(name, ID);
        NumOfCoursesTaken = 0;
        co = new ArrayList<>();
    }
//    args constructor for ArrayList.
    public Students(String name, int ID, ArrayList<Courses> time, int num) {
        super(name, ID);
        NumOfCoursesTaken = num;
        co = (ArrayList) time.clone();
    }
//    adds a new Object in the Courses ArrayList in Students class (association).
    public void addForStudent(Courses cr) {
        co.add(cr);
        NumOfCoursesTaken++;
    }
//    getter method
    public int getNumOfCoursesTaken() {
        return NumOfCoursesTaken;
    }
//    getter method
    public ArrayList<Courses> getCo() {
        return co;
    }
//    setter method
    public void setNumOfCoursesTaken(int NumOfCoursesTaken) {
        this.NumOfCoursesTaken = NumOfCoursesTaken;
    }
//    setter method
    public void setCo(ArrayList<Courses> co) {
        this.co = co;
    }
//    print method
    public void DisplayForStudent() {
        System.out.println(co);
    }
//    overridden from toString method in Object class.
    @Override
    public String toString() {
        return "Student name: " + name + "\nStudent ID: " + ID + "\n\n";
    }
}
