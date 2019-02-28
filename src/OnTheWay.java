import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OnTheWay {
    String orders = new String();

    File file = new File("orders.csv");
    Scanner scanner = new Scanner(file);
    String getOrders;


    public OnTheWay() throws FileNotFoundException {


        while (scanner.hasNextLine()){
            orders = scanner.nextLine();


        }
    }
}
