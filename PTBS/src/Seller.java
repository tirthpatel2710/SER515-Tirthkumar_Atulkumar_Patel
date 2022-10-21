import java.util.ArrayList;

public class Seller extends Person
{
    private String Username;
    private String Password;
    ArrayList<Seller> sellers = new ArrayList<>();
    public Seller(String username, String password)
    {
        super(null);
        this.Password = password;
        this.Username = username;
        sellers.add(this);
    }

    @Override
    public void showMenu()
    {
        System.out.println("Seller Menu");
    }

    @Override
    public ProductMenu CreateProductMenu() {

        return null;
    }
}
