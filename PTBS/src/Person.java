import java.util.ArrayList;
public abstract class Person
{
    ProductMenu theProductMenu;

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

    public ProductMenu getTheProductMenu() {
        return theProductMenu;
    }
    public void setTheProductMenu(ProductMenu theProductMenu) {
        this.theProductMenu = theProductMenu;
    }
}
