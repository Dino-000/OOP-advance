package problem3.noERDYet;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CenterManagement {
  Set<Course> courseList;

  public void addNewCourse() {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter number of course you want to input");
    int courseQuantity = Integer.parseInt(keyboard.nextLine());
    for (int i = 0; i < courseQuantity; i++) {
      System.out.println("Enter course " + (i + 1) + " name:");
      String name = keyboard.nextLine();
      System.out.println("Enter course " + (i + 1) + " startDate: (yyyy-mm-dd)");
      LocalDate date = LocalDate.parse(keyboard.nextLine());
      System.out.println("Enter course " + (i + 1) + " duration (days):");
      int duration = keyboard.nextInt();
      System.out.println();
      Course currentCourse = new Course(name, date, duration, null);
      currentCourse.addStudent();
      courseList.add(currentCourse);
    }
  }

  public List<Course> findCourseByName(String name) {
    List<Course> foundCourseList = new ArrayList<>();
    for (Course course : courseList) {
      if (course.getName().equals(name)) {
        foundCourseList.add(course);
      }
    }
    return foundCourseList;
  }

  public List<Course> findCourseByStudentName(String name) {
    List<Course> foundCourseList = new ArrayList<>();
    for (Course course : courseList) {
      for (Student student : course.getStudents()) {

        if (student.getName().equals(name)) {
          foundCourseList.add(course);
        }
      }
    }
    return foundCourseList;
  }

  public List<Course> findCourseInProgress() {
    List<Course> foundCourseList = new ArrayList<>();
    for (Course course : courseList) {
      if (isCourseInProgress(course)) {
        foundCourseList.add(course);
      }
    }
    return foundCourseList;
  }

  public List<Course> findCourseNotStartYet() {
    List<Course> foundCourseList = new ArrayList<>();
    for (Course course : courseList) {
      if (isCourseNotStartYet(course)) {
        foundCourseList.add(course);
      }
    }
    return foundCourseList;
  }

  public boolean isCourseInProgress(Course course) {
    return course.getStartDate().plusDays(course.getDuration()).isAfter(LocalDate.now());
  }

  public boolean isCourseNotStartYet(Course course) {
    return course.getStartDate().isAfter(LocalDate.now());
  }
}
