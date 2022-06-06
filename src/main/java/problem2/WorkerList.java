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
  ArrayList<Worker> workers;

  public void initialWorkerList(int number) {
    if (number <= 0) {
      System.out.println("Number of worker in the list can not be negative.");

    } else {
      workers = new ArrayList<>(number);
      Scanner keyboard = new Scanner(System.in);
      System.out.println("Enter number of employee you want to input their info");
      int numberOfEmp = keyboard.nextInt();
      System.out.println();
      for (int i = 0; i < numberOfEmp; i++) {

        System.out.println("---------------");
        System.out.println("Enter employee's " + (i + 1) + " id:");
        String id = keyboard.nextLine();
        System.out.println("Enter employee's " + (i + 1) + " last name:");
        String lastName = keyboard.nextLine();
        System.out.println("Enter employee's " + (i + 1) + " first name:");
        String firstName = keyboard.nextLine();
        System.out.println("Enter employee's " + (i + 1) + " number of product:");
        Integer numberOfProductDone = keyboard.nextInt();
        System.out.println();
        while (numberOfProductDone < 1) {
          System.out.println("Number of product should be greater than 0");
          System.out.println("Enter employee's " + (i + 1) + " number of product:");
          numberOfProductDone = keyboard.nextInt();
          System.out.println();
        }
        String status = addWorker(id, lastName, firstName, numberOfProductDone);

        System.out.println(status);
      }
    }
  }

  public String addWorker(
      String id, String lastName, String firstName, Integer numberOfProductDone) {
    String result = "new worker added successful";
//    if (workers.get(workers.size()-1)==null) {
      workers.add(new Worker(id, lastName, firstName, numberOfProductDone));
//    } else {
//      result = "Sorry, the list is fulfill and can not be added anymore.";
//    }
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

  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Please enter a number of worker in your list:");
    int numberOfEmp = keyboard.nextInt();
    System.out.println();
    WorkerList workerList = new WorkerList();
    workerList.initialWorkerList(numberOfEmp);
    System.out.println("-----------------------------");
    workerList.showList();
    System.out.println("-----------------------------");
    System.out.println("Number of Worker existing in list:");
    System.out.println(workerList.countNumberOfWorkerInList());
    System.out.println(workerList.getWorkers().size());
    System.out.println("-----------------------------");
    System.out.println("List of worker produce more than 200 products");
    System.out.println(workerList.listOfWorkerFinishMoreThan200Products().size());
    System.out.println("-----------------------------");
    System.out.println("List of worker order by number of products desc");
    workerList.sortListOfWorker();
    workerList.showList();
  }
}
