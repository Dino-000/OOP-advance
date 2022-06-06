package problem3.noERDYet;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Course {

  private String name;
  private LocalDate startDate;
  private int duration;
  private ArrayList<Student> students = new ArrayList<>(20);

  public void addStudent() {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter number of student that you want to input their info");
    int numberOfStudent = Integer.parseInt(keyboard.next());
    System.out.println();
    for (int i = 0; i < numberOfStudent; i++) {
      if (students.size() <= 20) {
        System.out.println("---------------");
        System.out.println("Enter student's " + (i + 1) + " name:");
        String id = keyboard.nextLine();
        System.out.println("Enter student's " + (i + 1) + " address:");
        String address = keyboard.nextLine();
        System.out.println("Enter student's " + (i + 1) + " phoneNumber:");
        String phoneNumber = keyboard.nextLine();
        students.add(new Student(id, address, phoneNumber));
        System.out.println("student add successfully");
      } else {
        System.out.println("Only 20 student can join class");
      }
    }
  }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return name.equals(course.name) && startDate.equals(course.startDate) && duration==course.duration;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, startDate, duration);
    }
}
