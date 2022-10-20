import java.io.File;
import java.util.*;
public class PTBS {
    public static void main(String[] args) {

        System.out.println("Product Trading and Bidding System");
        Scanner obj = new Scanner(System.in);

        FileHandling fileHandling = new FileHandling();
        ClassProductList classProductList = new ClassProductList();

        fileHandling.fetchBuyers("PTBS/Data/BuyerInfo.txt");
        fileHandling.fetchSellers("PTBS/Data/SellerInfo.txt");
        classProductList.fetchProducts("PTBS/Data/ProductInfo.txt");

        System.out.println("Buyers and Sellers data has been uploaded");
        fileHandling.printBuyers();

        // Facade Method //

        System.out.println("Enter the Username: ");
        String username = obj.nextLine();

        System.out.println("Enter the Password: ");
        String password = obj.nextLine();


        Facade facade = new Facade(fileHandling);
        int usertype = facade.login(username, password);

        if (usertype == 0)
        {
            System.out.println("I am Buyer");
        }
        else if(usertype ==1)
        {
            System.out.println("I am Seller");
        }
        else
        {
            System.out.println("Invalid User");
        }

        // BRIDGE METHOD //


        System.out.println("<-----------Bridge Pattern started---------->");

        Person buyer = new Buyer("tutu","1111");
        Person seller = new Seller("pepe", "3333");

        buyer.showMenu();
        seller.showMenu();

        System.out.println("<-----------Bridge Pattern Finishes--------->");

        // FACTORY METHOD //

        System.out.println("<-----------Factory Method Started--------------->");
        ProductMenuFactory productMenuFactory = new ProductMenuFactory();
        ProductMenu productMenu1 = productMenuFactory.getMenu("PRODUCE");
        productMenu1.showMenu();

        ProductMenu productMenu2 = productMenuFactory.getMenu("MEAT");
        productMenu2.showMenu();

        PersonFactory personFactory = new PersonFactory();
        Person person1 = personFactory.getMenu("BUYER");
        Person person2 = personFactory.getMenu("SELLER");
        person1.showMenu();
        person2.showMenu();

        System.out.println("<-----------Factory Method Finish--------------->");

        // ITERATOR METHOD //

        System.out.println("<-----------Iterator Method Begins---------->");

        for (ListIterator i = classProductList.getListIterator(); i.hasNext(); ) {
            Product name = (Product) i.Next();
            System.out.println("Product Name : " + name.getProductName()+ "   Product Type :" + name.getProductType());
        }

        System.out.println("<-------------Iterator Method Ends------------>");
    }
}
