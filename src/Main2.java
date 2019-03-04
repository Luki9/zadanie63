import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

class Main2 {

    static void readData(List<Order> orders) {
        Scanner scanner = new Scanner(System.in);
        int data = 0;
        System.out.println("Zamówienie:" + orders + "\n");

        do {
            System.out.println("Podaj jedną z możliwości:");
            System.out.println("1: Sortuj po nazwie,\n2: Sortuj po cenie,\n3: Sortuj po statusie\n4: Zmiana zamówienia\n5: Dodaj Zamówienie\n6: Anuluj\n7: Koniec");
            try {
                data = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.err.println("Błąd. Podaj liczbę [1.4]");
                scanner.nextLine();
            }
            switch (data) {
                case 1:
                    OrderCompleted.getOrderStatus(orders +);
                    System.out.println("Sortuj po nazwie");
                    System.out.println("Zamówienia:" + orders + "\n");
                    break;
                case 2:
                    OrderCompleted.getOrderStatus(orders +);
                    System.out.println("Sortuj po cenie:");
                    System.out.println("Zamówienie:" + "\n");
                    break;
                case 3:
                    OrderCompleted.getOrderStatus(orders +);
                    System.out.println("Sortuj po statusie");
                    System.out.println("Zamówienie:" + orders + "\n");
                    break;
                case 4:
                    changeStatus(orders);
                    System.out.println("Zamówienie" + orders + "\n");
                    break;
                case 5:
                    readData(orders);
                    System.out.println("Zamówienie" + orders + "\n");
                    break;
                case 6:
                    cancelOrder(orders);
                    System.out.println("Zamówienie:" + orders + "\n");
                    break;
                case 7:
                    break;

            }

        } while (data != 7);

    }

    private static void addOrder(List<Order> orders) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Nazwa produktu");

            System.out.println("Wartość zaówineia");
            double price = scanner.nextDouble();
            scanner.nextLine();
            OrderCompleted.getOrderStatus(orders, new Order(name, price, OrderStatus.COMPLETED));
            System.out.println("Zamówienie gotowe");
        } catch (InputMismatchException e) {
            System.err.println("Błędne dane");

        }
    }

    private static void cancelOrder(List<Order> orders) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Id zamówineia do anulowania");
        try {
            int id = scanner.nextInt();
            scanner.nextLine();
            OrderCompleted. (id, orders);
        } catch (InputMismatchException e) {
            System.out.println("Błędne dane");

        }
    }

    private static void changeStatus(List<Order> orders) {
        Scanner scanner = new Scanner(System.in);
        try {
            int id = scanner.nextInt();
            scanner.nextLine();
            OrderCompleted.changeOrderStatus(id, orders);
        } catch (InputMismatchException e) {
            System.out.println("Błędne dane");

        }


    }
}
