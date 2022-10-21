import java.util.Iterator;

public class ProductIterator {

    //int pos;
    Iterator itr;
    ClassProductList productList;

    ProductIterator(ClassProductList productList)
    {
        this.productList = productList;
        this.itr = productList.listIterator();
    }

    public  boolean hasNext(){

        return itr.hasNext();
    }
    public  Product Next(){

        return (Product) itr.next();
    }
    public  void MoveToHead(){

        itr = productList.listIterator();
    }
    public  void Remove(){

        itr.remove();
    }
}