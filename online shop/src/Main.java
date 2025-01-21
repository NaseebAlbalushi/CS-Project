import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] categories = {"Electronics", "Clothing", "Books"};
        String[][] products = {
                {"Laptop - $999.99", "Smartphone - $499.99", "Headphones - $199.99"},
                {"Shirt - $19.99", "Pants - $29.99", "Jacket - $49.99"},
                {"Novel - $9.99", "Textbook - $39.99", "Magazine - $5.99"}
        };
        int[][] stock = {
                {5, 10, 0},
                {0, 5, 3},
                {10, 2, 8}
        };
        List<String> cart = new ArrayList<>();
        boolean isAdmin = false;

        while (true) {
            System.out.println("1. Browse Categories");
            System.out.println("2. View Cart");
            System.out.println("3. Checkout");
            System.out.println("4. Admin View");
            System.out.println("5. Exit");
            System.out.print("Select an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Available Categories:");
                    for (int i = 0; i < categories.length; i++) {
                        System.out.println(i + ". " + categories[i]);
                    }
                    System.out.print("Select a category: ");
                    int categoryIndex = scanner.nextInt();
                    if (categoryIndex >= 0 && categoryIndex < categories.length) {
                        System.out.println("Products in " + categories[categoryIndex] + ":");
                        for (int i = 0; i < products[categoryIndex].length; i++) {
                            String availability = stock[categoryIndex][i] > 0 ? "In Stock" : "Out of Stock";
                            System.out.println(i + ". " + products[categoryIndex][i] + " (" + availability + ")");
                        }
                        System.out.print("Select a product to add to cart: ");
                        int productIndex = scanner.nextInt();
                        if (productIndex >= 0 && productIndex < products[categoryIndex].length && stock[categoryIndex][productIndex] > 0) {
                            cart.add(products[categoryIndex][productIndex]);
                            stock[categoryIndex][productIndex]--;
                            System.out.println(products[categoryIndex][productIndex] + " added to cart.");
                        } else {
                            System.out.println("Invalid selection or out of stock.");
                        }
                    } else {
                        System.out.println("Invalid category.");
                    }
                    break;
            }
        }
    }
}