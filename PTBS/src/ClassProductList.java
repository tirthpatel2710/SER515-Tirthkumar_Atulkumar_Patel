import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ClassProductList extends ArrayList{

    public Product names[] = {new Product("Beef","Meat"), new Product("Fish","Meat"),
            new Product("Ginger","Produce"), new Product("Tomato","Produce"), };

    private Map<String,String> products = new HashMap<>();
    public void fetchProducts(String s)
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
    }


    public void accept(NodeVisitor visitor){

    }

    public ListIterator getListIterator()
    {
        return new ProductIterator();
    }

    public class ProductIterator implements ListIterator{

        int pos;

        public  boolean hasNext(){

            if(pos < names.length){
                return true;
            }
            return false;
        }
        public  Product Next(){

            if(this.hasNext()){
                return names[pos++];
            }
            return null;
        }
        public  void MoveToHead(){

        }
        public  void Remove(){

        }
    }
}
