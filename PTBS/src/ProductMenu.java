import java.util.ArrayList;
public interface ProductMenu
{
    public static ArrayList<Product> products = new ArrayList<Product>();

    public static ArrayList<Product> getProductMenu()
    {
        return products;
    }

    public static ArrayList<Product> getProduceList()
    {
        ArrayList<Product> produce = new ArrayList<Product>();

        for(int i=0; i<products.size(); i++)
            if(products.get(i).getProducttype().equals("1"))
                produce.add(products.get(i));

        return produce;
    }

    public static ArrayList<Product> getMeatList()
    {
        ArrayList<Product> meat = new ArrayList<Product>();

        for(int i=0; i<products.size(); i++)
            if(products.get(i).getProducttype().equals("0"))
                meat.add(products.get(i));

        return meat;
    }


    public static void addNewProduct(Product e)
    {
        products.add(e);
    }

    public abstract void showAddButton();
    public abstract void showViewButton();
    public abstract void showRadioButton();
    public abstract void showLabels();
    public abstract void showComboxes();

}
