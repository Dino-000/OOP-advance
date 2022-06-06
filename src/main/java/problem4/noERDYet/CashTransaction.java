package problem4.noERDYet;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CashTransaction extends Transaction {
  private Currencies currency;
  private double exchangeRate;

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
}
