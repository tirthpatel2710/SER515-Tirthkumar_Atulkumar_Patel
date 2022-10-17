public class Product
{
    private String producttype;
    private String productname;

    Product(String producttype,String productname)
    {
        this.producttype = producttype;
        this.productname = productname;
    }

    public String getProducttype() {
        return producttype;
    }

    public String getProductname() {
        return productname;
    }
}
