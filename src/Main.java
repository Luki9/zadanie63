import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

class Main {

    public static void main(String[] args) {

        List<Order>order = new ArrayList<>();

        try {
            order =  new FileReader("orders.csv");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
