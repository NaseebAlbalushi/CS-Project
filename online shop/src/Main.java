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
        }
    }
}