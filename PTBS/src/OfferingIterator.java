import java.util.Iterator;

public class OfferingIterator
{
    Iterator itr;
    ClassProductList offeringList;

    OfferingIterator(ClassProductList productList)
    {
        this.offeringList = productList;
        this.itr = productList.listIterator();
    }

    public  boolean hasNext(){

        return itr.hasNext();
    }
    public  Product Next(){

        return (Product) itr.next();
    }
    public  void MoveToHead(){

        itr = offeringList.listIterator();
    }
    public  void Remove(){

        itr.remove();
    }
}
