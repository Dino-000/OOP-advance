package problem1;

import java.util.*;

public class ProductList {
    private Set<Food> foodList = new LinkedHashSet<>();
    private Set<Electronics> electronicsList = new LinkedHashSet<>();
    private Set<Pottery> potteryList = new LinkedHashSet<>();

    public ProductList(Set<Food> foodList, Set<Electronics> electronicsList, Set<Pottery> potteryList) {
        this.foodList = foodList;
        this.electronicsList = electronicsList;
        this.potteryList = potteryList;
    }

    public ProductList() {
    }

    public Set<Food> getFoodList() {
        return foodList;
    }

    public void setFoodList(Set<Food> foodList) {
        this.foodList = foodList;
    }

    public Set<Electronics> getElectronicsList() {
        return electronicsList;
    }

    public void setElectronicsList(Set<Electronics> electronicsList) {
        this.electronicsList = electronicsList;
    }

    public Set<Pottery> getPotteryList() {
        return potteryList;
    }

    public void setPotteryList(Set<Pottery> potteryList) {
        this.potteryList = potteryList;
    }

    
    public void addFoodItemFromUserInput() {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter Food's id:");
        String id = keyboard.nextLine();

        System.out.println("Enter Food's name:");
        String name = keyboard.nextLine();

        System.out.println("Enter Food's price:");
        Double price = Double.parseDouble(keyboard.nextLine());


        System.out.println("Enter Food's unit:");
        int unit = Integer.parseInt(keyboard.nextLine());

        System.out.println("Enter Food's manufacturer:");
        String manu = keyboard.nextLine();

        System.out.println("Enter Food's produced date (YYYY-MM-DD):");
        String prodDate = keyboard.nextLine();

        System.out.println("Enter Food's expired date (YYYY-MM-DD):");
        String expDate = keyboard.nextLine();


        Food newFood = new Food(id, name, price, unit, manu, prodDate, expDate);
        foodList.add(newFood);
    }

    public void addElectronicsItemFromUserInput() {

            Scanner keyboard = new Scanner(System.in);

            System.out.println("Enter Electronics's id:");
            String productId = keyboard.nextLine();

            System.out.println("Enter Electronics's name:");
            String productName = keyboard.nextLine();

            System.out.println("Enter Electronics's price:");
            Double price = Double.parseDouble(keyboard.nextLine());


            System.out.println("Enter Electronics's unit:");
            int unitInStock = Integer.parseInt(keyboard.nextLine());

            System.out.println("Enter Electronics's warranty period:");
            int warrantyPeriod = Integer.parseInt(keyboard.nextLine());

            System.out.println("Enter Electronics's power");
            int power = Integer.parseInt(keyboard.nextLine());

        Electronics newElectronics = new Electronics(productId, productName, price, unitInStock, warrantyPeriod, power);
        electronicsList.add(newElectronics);
    }

    public void addPotteryItemFromUserInput() {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter Pottery's id:");
        String productId = keyboard.nextLine();

        System.out.println("Enter Pottery's name:");
        String productName = keyboard.nextLine();

        System.out.println("Enter Pottery's price:");
        Double price = Double.parseDouble(keyboard.nextLine());


        System.out.println("Enter Pottery's unit:");
        int unitInStock = Integer.parseInt(keyboard.nextLine());

        System.out.println("Enter Pottery's manufacturer:");
        String manufacturer = keyboard.nextLine();

        System.out.println("Enter Pottery's received date (YYYY-MM-DD):");
        String receiveDate = keyboard.nextLine();


        Pottery newPottery = new Pottery(productId, productName, price, unitInStock, manufacturer, receiveDate);
        potteryList.add(newPottery);

    }

    public ArrayList<Product> returnProductList() {
        ArrayList<Product> returnList = new ArrayList<>();
        for (Product item : foodList) {
            returnList.add(item);
        }
        for (Product item : electronicsList) {
            returnList.add(item);
        }
        for (Product item : potteryList) {
            returnList.add(item);
        }
        return returnList;
    }

