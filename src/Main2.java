import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

class Main2 {

    static void readData(List<Order>orders){
        Scanner scanner = new Scanner(System.in);
        int data = 0;
        System.out.println("Zamówienie:" + orders + "\n");

        do {
            System.out.println("Podaj jedną z możliwości:");
            System.out.println("1: Sortuj po nazwie,\n2: Sortuj po cenie,\n3: Sortuj po statusie\n4: Zmiana zamówienia\n5: Dodaj Zamówienie\n6: Anuluj\n7: Koniec");
            try {
                data = scanner.nextInt();
            }catch (InputMismatchException e){
                System.err.println("Błąd. Podaj liczbę [1.4]");
                scanner.nextLine();
            }
            switch (data){
                case 1:
              Main2.sortByStatus(orders);
            }

        }while (data !=7);

    }

    private static void sortByStatus(List<Order> orders) {
    }
}
