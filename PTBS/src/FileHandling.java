import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FileHandling
{
        private Map<String, String> buyers = new HashMap<>();
        private Map<String, String> sellers = new HashMap<>();
        public void fetchBuyers(String s)
        {
            try {
                File myObj = new File(s);
                Scanner myReader = new Scanner(myObj);
                while (myReader.hasNextLine()) {
                    String data = myReader.nextLine();
                    String[] arrBuyers = data.split(":");
                    buyers.put(arrBuyers[0],arrBuyers[1]);
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
                sellers.put(arrSellers[0],arrSellers[1]);
            }
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

    public void printBuyers()
    {
        for (Map.Entry<String, String> me :
                buyers.entrySet()) {

            // Printing keys
            System.out.print(me.getKey() +" ");
            System.out.println(me.getValue());
        }
    }
}
