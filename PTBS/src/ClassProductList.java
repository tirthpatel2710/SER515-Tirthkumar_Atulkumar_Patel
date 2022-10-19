public class ClassProductList extends ArrayList{

    public Product names[] = {new Product("Beef","Meat"), new Product("Fish","Meat"),
            new Product("Ginger","Produce"), new Product("Tomato","Produce"), };
    public void accept(NodeVisitor visitor){

    }

    public ListIterator getListIterator()
    {
        return new ProductIterator();
    }

    public class ProductIterator implements ListIterator{

        int pos;

        public  boolean hasNext(){

            if(pos < names.length){
                return true;
            }
            return false;
        }
        public  Product Next(){

            if(this.hasNext()){
                return names[pos++];
            }
            return null;
        }
        public  void MoveToHead(){

        }
        public  void Remove(){

        }
    }
}
