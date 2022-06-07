package problem1;

import java.time.LocalDate;

public class Pottery extends Product{
    private String manufacturer;
    private String receiveDate;
    private final double vatRate = 0.1;

    public Pottery(String productId, String productName, double price, int unitInStock, String manufacturer, String receiveDate) {
        super(productId, productName, price, unitInStock);
        this.manufacturer = manufacturer;
        this.receiveDate = receiveDate;
    }

    public Pottery(Pottery potteryItem1) {
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

    public String getReceiveDate() {
        return receiveDate;
    }

    public void setReceiveDate(String receiveDate) {
        this.receiveDate = receiveDate;
    }

    public String evaluateWholesales () {
        String checkStatus;
        if (getUnitInStock() > 50 &&
                LocalDate.parse(receiveDate).isBefore(LocalDate.now().minusDays(10))) {
            checkStatus = "bán chậm";
        } else
            checkStatus = "không đánh giá";
        return checkStatus;
    }

    @Override
    public String toString() {
        return "Pottery{" + super.toString() +
                "manufacturer='" + manufacturer + '\'' +
                ", receiveDate=" + receiveDate +
                '}';
    }
}
