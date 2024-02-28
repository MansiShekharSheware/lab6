package lab6;

import java.util.*;

class OrderItem {
    String item;
    int count;

    public OrderItem(String item) {
        this.item = item;
        this.count = 1;
    }
}

public class MenuOrderSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<OrderItem> orderList = new ArrayList<>();

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Add Item");
            System.out.println("2. Display Order");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter menu item: ");
                    String newItem = scanner.next();
                    boolean itemExists = false;

                    for (OrderItem orderItem : orderList) {
                        if (orderItem.item.equals(newItem)) {
                            orderItem.count++;
                            itemExists = true;
                            break;
                        }
                    }

                    if (!itemExists) {
                        orderList.add(new OrderItem(newItem));
                    }

                    break;

                case 2:
                    System.out.println("Ordered Items:");
                    for (OrderItem orderItem : orderList) {
                        System.out.println(orderItem.item + " - " + orderItem.count);
                    }
                    break;

                case 3:
                    System.out.println("Exiting...");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
