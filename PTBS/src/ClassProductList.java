import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class ClassProductList extends ArrayList<Product> {

    /*(public void fetchProducts(String s)
    {
        try {
            File myObj = new File(s);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String[] input = data.split(":");
                products.put(input[0],input[1]);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }*/


    public void accept(NodeVisitor visitor){

    }

    /*public ListIterator getListIterator()
    {
        return new ProductIterator();
    }*/


}
