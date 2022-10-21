public class MeatProductMenu implements ProductMenu
{
    @Override
    public void showMenu() {

        for (int i = 0; i < FileHandling.meatproducts.size(); i++) {
            System.out.println(FileHandling.meatproducts.get(i));
        }
    }

    public void showAddButton(){

    }
    public void showViewButton(){

    }
    public void showRadioButton() {

    }
    public void showLabels() {

    }
    public void showComboxes() {

    }
}
