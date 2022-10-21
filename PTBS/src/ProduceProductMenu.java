import java.io.File;
import java.lang.reflect.Array;
import java.util.*;
import java.util.ArrayList;

public class ProduceProductMenu implements ProductMenu
{
    public void showMenu(){

        //System.out.println(FileHandling.produceproducts.size());
        for(int i=0;i< FileHandling.produceproducts.size();i++)
        {
            System.out.println(FileHandling.produceproducts.get(i));
        }
    }
    public void showAddButton(){

    }
    public void showViewButton() {

    }
    public void showRadioButton(){

    }
    public void showLabels(){

    }
    public void showComboxes(){

    }
}
