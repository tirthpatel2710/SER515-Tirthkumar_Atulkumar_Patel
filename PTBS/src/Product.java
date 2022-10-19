public class Product
{
    private String productName;
    private String productType;
    public Product(String productName, String productType)
    {
        this.productName = productName;
        this.productType = productType;
    }

    public String getProductName()
    {
        return productName;
    }

    public String getProductType()
    {
        return productType;
    }
}
