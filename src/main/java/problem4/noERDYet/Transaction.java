package problem4.noERDYet;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@NoArgsConstructor
@Data
@AllArgsConstructor
public abstract class Transaction {
    private String code;
    private LocalDate date;
    private Double quantity;
    private Double unitPrice;

    public Double amountOfTransaction(){
        return quantity*unitPrice;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "code='" + code + '\'' +
                ", date=" + date +
                ", quantity=" + quantity +
                ", unitPrice=" + unitPrice +
                '}';
    }
}
