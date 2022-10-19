public class OfferingList extends ArrayList
{
    public Offering names[] = {new Offering("Beef","Meat"), new Offering("Fish","Meat"),
            new Offering("Ginger","Produce"), new Offering("Tomato","Produce"), };

    public ListIterator getListIterator()
    {
        return new OfferingIterator();
    }

    public class OfferingIterator implements ListIterator{

        int pos;

        public  boolean hasNext(){

            if(pos < names.length){
                return true;
            }
            return false;
        }
        public  Offering Next(){

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
