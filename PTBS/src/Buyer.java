import java.io.File;
import java.util.ArrayList;

public class Buyer extends Person{

    private String username;
    private String password;
    public Buyer(String username, String password)
    {
        super(null);
        this.password = password;
        this.username = username;
    }
    @Override
    public void showMenu()
    {
        theProductMenu.showMenu();
    }

    @Override
    public ProductMenu CreateProductMenu()
    {
        return null;
    }

    /*public ArrayList<Buyer> getBuyers() {
        return buyers;
    }*/
}
