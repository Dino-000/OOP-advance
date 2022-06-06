package problem4.noERDYet;

import java.time.LocalDate;

public class Demo {
    public static void main(String[] args) {
        TransactionManagement transactionManagement = new TransactionManagement();
        transactionManagement.addTransaction(new CashTransaction("001", LocalDate.parse("2000-11-11"), 100.0, 10.0, Currencies.EUR, 2));
        transactionManagement.addTransaction(new CashTransaction("002", LocalDate.parse("2000-11-11"), 100.0, 30.0, Currencies.USD, 3));
        transactionManagement.addTransaction(new CashTransaction("003", LocalDate.parse("2000-11-11"), 1000000.0, 1001.0, Currencies.VND, 2));
        transactionManagement.addTransaction(new GoldTransaction("004", LocalDate.parse("2000-11-11"), 2000000.0, 1001.0, "SCJ"));
        transactionManagement.addTransaction(new GoldTransaction("005", LocalDate.parse("2000-11-11"), 192870.0, 8201.0, "999"));
        transactionManagement.addTransaction(new GoldTransaction("006", LocalDate.parse("2000-11-11"), 2347630.0, 191.0, "PNJ"));

        transactionManagement.returnNumberOfEachTransactionInData();
        System.out.println("-------");

        transactionManagement.returnAverageAmountOfEachCashTransaction();
        System.out.println("-------");

        System.out.println(transactionManagement.returnListOfTransactionOver1Billion());
    }
}