    public void showFoodList() {
        for (Product item : foodList) {
            System.out.println(item);
        }
    }

    public void showElectronicsList() {
        for (Product item : electronicsList) {
            System.out.println(item);
        }
    }

    public void showPotteryList() {
        for (Product item : potteryList) {
            System.out.println(item);
        }
    }

    public void showProductList() {
        showFoodList();
        showElectronicsList();
        showPotteryList();
    }

    public void searchProductById(String id) {
        boolean found = false;
        for (Product item : returnProductList()) {
            if (item.getProductId().equals(id)) {
                System.out.println(item);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No product with such ID found.");
        }
    }

    public void sortProductByName() {
        ArrayList<Product> sortedList = returnProductList();
        Collections.sort(sortedList, new SortByName());
        for (Product item : sortedList) {
            System.out.println(item);
        }
    }

    public void sortProductByUnitInStock() {
        ArrayList<Product> sortedList = returnProductList();
        Collections.sort(sortedList, new SortByUnitInStock());
        for (Product item : sortedList) {
            System.out.println(item);
        }
    }

    public void returnFoodLowConsuming() {
        for (Food item :
                foodList) {
            if (item.evaluateWholesales().equals("khó bán")) {
                System.out.println(item);
            }
        }
    }

    public void changePriceByID(String id, double price) {
        boolean found = false;
        for (Product item :
                foodList) {
            if (item.getProductId().equals(id)) {
                found = true;
                item.setPrice(price);
                break;
            }
        }
        if (!found) {
            for (Product item :
                    electronicsList) {
                if (item.getProductId().equals(id)) {
                    found = true;
                    item.setPrice(price);
                    break;
                }
            }
        }
        if (!found) {
            for (Product item :
                    potteryList) {
                if (item.getProductId().equals(id)) {
                    found = true;
                    item.setPrice(price);
                    break;
                }
            }
        }
        if(!found){
            System.out.println("No product with id found.");
        }
    }

    public void removeProductByID(String id) {
        boolean found = false;
        for (Product item :
                foodList) {
            if (item.getProductId().equals(id)) {
                found = true;
                foodList.remove(item);
                break;
            }
        }
        if (!found) {
            for (Product item :
                    electronicsList) {
                if (item.getProductId().equals(id)) {
                    found = true;
                    electronicsList.remove(item);
                    break;
                }
            }
        }
        if (!found) {
            for (Product item :
                    potteryList) {
                if (item.getProductId().equals(id)) {
                    found = true;
                    potteryList.remove(item);
                    break;
                }
            }
        }
        if(!found){
            System.out.println("No product with id found.");
        }
    }

    public void addDemoData (){
        addFoodItem(new Food("F002","Milk",9.2,50,"Dutch Lady","2022-03-01","2022-09-01"));
        addFoodItem(new Food("F001","Bread",6.5,99,"Nhu Lan","2022-05-04","2022-05-07"));
        addElectronicsItem(new Electronics("E001","Television 42 inches",450,12,24,1500));
        addElectronicsItem(new Electronics("E002","CD Player",56.5,8,6,600));
        addPottery(new Pottery("P001","Vase",12.9,20,"Andy's Clay","2021-02-15"));
        addPottery(new Pottery("P002","Plate",8.5,50,"Saigon Craftsmanship","2021-01-15"));
    }

    public void addFoodItem(Food foodItem) {
        foodList.add(foodItem);
    }

    public void addElectronicsItem(Electronics electronicsItem) {
        electronicsList.add(electronicsItem);
    }

    public void addPottery(Pottery potteryItem) {
        potteryList.add(potteryItem);
    }




    public void showListOfProductById(int productChoice) {
        if(productChoice == 1)
        {
            showFoodList();
        } else if(productChoice==2){
            showElectronicsList();
        } else  {
            showPotteryList();
        }
    }
}
