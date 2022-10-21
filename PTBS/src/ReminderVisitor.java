import java.util.ArrayList;

public class ReminderVisitor extends NodeVisitor{

    private Reminder m_reminder;
    public  void visitProduct(Product product){}
    public  void visitTrading(Trading trading){}
    public  void visitFacade(Facade facade)
    {
        for(ArrayList<String> i: FileHandling.getProducts())
        {
            System.out.println(i.get(0)+" "+i.get(1));
        }
    }
}