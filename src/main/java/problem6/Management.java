package problem6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Management {
  private List<Person> people;
  private int count;

  public Management(int number) {
    this.people = new ArrayList<>(number);
    count = number;
  }

  public void savePerson(Person person) {
    boolean existInList = false;
    for (Person person1 : people) {
      if (person1.equals(person)) {
        existInList = true;
        break;
      }
    }
    if (existInList == false && people.size() < count) {
      people.add(person);
    }
  }

  public void addPerson() {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter Person's name:");
    String name = keyboard.nextLine();
    System.out.println("Enter Person's address");
    String address = keyboard.nextLine();
    System.out.println("You want to input:\na)Student\nb)Employee\nc)Customer");
    String userChoice = keyboard.nextLine();
    while (!userChoice.equals("a") && !userChoice.equals("b") && !userChoice.equals("c")) {
      System.out.println("You want to input:\na)Student\nb)Employee\nc)Customer");
      userChoice = keyboard.nextLine();
    }
    switch (userChoice) {
      case "a":
        System.out.println("Enter Student score1:");
        int score1 = Integer.parseInt(keyboard.nextLine());
        System.out.println("Enter Student score1:");
        int score2 = Integer.parseInt(keyboard.nextLine());
        savePerson(new Student(name, address, score1, score2));
        break;
      case "b":
        System.out.println("Enter Employee salary Rate:");
        Double salaryRate = Double.parseDouble(keyboard.nextLine());
        System.out.println("Enter Employee working hour:");
        int hour = Integer.parseInt(keyboard.nextLine());
        savePerson(new Employee(name, address, salaryRate, hour));
        break;
      case "c":
        System.out.println("Enter customer's company name:");
        String companyName = keyboard.nextLine();
        System.out.println("Enter customer's Total Bill:");
        double totalBill = Double.parseDouble(keyboard.nextLine());
        savePerson(new Customer(name, address, companyName, totalBill));
        break;
    }
  }

  public void deletePerson(String name) {
    boolean existInList = false;
    for (Person person : people) {
      if (person.getName().equals(name)) {
        System.out.println("We have delete a person with name: " + name);
        people.remove(person);
        existInList = true;
        break;
      }
    }
    if (!existInList) {
      System.out.println("Can not found the Person with name: " + name + " in list.");
    }

  }

  public void sortByPersonName(){
      Collections.sort(people, new ComparePersonByName());
  }

  public void showListOfPeople() {
      for (Person person:people){
      System.out.println( person);
      }
  }





}

