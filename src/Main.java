import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class Main {


   static List<Order> main(String[] args) throws IOException {

        List<Order> orders = new ArrayList<>();

        FileReader fileReader = null;


        try {
            fileReader = new FileReader("orders.csv");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line = null;

        while ((line = bufferedReader.readLine()) != null) {
            String[] split = line.split(";");
            orders.add(new Order(Integer.valueOf(split[0]), split[1], Double.valueOf(split[2]), OrderStatus.valueOf(split[3])));

            bufferedReader.close();

            return orders;

        }
        return orders;
    }

}