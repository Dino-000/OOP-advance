package problem6;

public class Customer extends Person{
    private  String companyName;
    private double billCost;

    public Customer(String companyName, double billCost) {
        this.companyName = companyName;
        this.billCost = billCost;

    }

    public Customer(String name, String address, String companyName, double billCost) {
        super(name, address);
        this.companyName = companyName;
        this.billCost = billCost;

    }

    @Override
    public String toString() {
        return "Customer{\n" +super.toString()+
                "companyName= " + companyName + '\n' +
                "billCost= " + billCost +
                "\n}";
    }
}
