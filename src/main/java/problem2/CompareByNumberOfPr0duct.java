package problem2;

import java.util.Comparator;

public class CompareByNumberOfPr0duct implements Comparator<Worker> {


    @Override
    public int compare(Worker o1, Worker o2) {
        return (int)(o2.returnSalary()-o1.returnSalary());
    }
}
