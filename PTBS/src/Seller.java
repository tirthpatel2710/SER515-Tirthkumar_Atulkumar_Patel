public class Seller extends Person
{
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
