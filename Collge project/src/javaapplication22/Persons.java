package javaapplication22;
//  Super-class for Students class/Lecturers class.
abstract class Persons {

    protected String name;
    protected int ID;
//    non-arg constructor.
    public Persons() {
    }
//    args constructor.
    public Persons(String name, int ID) {
        this.name = name;
        this.ID = ID;
    }
//    getter method.
    
    public String getName() {
        return name;
    }
//    getter method.
    public int getID() {
        return ID;
    }
//    setter method.
    public void setName(String name) {
        this.name = name;
    }
//    setter method.
    public void setID(int ID) {
        this.ID = ID;
    }
}