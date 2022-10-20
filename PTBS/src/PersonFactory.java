public class PersonFactory
{
    public Person getMenu(String userType) {

        if (userType == null) {
            return null;
        }
        if (userType.equalsIgnoreCase("BUYER")) {
            return new Buyer("tutu","1111");

        } else if (userType.equalsIgnoreCase("SELLER")) {
            return new Seller("pepe","3333");
        }
        return null;
    }
}
