import java.util.ArrayList;
import java.util.*;

public class Facade
{
    private int UserType;
    private Product theSelectProduct;
    private int nProductCategory;
    private ClassProductList theProductList;
    private Person thePerson;

    //ArrayList<UserInfoItem> buyers = new ArrayList<>();
    //ArrayList<UserInfoItem> sellers = new ArrayList<>();
    Map<String, String> buyers = new HashMap<String, String>();
    Map<String, String> sellers = new HashMap<String,String>();


    public int login(String username, String password)
    {
        buyers.put("tutu","1111");
        buyers.put("mimi","2222");
        buyers.put("nana","3333");
        sellers.put("pepe","3333");

        if(buyers.containsKey(username))
        {
            String value = buyers.get(username);

            if(value.equals(password))
                return 0;
            else
                return -1;
        }
        else if(sellers.containsKey(username))
        {
            String value = sellers.get(username);

            if(value.equals(password))
                return 1;
            else
                return -1;
        }
        else
        {
            return -1;
        }
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
            buyers.put(userinfoitem.getUsername(), userinfoitem.getPassword());
        }
        else
        {
            sellers.put(userinfoitem.getUsername(), userinfoitem.getPassword());
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

    /*public ArrayList<UserInfoItem> getBuyers()
    {
        return buyers;
    }

    public ArrayList<UserInfoItem> getSellers()
    {
        return sellers;
    }*/

}
