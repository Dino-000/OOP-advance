package problem2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class WorkerList {
  private ArrayList<Worker> workers;
  private int count;

  public WorkerList( int count) {
    this.workers = new ArrayList<>();
    this.count = count;
    System.out.println(workers.size());
  }

  public void initialWorkerList(int number) {
    if (number <= 0) {
      System.out.println("Number of worker in the list can not be negative.");

    } else {
      workers = new ArrayList<>(number);
      Scanner keyboard = new Scanner(System.in);
      System.out.println("Enter number of employee you want to input their info");
      int numberOfEmp = Integer.parseInt(keyboard.nextLine());
      for (int i = 0; i < numberOfEmp; i++) {

        System.out.println("---------------");
        System.out.println("Enter employee's " + (i + 1) + " id:");
        String id = keyboard.nextLine();
        System.out.println("Enter employee's " + (i + 1) + " last name:");
        String lastName = keyboard.nextLine();
        System.out.println("Enter employee's " + (i + 1) + " first name:");
        String firstName = keyboard.nextLine();
        System.out.println("Enter employee's " + (i + 1) + " number of product:");
        int numberOfProductDone = Integer.parseInt(keyboard.nextLine());
        System.out.println();
        while (numberOfProductDone < 1) {
          System.out.println("Number of product should be greater than 0");
          System.out.println("Enter employee's " + (i + 1) + " number of product:");
          numberOfProductDone = Integer.parseInt(keyboard.nextLine());
          System.out.println();
        }
        String status = addWorker(id, lastName, firstName, numberOfProductDone);

        System.out.println(status);
      }
    }
  }

  public String addWorker(String id, String lastName, String firstName, Integer numberOfProductDone) {
    String result = "new worker added successful";
    if (workers.size()<count) {
      workers.add(new Worker(id, lastName, firstName, numberOfProductDone));
    } else {
      result = "Sorry, the list is fulfill and can not be added anymore.";
    }
    return result;
  }

  public int countNumberOfWorkerInList() {
    return workers.size();
  }

  public ArrayList<Worker> listOfWorkerFinishMoreThan200Products() {
    ArrayList<Worker> listOfWorker = new ArrayList<>();
    for (Worker worker : workers) {
      if (worker.getNumberOfProductDone() > 200) {
        listOfWorker.add(worker);
      }
    }
    return listOfWorker;
  }

  public void sortListOfWorker() {
    Collections.sort(workers, new CompareByNumberOfPr0duct());
  }
  public void showList(){
    for(Worker worker:workers){
      System.out.println(worker);
    }
  }

  @Override
  public String toString() {
    return "WorkerList{" + "workers=" + workers + '}';
  }


}
