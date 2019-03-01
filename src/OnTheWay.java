import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OnTheWay {

    static List<Order> readFromFile(String patchname) throws FileNotFoundException {

        File file = new File(patchname);
        Scanner scanner = new Scanner(file);
        String order;
        List<Order> orders = new ArrayList<>();

        while (scanner.hasNextLine()) {
            order = scanner.nextLine();
            String[] dataFromFile = order.split(":");
            orders.add(new Order(Integer.valueOf(dataFromFile[0]), dataFromFile[1], Double.valueOf(dataFromFile[2]), OrderStatus.valueOf(dataFromFile[3])));

        }
         return orders;

    }
}