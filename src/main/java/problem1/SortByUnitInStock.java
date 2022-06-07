package problem1;

import java.util.Comparator;

public class SortByUnitInStock implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return o2.getUnitInStock() - o1.getUnitInStock();
    }
}
