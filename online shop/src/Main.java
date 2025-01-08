import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        class OnlineShop {
            ArrayList<String> productNames = new ArrayList<>();
            ArrayList<Double> productPrices = new ArrayList<>();
            ArrayList<Integer> productQuantity = new ArrayList<>();
            ArrayList<String> productCategories = new ArrayList<>();
            ArrayList<String> cartItems = new ArrayList<>();
            ArrayList<Double> cartPrices = new ArrayList<>();
            ArrayList<Integer> cartQuantity = new ArrayList<>();

            //Adding products
            OnlineShop() {
                productNames.add("T-shirt");
                productPrices.add(20.00);
                productQuantity.add(4);
                productCategories.add("Clothing");

                productNames.add("Jeans");
                productPrices.add(30.00);
                productQuantity.add(2);
                productCategories.add("Clothing");

                productNames.add("Shoes");
                productPrices.add(50.00);
                productQuantity.add(3);
                productCategories.add("Clothing");

                productNames.add("smartphone");
                productPrices.add(400.00);
                productQuantity.add(1);
                productCategories.add("Electronics");

                productNames.add("Laptop");
                productPrices.add(1000.00);
                productQuantity.add(2);
                productCategories.add("Electronics");

                productNames.add("Earbuds");
                productPrices.add(50.00);
                productQuantity.add(2);
                productCategories.add("Electronics");

                productNames.add("Microwave");
                productPrices.add(200.00);
                productQuantity.add(1);
                productCategories.add("Household");

                productNames.add("Dishwasher");
                productPrices.add(15.00);
                productQuantity.add(3);
                productCategories.add("Household");
            }

            Void browse(String category) {
                System.out.println("\nAvailable" + category + "Products:");
                for (int i = 0; i < productNames.size(); i++) {
                    if (productCategories.get(i).equalsIgnoreCase(category)) {
                        System.out.println(i + ": " + productNames.get(i) + " - $" + productPrices.get(i) + "(" + productQuantity.get(i) + " in Stock)");
                    }
                }


        }
    }