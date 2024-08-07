import java.util.Scanner;

public class ShoppingCartPrinter {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scnr = new Scanner(System.in);
        ItemToPurchase item1;
        ItemToPurchase item2;
        String name1;
        String name2;
        int price1;
        int price2;
        int quan1;
        int quan2;

        System.out.println("Item 1 \nEnter the item name:");
        name1 = scnr.nextLine();
        System.out.println("Enter the item price:");
        price1 = scnr.nextInt();
        System.out.println("Enter the item quantity:");
        quan1 = scnr.nextInt();
        
        item1 = new ItemToPurchase(name1, price1, quan1);
        scnr.nextLine();

        System.out.println("Item 2 \nEnter the item name:");
        name2 = scnr.nextLine();
        System.out.println("Enter the item price:");
        price2 = scnr.nextInt();
        System.out.println("Enter the item quantity:");
        quan2 = scnr.nextInt();
        item2 = new ItemToPurchase(name2, price2, quan2);

        System.out.println("TOTAL COST");
        System.out.println(item1.getName() + " " + item1.getQuantity() + " @ $" + item1.getPrice() + " = $" + item1.getQuantity() * item1.getPrice());
        System.out.println(item2.getName() + " " + item2.getQuantity() + " @ $" + item2.getPrice() + " = $" + item2.getQuantity() * item2.getPrice());
        System.out.println("\nTotal: $" + ((item1.getQuantity() * item1.getPrice()) + (item2.getQuantity() * item2.getPrice())));
    }
}