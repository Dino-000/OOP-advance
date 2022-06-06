package problem6;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data

public class Employee extends Person{
    private double salaryRate;
    private  int numberOfHours;

    public Employee(double salaryRate, int numberOfHours) {
        this.salaryRate = salaryRate;
        this.numberOfHours = numberOfHours;
    }

    public Employee(String name, String address, double salaryRate, int numberOfHours) {
        super(name, address);
        this.salaryRate = salaryRate;
        this.numberOfHours = numberOfHours;
    }

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
