public class Seller extends Person
{

    private String Username;
    private String Password;
    public Seller(String username, String password)
    {
        super(null);
        this.Password = password;
        this.Username = username;
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
