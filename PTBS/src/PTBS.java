import java.util.*;
public class PTBS
{
    public static void main(String[] args) {

        System.out.println("Product Trading and Bidding System");
        Scanner myObj = new Scanner(System.in);
        Facade f = new Facade();

        label:
        while (true)
        {
            System.out.println("Press 1 to Create New User");
            System.out.println("Press 2 to get Buyers List");
            System.out.println("Press 3 to get Sellers List");
            System.out.println("Press 4 to add Product");
            System.out.println("Press 5 to get Meat Menu");
            System.out.println("Press 6 to get Produce Menu");
            System.out.println("Press 7 to get Whole Product Menu");
            System.out.println("Press 0 to Exit from the System");

            String input = myObj.nextLine();

            switch (input) {
                case "1":
                    System.out.println("Press 0 for Buyer and 1 for seller");
                    int Usertype = Integer.parseInt(myObj.nextLine());
                    System.out.println("Enter the Username you want to set: ");
                    String Username = myObj.nextLine();
                    System.out.println("Enter the password you want to set: ");
                    String Password = myObj.nextLine();

                    UserInfoItem newUser = new UserInfoItem(Username, Password, Usertype);
                    f.createUser(newUser);
                    System.out.println("New User Created");
                    System.out.print( "\n\n");
                    break;
                case "2":
                    ArrayList<UserInfoItem> buyers = f.getBuyers();

                    if (buyers.isEmpty()) {
                        System.out.println("No Buyers are present right now");
                        System.out.print( "\n\n");
                    } else {
                        for (UserInfoItem buyer : buyers)
                            System.out.println(buyer.getUsername() + " " + buyer.getPassword());

                        System.out.print( "\n\n");
                    }

                    break;
                case "3":
                    ArrayList<UserInfoItem> sellers = f.getSellers();

                    if (sellers.isEmpty()) {
                        System.out.println("No Sellers are present right now");
                        System.out.print( "\n\n");
                    } else {
                        for (UserInfoItem seller : sellers)
                            System.out.println(seller.getUsername() + " " + seller.getPassword());

                        System.out.print( "\n\n");
                    }
                    break;
                case "4":
                    System.out.println("Enter the type of product you want to add: 0 for meat and 1 for produce");
                    String producttype = myObj.nextLine();
                    System.out.println("Enter the name of product: ");
                    String productname = myObj.nextLine();
                    Product newProduct = new Product(producttype, productname);
                    ProductMenu.addNewProduct(newProduct);
                    break;
                case "5":
                    ArrayList<Product> meat = ProductMenu.getMeatList();
                    if(meat.isEmpty()) {
                        System.out.println("No Meat Products present right now !!");
                        System.out.print( "\n\n");
                    }
                    else {
                    for (Product product : meat) System.out.println("Meat : " + product.getProductname());}
                    System.out.print( "\n\n");
                    break;
                case "6":
                    ArrayList<Product> produce = ProductMenu.getProduceList();
                    if(produce.isEmpty()) {
                        System.out.println("No Produce Products present right now !!");
                        System.out.print( "\n\n");
                    }
                    else {
                        for (Product product : produce) System.out.println("Produce: " + product.getProductname());
                        System.out.print( "\n\n");
                    }
                    break;
                case "7":
                    ArrayList<Product> products = ProductMenu.getProductMenu();
                    for (Product product : products)
                        if (product.getProducttype().equals("0"))
                            System.out.println("Meat : " + product.getProductname());
                        else if (product.getProducttype().equals("1"))
                            System.out.println("Produce : " + product.getProductname());
                    break;
                case "0":
                    System.out.println("Thanks for visiting the System");
                    break label;
            }
        }
    }
}
