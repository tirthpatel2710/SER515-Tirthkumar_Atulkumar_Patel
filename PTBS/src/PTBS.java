import java.util.*;

public class PTBS {
    public static void main(String[] args) {

        System.out.println("Product Trading and Bidding System");
        Scanner obj = new Scanner(System.in);

        ClassProductList classProductList = new ClassProductList();


        System.out.println("<---------Buyers and Sellers data has been uploaded------->");

        // Facade Method //

        System.out.println("<--------------Facade Pattern & Bridge Pattern has been implemented here-------->");
        int usertype = 0;
        Facade facade = new Facade();

        while(true)
        {
            System.out.println("Enter the Username: ");
            String username = obj.nextLine();

            System.out.println("Enter the Password: ");
            String password = obj.nextLine();

            usertype = facade.login(username, password);

            if (usertype == 0) {
                System.out.println("You are Buyer");
                Person buyer = new Buyer(username, password);

                System.out.println("Press 1 for Produce, 2 for Meat: ");
                String type = obj.nextLine();
                if(type.equals("1"))
                {
                    Person person = PersonFactory.getPerson("BUYER");
                    person.setTheProductMenu(new ProduceProductMenu());
                    person.showMenu();
                }
                else if(type.equals("2"))
                {
                    Person person = PersonFactory.getPerson("BUYER");
                    person.setTheProductMenu(new MeatProductMenu());
                    person.showMenu();
                }
                break;
            } else if (usertype == 1) {
                System.out.println("You are Seller");
                Person seller = new Seller(username, password);
                break;
            } else {
                System.out.println("Invalid User Credentials");
                System.out.println("Please Enter credentials again !!");
                continue;
            }
        }

        System.out.println("<--------------Facade Pattern & Bridge Pattern ends here-------->");

        System.out.println();
        System.out.println();
        System.out.println();

        System.out.println("<-----------Factory Method Started--------------->");

        /*
        ProductMenuFactory productMenuFactory = new ProductMenuFactory();
        productMenuFactory.setTheProductMenu(new ProduceProductMenu());
        ProductMenu productMenu1 = productMenuFactory.getMenu("PRODUCE");
        productMenu1.showMenu();

        ProductMenu productMenu2 = productMenuFactory.getMenu("MEAT");
        productMenu2.showMenu();

        PersonFactory personFactory = new PersonFactory();
        Person person1 = personFactory.getPerson("BUYER");
        Person person2 = personFactory.getPerson("SELLER");
        person1.showMenu();
        person2.showMenu();
        */

        System.out.println("<-----------Factory Method Finish--------------->");


        // ITERATOR METHOD //

        System.out.println("<----------Iterator Pattern Demonstration---------->");

        ClassProductList productList;
        ProductIterator productIterator = new ProductIterator(facade.fileHandling.productList);

        while(productIterator.hasNext())
        {
            Product p = productIterator.Next();
            System.out.println(p.getProductType()+" "+ p.getProductName());
        }

        System.out.println("<------------Iterator Pattern ends------------>");
        System.out.println("<------------Visitor Pattern begins------------>");

        ReminderVisitor reminderVisitor = new ReminderVisitor();
        reminderVisitor.visitFacade(new Facade());

        System.out.println("<------------Visitor Pattern ends------------>");

    }
}
