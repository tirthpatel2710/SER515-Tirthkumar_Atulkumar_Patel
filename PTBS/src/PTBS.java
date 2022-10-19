import java.util.*;
public class PTBS {
    public static void main(String[] args) {

        System.out.println("Product Trading and Bidding System");
        Scanner obj = new Scanner(System.in);
        // Facade Method //

        System.out.println("Enter the Username: ");
        String username = obj.nextLine();

        System.out.println("Enter the Password: ");
        String password = obj.nextLine();

        Facade facade = new Facade();
        int usertype = facade.login(username, password);

        if (usertype == 0) {
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

        // FACTORY METHOD //

        System.out.println("Factory Method Started: ");
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

        // FACTORY METHOD DONE //

        // BRIDGE METHOD //

        System.out.println("Bridge Pattern started: ");

        Person buyer = new Buyer();
        Person seller = new Seller();

        buyer.showMenu();
        seller.showMenu();

        // BRIDGE METHOD COMPLETED //

        System.out.println("Iterator Method Begins");

        ClassProductList classProductList = new ClassProductList();

        for (ListIterator i = classProductList.getListIterator(); i.hasNext(); ) {
            Product name = (Product) i.Next();
            System.out.println("Product Name : " + name.getProductName()+ "   Product Type :" + name.getProductType());
        }


        System.out.println("Iterator Method Ends");
    }
}
