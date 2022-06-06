package problem6;

import java.util.Scanner;

public class Demo {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Please enter number of Person in your List");
    Integer listLength = Integer.parseInt(keyboard.nextLine());
    Management management = new Management(listLength);
    System.out.println();
    int userChoice = 0;

    while (userChoice != 5) {
      System.out.println(
          "Please Choose one of these option below:\n"
              + "1)Add new person to your list.\n"
              + "2)Erase a person by name.\n"
              + "3)Sort list of people by their name\n"
              + "4)Export all of person in list.\n"
              + "5)Exit.");
      userChoice = Integer.parseInt(keyboard.nextLine());
      while (userChoice < 1 || userChoice > 5) {
        System.out.println(
            "Invalid input!\n"
                + "Please Choose one of these option below:\n"
                + "1)Add new person to your list.\n"
                + "2)Erase a person by name.\n"
                + "3)Sort list of people by their name\n"
                + "4)Export all of person in list.\n"
                + "5)Exit.");
        userChoice = Integer.parseInt(keyboard.nextLine());
      }
      switch (userChoice) {
        case 1:
          management.addPerson();
          break;
        case 2:
          System.out.println("Enter name of person you want to delete:");
          management.deletePerson(keyboard.nextLine());
          break;

        case 3:
          management.sortByPersonName();
          management.showListOfPeople();
          break;
        case 4:
          management.showListOfPeople();
          break;
        case 5:
          break;
      }
    }
  }
}
