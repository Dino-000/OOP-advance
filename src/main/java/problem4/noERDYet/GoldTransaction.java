package problem4.noERDYet;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Objects;


@NoArgsConstructor
@Data
@AllArgsConstructor
public class GoldTransaction extends Transaction{
    private String goldType;
}
