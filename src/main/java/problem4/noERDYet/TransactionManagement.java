package problem4.noERDYet;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
public class TransactionManagement {
  private ArrayList<Transaction> transactions;

  public TransactionManagement() {
    transactions = new ArrayList<>();
  }

  public void addTransaction(Transaction transaction){
    transactions.add(transaction);
  }

  public void returnNumberOfEachTransactionInData() {
    int numberOfGoldTransaction = 0;
    for (Transaction transaction : transactions) {
      if (transaction instanceof GoldTransaction) {
        numberOfGoldTransaction++;
      }
    }
    System.out.println("Number of gold transaction is : " + numberOfGoldTransaction);
    System.out.println(
        "Number of cash transaction is : " + (transactions.size() - numberOfGoldTransaction));
  }

  public void returnAverageAmountOfEachCashTransaction() {
    Double sumAmount = 0.0;
    int numberOfCashTransaction = 0;
    for (Transaction transaction : transactions) {
      if (transaction instanceof GoldTransaction) {
        numberOfCashTransaction++;
        sumAmount += transaction.amountOfTransaction();
      }
    }
    if (numberOfCashTransaction == 0) {
      System.out.println("There is no cash transaction was execute.");
    } else {
      System.out.println(
          "Average Amount OF Each Cash Transaction is: " + (sumAmount / numberOfCashTransaction));
    }
  }

  public List<Transaction> returnListOfTransactionOver1Billion() {
    List<Transaction> foundTransaction = new ArrayList<>();

    for (Transaction transaction : transactions) {
      if (transaction.amountOfTransaction() > 1000000000) {
        foundTransaction.add(transaction);
      }
    }
    return foundTransaction;
  }
}
