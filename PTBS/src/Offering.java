public class Offering
{
    private String offeringName;
    private String offeringType;

    public Offering(String offeringName, String offeringType)
    {
        this.offeringName = offeringName;
        this.offeringType = offeringType ;
    }

    public String getOfferingName() {
        return offeringName;
    }

    public String getOfferingType() {
        return offeringType;
    }
}
