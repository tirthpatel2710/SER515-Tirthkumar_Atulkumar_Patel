import java.util.*;
public class PTBS
{
    public static void main(String[] args) {

        System.out.println("Product Trading and Bidding System");
        //Scanner myObj = new Scanner(System.in);

        /*
        while(true)
        {
                System.out.println("Enter your login credentials: ");
                System.out.println("Enter your Username: ");
                String Username = myObj.nextLine();
                System.out.println("Enter your Password: ");
                String Password = myObj.nextLine();
                Facade f = new Facade();
                int usertype = f.login(Username, Password);

                if (usertype == 0)
                {
                    System.out.println("Buyer");
                }
                else if (usertype == 1)
                {
                    System.out.println("Seller");
                }
                else
                {
                    System.out.println("Invalid User");
                    break;
                }
        }*/

        // FACTORY METHOD //

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
    }
}
