package problem1;

public class Electronics extends Product {
    private int warrantyPeriod, power;
    private final double vatRate = 0.1;

    public Electronics(String productId, String productName, double price, int unitInStock, int warrantyPeriod, int power) {
        super(productId, productName, price, unitInStock);
        this.warrantyPeriod = warrantyPeriod;
        this.power = power;
    }

    public Electronics(Electronics electronicsItem1) {
    }

    public double getVatRate() {
        return vatRate;
    }

    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }

    public void setWarrantyPeriod(int warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String evaluateWholesales () {
        String checkStatus;
        if (getUnitInStock() < 3) {
            checkStatus = "bán được";
        } else
            checkStatus = "không đánh giá";
        return checkStatus;
    }




    @Override
    public String toString() {
        return "Electronics{" + super.toString() +
                "warrantyPeriod=" + warrantyPeriod +
                ", power=" + power +
                '}';
    }
}
