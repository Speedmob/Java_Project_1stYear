//The purpose of the code is to take an input from the user within the loop to determine the action
//the user wants to execute in the program then re-take the input to execute a new action until the
//user exits the program
package javaapplication22;

import java.util.*;

public class JavaApplication22 {
    public static void main(String[] args) {
//        Variables needed for the program
        College sse = new College("CCIT", 1); //Object containing all the variables (Aggregation, main Object)
        Scanner s = new Scanner(System.in);
        int o, e, ui;
        int ii = 1;
        int eo = 0, ai = 0, oo = 0, Counter = 0;
        String m;
//        Main menu for the user to read.
        System.out.println("\t\t\t\t\t \"Welcome to CCIT college \"\n\n");
        System.out.println("1. Add a course.");
        System.out.println("2. Add a student.");
        System.out.println("3. Add a lecturer.");
        System.out.println("4. Register a course for a student.");
        System.out.println("5. Register a course for a lecturer.");
        System.out.println("6. Display college information.");
        System.out.println("7. Display the complete list of courses.");
        System.out.println("8. Display the complete list of students.");
        System.out.println("9. Display the complete list of lecturers.");
        System.out.println("10.Display a list of courses currently taken by a particular student.");
        System.out.println("11.Display a list of courses currently taught by a particular lecturer.");
        System.out.println("12.exit\n\n");
        System.out.print("Index of the action needed: ");
        while (true) {
            o = s.nextInt();
            m = s.nextLine();
            switch (o) {
                case 1:
//                Takes Courses name and ID from the user then puts them in a new object 
//                in Courses ArrayList in College class (Aggregation) using a method in College class while rejecting same ID input.
                    System.out.print("\nName of the course: ");
                    m = s.nextLine();
                    System.out.print("ID of the course: ");
                    e = s.nextInt();
                    if (eo != 0) {
                        while (Counter != sse.getCourseLength()) {
                            for (Counter = 0; Counter < sse.getCourseLength() && e != sse.getCourseFromArray(Counter).getCourseID(); Counter++) {
                            }
                            if (Counter == sse.getCourseLength()) {
                                sse.addCourse(m, e);
                                System.out.println("--> Sucessfully added course");
                                System.out.print("\nNext command (Enter 30 to review the menu): ");
                                break;
                            } else {
                                System.out.println("## Same ID detected!!!, try with a different ID ##");
                                System.out.print("ID: ");
                                e = s.nextInt();
                            }
                        }
                    } else {
                        sse.addCourse(m, e);
                        System.out.println("--> Sucessfully added course");
                        System.out.print("\nNext command (Enter 30 to review the menu): ");
                        eo++;
                        break;
                    }
                    break;
                case 2:
//                Takes Students name and ID from the user then puts them in a new object 
//                in Students ArrayList in College class (Aggregation) using a method in College class while rejecting same ID input.
                    System.out.print("\nName of the Student: ");
                    m = s.nextLine();
                    System.out.print("ID of the Student: ");
                    e = s.nextInt();
                    if (ai != 0) {
                        while (Counter != sse.getStudentLength()) {
                            for (Counter = 0; Counter < sse.getStudentLength() && e != sse.getStudentFromArray(Counter).getID(); Counter++) {
                            }
                            if (Counter == sse.getStudentLength()) {
                                sse.addStudents(m, e);
                                System.out.println("--> Sucessfully added Student");
                                System.out.print("\nNext command (Enter 30 to review the menu): ");
                                break;
                            } else {
                                System.out.println("## Same ID detected!!!, try with a different ID ##");
                                System.out.print("ID: ");
                                e = s.nextInt();
                            }
                        }
                    } else {
                        sse.addStudents(m, e);
                        System.out.println("--> Sucessfully added Student");
                        System.out.print("\nNext command (Enter 30 to review the menu): ");
                        ai++;
                        break;
                    }
                    break;
                case 3:
//                Takes Lecturer name and ID from the user then puts them in a new object 
//                in Lecturers ArrayList in College class (Aggregation) using a method in College class while rejecting same ID input.
                    System.out.print("\nName of the Lecturer: ");
                    m = s.nextLine();
                    System.out.print("ID of the Lecturer : ");
                    e = s.nextInt();
                    if (oo != 0) {
                        while (Counter != sse.getLecturerLength()) {
                            for (Counter = 0; Counter < sse.getLecturerLength() && e != sse.getLecturerFromArray(Counter).getID(); Counter++) {
                            }
                            if (Counter == sse.getLecturerLength()) {
                                sse.addLecturers(m, e);
                                System.out.println("--> Sucessfully added lecturer");
                                System.out.print("\nNext command (Enter 30 to review the menu): ");
                                break;
                            } else {
                                System.out.println("## Same ID detected!!!, try with a different ID ##");
                                System.out.print("ID: ");
                                e = s.nextInt();
                            }
                        }
                    } else {
                        sse.addLecturers(m, e);
                        System.out.println("--> Sucessfully added lecturer");
                        System.out.print("\nNext command (Enter 30 to review the menu): ");
                        oo++;
                        break;
                    }
                    break;
                case 4:
//                    Takes the index of the student and course then copies the course in an ArrayList made
//                    in the Students Object (Association).
                    if (sse.getStudentLength() == 0) {
                        System.out.println("\n## Please add a student before proceeding. ##");
                        System.out.print("Next command (Enter 30 to review the menu): ");
                        break;
                    }
                    if (sse.getCourseLength() == 0) {
                        System.out.println("\n## Please add a course before proceeding. ##");
                        System.out.print("Next command (Enter 30 to review the menu): ");
                        break;
                    }
                    System.out.println("Pick a student");
                    for (Students read : sse.getS()) {
                        System.out.println(ii + ". " + read.getName());
                        ii++;
                    }
                    System.out.print("Student: ");
                    ui = s.nextInt();
                    System.out.println("");
                    ii = 1;
                    System.out.println("Pick the course you want to register");
                    for (Courses read : sse.getC()) {
                        System.out.println(ii + ". " + read.getCourseName());
                        ii++;
                    }
                    System.out.print("Course: ");
                    ii = 1;
                    sse.setForstudent((s.nextInt() - 1), (ui - 1));
                    System.out.println("\n--> Sucessfully added course for student");
                    System.out.print("\nNext command (Enter 30 to review the menu): ");
                    break;
                case 5:
//                    Takes the index of the Lecturer and course then copies the course in an ArrayList made
//                    in the Lecturer Object (Association).
                    if (sse.getLecturerLength() == 0) {
                        System.out.println("## Please add a lecturer before proceeding. ##");
                        System.out.print("\nNext command (Enter 30 to review the menu): ");
                        break;
                    }
                    if (sse.getCourseLength() == 0) {
                        System.out.println("## Please add a course before proceeding. ##");
                        System.out.print("\nNext command (Enter 30 to review the menu): ");
                        break;
                    }
                    System.out.println("Pick a lecturer");
                    for (Lecturers read : sse.getL()) {
                        System.out.println(ii + ". " + read.getName());
                        ii++;
                    }
                    ui = s.nextInt();
                    ii = 1;
                    System.out.println("Pick the course you want to register");
                    for (Courses read : sse.getC()) {
                        System.out.println(ii + ". " + read.getCourseName());
                        ii++;
                    }
                    ii = 1;
                    sse.setForlecturer((s.nextInt() - 1), (ui - 1));
                    System.out.println("--> Sucessfully added course for lecturer");
                    System.out.print("\nNext command (Enter 30 to review the menu): ");
                    break;
                case 6:
//                    Prints info about the college using an overridden method in college class.
                    System.out.println(sse.toString());
                    System.out.print("\nNext command (Enter 30 to review the menu): ");
                    break;
                case 7:
//                    Reads the ArrayList in College class then prints it using a method in Courses class then prints it individually.
                    if (sse.getCourseLength() == 0) {
                        System.out.println("## There are no Courses registered ##");
                        System.out.print("\nNext command (Enter 30 to review the menu): ");
                        break;
                    }
                    for (int i = 0; i < sse.getCourseLength(); i++) {
                        Courses haha = sse.getCourseFromArray(i);
                        System.out.println(haha.toString());
                    }
                    System.out.println("Total num of Courses registered: " + sse.getCourseLength());
                    System.out.print("\nNext command (Enter 30 to review the menu): ");
                    break;
                case 8:
//                    Reads the ArrayList in College class then prints it using a method in Students class then prints it individually.
                    if (sse.getStudentLength() == 0) {
                        System.out.println("## There are no Students registered ##");
                        System.out.print("\nNext command (Enter 30 to review the menu): ");
                        break;
                    }
                    for (int i = 0; i < sse.getStudentLength(); i++) {
                        Students haha = sse.getStudentFromArray(i);
                        System.out.println(haha.toString());
                    }
                    System.out.println("Total num of Students registered: " + sse.getStudentLength());
                    System.out.print("\nNext command (Enter 30 to review the menu): ");
                    break;
                case 9:
//                    Reads the ArrayList in college class then prints it using a method in Lecturers class then prints it individually.
                    if (sse.getLecturerLength() == 0) {
                        System.out.println("## There are no Lecturers registered ##");
                        System.out.print("\nNext command (Enter 30 to review the menu): ");
                        break;
                    }
                    for (int i = 0; i < sse.getLecturerLength(); i++) {
                        Lecturers haha = sse.getLecturerFromArray(i);
                        System.out.println(haha.toString());
                    }
                    System.out.println("Total num of Lecturers registered: " + sse.getLecturerLength());
                    System.out.print("\nNext command (Enter 30 to review the menu): ");
                    break;
                case 10:
//                    Takes a Int-type object input from the user then checks its availablilty in the ArrayList using a
//                    for-loop, if its within the ArrayList it prints the Courses ArrayList associated with the Students object.
                    if (sse.getStudentLength() == 0) {
                        System.out.println("## There are no Students registered ##");
                        System.out.print("\nNext command (Enter 30 to review the menu): ");
                        break;
                    }
                    System.out.print("Student's ID: ");
                    e = s.nextInt();
                    for (int i = 0; i <= sse.getStudentLength() - 1; i++) {
                        Students teemp = sse.getStudentFromArray(i);
                        if (teemp.getID() == e) {
                            if (teemp.getCo().isEmpty()) {
                                System.out.println("Student has no Courses Registered");
                                System.out.print("\nNext command (Enter 30 to review the menu): ");
                                break;
                            }
                            teemp.getCo().forEach((print) -> {
                                System.out.println(print.toString());
                            });
                            System.out.println("Total Courses: " + teemp.getCo().size());
                            System.out.print("\nNext command (Enter 30 to review the menu): ");
                            break;
                        } else if (i == (sse.getStudentLength() - 1)) {
                            System.out.println("## ID not available, please check spelling ##");
                            System.out.print("\nNext command (Enter 30 to review the menu): ");
                        }
                    }
                    break;
                case 11:
//                    Takes a Int-type object input from the user then checks its availablilty in the ArrayList using a
//                    for-loop, if its within the ArrayList it prints the Courses ArrayList associated with the Lecturers object.
                    if (sse.getLecturerLength() == 0) {
                        System.out.println("## There are no Lecturers registered ##");
                        System.out.print("\nNext command (Enter 30 to review the menu): ");
                        break;
                    }
                    System.out.print("Lecturer's ID: ");
                    e = s.nextInt();
                    for (int i = 0; i <= sse.getLecturerLength() - 1; i++) {
                        Lecturers teemp = sse.getLecturerFromArray(i);
                        if (teemp.getID() == e) {
                            if (teemp.getCo().isEmpty()) {
                                System.out.println("Lecturer has no Courses Registered");
                                System.out.print("\nNext command (Enter 30 to review the menu): ");
                                break;
                            }
                            teemp.getCo().forEach((print) -> {
                                System.out.println(print.toString());
                            });
                            System.out.println("Total Courses: " + teemp.getCo().size());
                            System.out.print("\nNext command (Enter 30 to review the menu): ");
                            break;
                        } else if (i == sse.getLecturerLength() - 1) {
                            System.out.println("## ID not available, please check spelling ##");
                            System.out.print("\nNext command (Enter 30 to review the menu): ");
                        }
                    }
                    break;
                case 12:
//                    Exits out of the System with code 0.
                    System.exit(0);
                case 30:
//                    Re-displays the menu to the user.
                    System.out.println("1. Add a course.");
                    System.out.println("2. Add a student.");
                    System.out.println("3. Add a lecturer.");
                    System.out.println("4. Register a course for a student.");
                    System.out.println("5. Register a course for a lecturer.");
                    System.out.println("6. Display college information.");
                    System.out.println("7. Display the complete list of courses.");
                    System.out.println("8. Display the complete list of students.");
                    System.out.println("9. Display the complete list of lecturers.");
                    System.out.println("10.Display a list of courses currently taken by a particular student.");
                    System.out.println("11.Display a list of courses currently taught by a particular lecturer.");
                    System.out.println("12.exit\n\n");
                    System.out.print("Index of the action needed: ");
                    break;
                default:
                    System.out.print("Please only enter a number between 1-12 or 30 for menu: ");
                    break;
            }
        }
    }

}
