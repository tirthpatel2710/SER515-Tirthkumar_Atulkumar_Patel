public class PersonFactory
{
    public Person getMenu(String userType) {

        if (userType == null) {
            return null;
        }
        if (userType.equalsIgnoreCase("BUYER")) {
            return new Buyer();

        } else if (userType.equalsIgnoreCase("SELLER")) {
            return new Seller();
        }
        return null;
    }
}
