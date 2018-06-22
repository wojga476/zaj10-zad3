import java.io.*;

public class ProductTest {

    public static void main(String[] args) throws IOException {

        Product[] tab = new Product[3];

        FileReader fileReader = new FileReader("test.csv" );
        BufferedReader bfw = new BufferedReader(fileReader);

        bfw.close();
    }
}
