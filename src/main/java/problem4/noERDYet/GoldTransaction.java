package problem4.noERDYet;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Objects;


@Data
public class GoldTransaction extends Transaction{
    private String goldType;

    public GoldTransaction(String code, LocalDate date, Double quantity, Double unitPrice, String goldType) {
        super(code, date, quantity, unitPrice);
        this.goldType = goldType;
    }

    public GoldTransaction(String goldType) {
        this.goldType = goldType;
    }

    @Override
    public String toString() {
        return "\nGoldTransaction{" + super.toString()+
                "goldType='" + goldType + "}" ;
    }
}
