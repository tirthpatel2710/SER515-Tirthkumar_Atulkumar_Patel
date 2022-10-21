import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.security.KeyPair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.*;

public class FileHandling
{
        private Map<String, String> buyers = new HashMap<>();
        private Map<String, String> sellers = new HashMap<>();
        //private static Map<String, String> products = new HashMap<>();
        private static ArrayList<ArrayList<String>> products = new ArrayList<>();
        public static ArrayList<String> produceproducts = new ArrayList<>();
        public static ArrayList<String> meatproducts = new ArrayList<>();

        //private ArrayList<Buyer> buyers = new ArrayList<>();
        //private ArrayList<Seller> sellers = new ArrayList<>();
        public void fetchBuyers(String s)
        {
            try {
                File myObj = new File(s);
                Scanner myReader = new Scanner(myObj);
                while (myReader.hasNextLine()) {
                    String data = myReader.nextLine();
                    String[] arrBuyers = data.split(":");
                    //Buyer buyer1 = new Buyer(arrBuyers[0],arrBuyers[1]);
                    buyers.put(arrBuyers[0], arrBuyers[1]);
                }
                myReader.close();
            } catch (FileNotFoundException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        }

    public void fetchSellers(String s)
    {
        try {
            File myObj = new File(s);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String[] arrSellers = data.split(":");
                //Seller seller1 = new Seller(arrSellers[0],arrSellers[1]);
                sellers.put(arrSellers[0], arrSellers[1]);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public void fetchProducts(String s)
    {
        try {
            File myObj = new File(s);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String[] arrProducts = data.split(":");
                ArrayList<String> temp = new ArrayList<>();
                temp.add(arrProducts[0]);
                temp.add(arrProducts[1]);
                products.add(temp);

                if(arrProducts[0].equals("Meat"))
                    meatproducts.add(arrProducts[1]);

                if(arrProducts[0].equals("Produce"))
                    produceproducts.add(arrProducts[1]);
            }
//            System.out.println(produceproducts.size());
            myReader.close();

        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    public Map<String, String> getBuyers() {
        return buyers;
    }
    public Map<String, String> getSellers() {
        return sellers;
    }
    public static ArrayList<ArrayList<String>> getProducts() {
        return products;
    }
    public void printBuyers()
    {
        for (Map.Entry<String, String> me :
                buyers.entrySet()) {

            // Printing keys
            System.out.print(me.getKey() +" ");
            System.out.println(me.getValue());
        }
    }

    public void printSellers()
    {
        for (Map.Entry<String, String> me :
                sellers.entrySet()) {

            // Printing keys
            System.out.print(me.getKey() +" ");
            System.out.println(me.getValue());
        }
    }

    public void printProducts()
    {
        for( int i=0 ;i< products.size(); i++)
        {
                System.out.println(products.get(i).get(0)+" "+products.get(i).get(1));
        }
    }
}
