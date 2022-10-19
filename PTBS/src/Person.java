import java.util.ArrayList;
public abstract class Person
{
    private ProductMenu theProductMenu;

    public Person(ProductMenu theProductMenu)
    {
        this.theProductMenu = theProductMenu;
    }

    public abstract void showMenu();
    public void showAddButton(){

    }
    public void showViewButton(){

    }
    public void showRadioButton()
    {

    }
    public void showLabels(){

    }
    public abstract ProductMenu CreateProductMenu();

}
