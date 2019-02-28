import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

class Main {

    public static void main(String[] args) {

        List<Order>orders = new ArrayList<>();

        try {
            orders = (List<Order>) new FileReader("orders.csv");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
