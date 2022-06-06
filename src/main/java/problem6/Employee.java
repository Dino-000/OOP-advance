package problem6;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee extends Person{
    private double salaryRate;
    private  int numberOfHours;

    public double returnSalary() {
        return salaryRate*numberOfHours;
    }

    public void danhGia() {

    }

    @Override
    public String toString() {
        return "Employee{\n" + super.toString()+
                "salaryRate= " + salaryRate +
                "\nnumberOfHours= " + numberOfHours +
                "\nsalary= "+returnSalary()+
                "\n}";
    }
}
