package RickApplicationOOD;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {
    private List guitars;
    public Inventory()
    {
        guitars=new LinkedList();
    }
    public void addGuitar(String serialNo,double price,Type type,String model)
    {
        Guitar guitar=new Guitar(serialNo,price,model,type);
        guitars.add(guitar);
    }
    public Guitar getGuitar(String SerialNumber)
    {
        for(Iterator i =guitars.iterator();i.hasNext();)
        {
            Guitar guitar=(Guitar)i.next();
            if(guitar.getSerialNumber().equals(SerialNumber))
                return guitar;
        }
        return null;
    }
    public List search(Guitar searchGuitar)
    {  LinkedList matchingList=new LinkedList<>();
        for(Iterator i=guitars.iterator(); i.hasNext();)
    { Guitar guitar=(Guitar)i.next();
            String model= searchGuitar.getModel().toLowerCase();
            if((model!=null)&& (!model.equals(""))&&(!model.equals(guitar.getModel().toLowerCase())))
                continue;
            if(searchGuitar.getType()!=guitar.getType())
                continue;
            matchingList.add(guitar);
//                return guitar;
    }
return matchingList;
    }
}//End Inventory
