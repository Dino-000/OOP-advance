package problem1;

import java.time.LocalDate;

public class Food extends Product{
    private String manufacturer;
    private String productionDate, expiredDate;
    private final double vatRate = 0.05;

    public Food(String productId, String productName, double price, int unitInStock, String manufacturer, String productionDate, String expiredDate) {
        super(productId, productName, price, unitInStock);
        this.manufacturer = manufacturer;
        this.productionDate = productionDate;
        this.expiredDate = expiredDate;
    }

    public Food() {
    }

    public Food(Food foodItem1) {
    }

    public double getVatRate() {
        return vatRate;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(String productionDate) {
        this.productionDate = productionDate;
    }

    public String getExpiredDate() {
        return expiredDate;
    }

    public void setExpiredDate(String expiredDate) {
        this.expiredDate = expiredDate;
    }

    public String evaluateWholesales () {
        String checkStatus;
        if (getUnitInStock() > 0 &&
                LocalDate.parse(expiredDate).isBefore(LocalDate.now())) {
            checkStatus = "khó bán";
        } else
            checkStatus = "không đánh giá";
        return checkStatus;
    }




    @Override
    public String toString() {
        return "Food{" + super.toString() +
                "manufacturer='" + manufacturer + '\'' +
                ", productionDate=" + productionDate +
                ", expiredDate=" + expiredDate +
                '}';
    }
}
