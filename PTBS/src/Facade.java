import java.util.ArrayList;

public class Facade
{
    private static Product theSelectProduct;
    private static int nProductCategory;
    private static ArrayList<Product> theProductList;
    private static Person thePerson;
    ArrayList<UserInfoItem> buyers = new ArrayList<>();
    ArrayList<UserInfoItem> sellers = new ArrayList<>();

    public boolean login()
    {

        return true;
    }
    public void addTrading()
    {

    }

    public void viewTrading()
    {

    }

    public void viewOffering()
    {

    }

    public void markOffering()
    {

    }

    public void submitOffering()
    {

    }

    public void remind()
    {

    }

    public void createUser(UserInfoItem userinfoitem)
    {
        int userType = userinfoitem.getUsertype();

        if(userType == 0)
        {
            buyers.add(userinfoitem);
        }
        else
        {
            sellers.add(userinfoitem);
        }
    }

    public void createProductList()
    {

    }

    public void attachProductToUser()
    {

    }

    public Product selectProduct()
    {

        return null;
    }

    public void ProductOperation()
    {

    }

    public ArrayList<UserInfoItem> getBuyers()
    {
        return buyers;
    }

    public ArrayList<UserInfoItem> getSellers()
    {
        return sellers;
    }

}
