import java.util.ArrayList;

public class Buyer extends Person{


    public Buyer(String username, String password)
    {
        super(null);

    }
    @Override
    public void showMenu()
    {
        System.out.println("Buyer Menu");
    }

    @Override
    public ProductMenu CreateProductMenu()
    {
        return null;
    }
}
