package problem6;

public class Customer extends Person{
    private  String companyName;
    private double billCost;
    private  String qualification;

    @Override
    public String toString() {
        return "Customer{\n" +super.toString()+
                "companyName= " + companyName + '\n' +
                "billCost= " + billCost +
                "\nqualification= " + qualification + '\n' +
                '}';
    }
}
