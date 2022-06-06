package problem2;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter a number of worker in your list:");
        int numberOfEmp = keyboard.nextInt();
        System.out.println();
        WorkerList workerList = new WorkerList(numberOfEmp);
        workerList.initialWorkerList(numberOfEmp);
        System.out.println("-----------------------------");
        workerList.showList();
        System.out.println("-----------------------------");
        System.out.println("Number of Worker existing in list:");
        System.out.println(workerList.countNumberOfWorkerInList());
        System.out.println("-----------------------------");
        System.out.println("List of worker produce more than 200 products");
        System.out.println(workerList.listOfWorkerFinishMoreThan200Products());
        System.out.println("-----------------------------");
        System.out.println("List of worker order by number of products desc");
        workerList.sortListOfWorker();
        workerList.showList();
    }
}
