import java.util.ArrayList;
import java.util.*;

public class Facade
{
    private int UserType;
    private Product theSelectProduct;
    private int nProductCategory;
    private ClassProductList theProductList;
    private Person thePerson;
    private FileHandling fileHandling;

    public Facade(FileHandling fileHandling)
    {
        this.fileHandling = fileHandling;
    }
    public int login(String username, String password)
    {
        if(fileHandling.getBuyers().containsKey(username))
        {
            String value = fileHandling.getBuyers().get(username);

            if(value.equals(password))
                return 0;
            else
                return -1;
        }
        else if(fileHandling.getSellers().containsKey(username))
        {
            String value = fileHandling.getSellers().get(username);

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
            fileHandling.getBuyers().put(userinfoitem.getUsername(), userinfoitem.getPassword());
        }
        else
        {
            fileHandling.getSellers().put(userinfoitem.getUsername(), userinfoitem.getPassword());
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
