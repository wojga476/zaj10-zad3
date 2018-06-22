import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Productdwa {

    File file = new File("test.csv");
    Scanner scan;

    {
        try {
            scan = new Scanner(file);
            if (scan.hasNextLine()){
                String nextLine = scan.nextLine();
                System.out.println(nextLine);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }


}

