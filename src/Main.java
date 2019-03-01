
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

class Main {


    public static void main(String[] args) {

        List<Order> orders = new ArrayList<>();
        FileReader fileReader = null;
        try {
            fileReader = new FileReader("orders.csv");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.err.println(":");
        }


    }

}

