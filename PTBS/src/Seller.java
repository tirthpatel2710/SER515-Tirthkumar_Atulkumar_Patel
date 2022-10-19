public class Seller extends Person
{

    public Seller()
    {
        super(null);
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
