public class ProductMenuFactory
{
    public ProductMenu getMenu(String productType){

        if(productType == null){
            return null;
        }
        if(productType.equalsIgnoreCase("MEAT")){
            return new MeatProductMenu();

        }
        else if(productType.equalsIgnoreCase("PRODUCE")){
            return new ProduceProductMenu();
        }
        return null;
    }
}
