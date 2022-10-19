import java.util.ArrayList;

public class Buyer extends Person{

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
