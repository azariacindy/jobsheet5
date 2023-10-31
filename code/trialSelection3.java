import java.util.Scanner;

public class PurchasePrice07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the customer's name: ");
        String name = scanner.nextLine();

        System.out.println("Enter the customer's clothes size (M or L): ");
        String size = scanner.nextLine();

        System.out.println("Enter the number of clothes: ");
        int numClothes = scanner.nextInt();

        System.out.println("Customer's details:");
        System.out.println("Name: " + name);
        System.out.println("Clothes size: " + size);
        System.out.println("Number of clothes: " + numClothes);
    }
}