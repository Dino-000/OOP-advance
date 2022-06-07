package problem1;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        ProductList newProductList = new ProductList();
        newProductList.addDemoData();

        // dummy data

        int userChoice = -1;
        do {
            System.out.println("1. Add product\n" +
                    "2. Show all of products in a list\n" +
                    "3. Show all in a product type\n" +
                    "4. Search product by ID\n" +
                    "5. Sort product by Name\n" +
                    "6. Sort product by Unit in Stock\n" +
                    "7. Show products with low consuming\n" +
                    "8. Remove product by ID\n" +
                    "9. Change product price by ID\n" +
                    "0. Exit");
            userChoice = Integer.parseInt(keyboard.nextLine());

            switch ( userChoice)
            {
                case 1:

                    break;
                case 2:
                    newProductList.showProductList();
                    break;
                case 3:
                    System.out.println("Enter the id of Product type you want to show:\n" +
                            "1)Food\n" +
                            "2)Electronic.\n" +
                            "3)Pottery.");
                    int productChoice = Integer.parseInt(keyboard.nextLine());
                    newProductList.showListOfProductById(productChoice);
                    break;
                case 4:
                    System.out.println("Enter product id to search");
                    newProductList.searchProductById(keyboard.nextLine());
                    break;
                case 5:
                    System.out.println("Sort Product by Name:");
                    newProductList.sortProductByName();
                    break;
                case 6:
                    System.out.println("Sort Product by Unit in Stock (decreasing):");
                    newProductList.sortProductByUnitInStock();
                    break;
                case 7:
                    System.out.println("Food products with low consuming:");
                    newProductList.returnFoodLowConsuming();
                    break;
                case 8:
                    System.out.println("Enter product ID you want to remove:");
                    newProductList.removeProductByID(keyboard.nextLine());
                    break;
                case 9:
                    System.out.println("Enter product ID you want to change price:");
                    String productID = keyboard.nextLine();
                    System.out.println("Enter new price:");
                    double newPrice = keyboard.nextDouble();
                    keyboard.nextLine();
                    newProductList.changePriceByID(productID, newPrice);
                    break;

            }

        } while (userChoice!=0);


        System.out.println("How many products you want to enter?");
        int numOfProducts = keyboard.nextInt();
        keyboard.nextLine();
        for (int i = 0; i < numOfProducts; i++) {
            System.out.println("Type of product (1) Food, (2) Electronics or (3) Pottery");
            int choice = keyboard.nextInt();
            keyboard.nextLine();
            if (choice == 1) {
                newProductList.addFoodItemFromUserInput();
            } else if (choice == 2){
                newProductList.addElectronicsItemFromUserInput();
            } else {
                newProductList.addPotteryItemFromUserInput();
            }
        }

        System.out.println();
        System.out.println("---------------");
        System.out.println();

        System.out.println("List of all products:");
        for (Product item : newProductList.returnProductList()) {
            System.out.println(item);
        }

        System.out.println();
        System.out.println("---------------");
        System.out.println();

        System.out.println("List of all Food products:");
        newProductList.showFoodList();



        System.out.println("List of all Electronics products:");
        newProductList.showElectronicsList();



        System.out.println("List of all Pottery products:");
        newProductList.showPotteryList();

        System.out.println();
        System.out.println("---------------");
        System.out.println();

        System.out.println("Enter product ID that you want to search:");
        newProductList.searchProductById(keyboard.nextLine());

        System.out.println();

        System.out.println("---------------");
        System.out.println();

        System.out.println("Product list sorted by Name:");
        newProductList.sortProductByName();

        System.out.println();
        System.out.println("---------------");
        System.out.println();

        System.out.println("Product list sorted by Unit in Stock:");
        newProductList.sortProductByUnitInStock();

        System.out.println();
        System.out.println("---------------");
        System.out.println();

        System.out.println("Product with low consuming:");
        newProductList.returnFoodLowConsuming();

        System.out.println();
        System.out.println("---------------");
        System.out.println();

        System.out.println("Enter product ID you want to remove:");
        newProductList.removeProductByID(keyboard.nextLine());


        System.out.println("List of all products:");
        for (Product item : newProductList.returnProductList()) {
            System.out.println(item);
        }
        System.out.println();
        System.out.println("---------------");
        System.out.println();


        System.out.println("Feature: Change a product price");
        System.out.println("Enter product ID:");
        String productID = keyboard.nextLine();
        System.out.println("Enter new price:");
        double newPrice = keyboard.nextDouble();
        keyboard.nextLine();
        newProductList.changePriceByID (productID,newPrice);
        System.out.println();
        System.out.println("List of all products:");
        for (Product item : newProductList.returnProductList()) {
            System.out.println(item);
        }
    }
}
