import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

class OnTheWay {


    File file = new File("orders.csv");
    Scanner scanner;

    {
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }






}
