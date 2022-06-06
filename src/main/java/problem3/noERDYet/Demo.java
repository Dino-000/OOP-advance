package problem3.noERDYet;

import java.util.Scanner;

public class Demo {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    CenterManagement newCenter = new CenterManagement();
    newCenter.addNewCourse();
    System.out.println("Enter any course's name that you are looking for");

    System.out.println(newCenter.findCourseByName(keyboard.nextLine()));
    System.out.println("Enter student name that you want to show his/her course list");
    System.out.println(newCenter.findCourseByStudentName(keyboard.nextLine()));

    System.out.println("List of course in progress:");
    System.out.println(newCenter.findCourseInProgress());
    System.out.println("List of course haven't start yet:");
    System.out.println(newCenter.findCourseNotStartYet());
  }
}
