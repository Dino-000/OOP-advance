package problem4.noERDYet;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data

public class CashTransaction extends Transaction {
  private Currencies currency;
  private double exchangeRate;

  public CashTransaction(String code, LocalDate date, Double quantity, Double unitPrice, Currencies currency, double exchangeRate) {
    super(code, date, quantity, unitPrice);
    this.currency = currency;
    this.exchangeRate = exchangeRate;
  }

  public CashTransaction(Currencies currency, double exchangeRate) {
    this.currency = currency;
    this.exchangeRate = exchangeRate;
  }


  @Override
  public Double amountOfTransaction() {
    Double result = 0.0;
    if (currency.equals(currency.VND)) {
      result = super.getQuantity() * super.getUnitPrice();
    } else {
      result = super.getQuantity() * super.getUnitPrice() * exchangeRate;
    }
    return result;
  }

  @Override
  public String toString() {
    return "\nCashTransaction{" +
             super.toString()+
            "currency=" + currency +
            ", exchangeRate=" + exchangeRate +
            '}';
  }
}
