package RickApplicationOOD;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class FindGuitarTester {
    public static void main(String args[])
    {
        Inventory inventory=new Inventory();
        InitializeInventory(inventory);

        Guitar GuitarWant=new Guitar("A",0,"fender",Type.ELECTRIC);
//        inventory.addGuitar("A",0,"fender","electric");

        List guitar=  inventory.search(GuitarWant);
        if(!guitar.isEmpty())
        {  System.out.println("Found a guitar you want..");
            for(Iterator i= guitar.iterator(); i.hasNext();)
            { Guitar guitar1=(Guitar) i.next();
                System.out.println("We have this "+
                        guitar1.getSerialNumber()+" ,of type: "+
                        guitar1.getType()+" ,Model: "+
                        guitar1.getModel()+",Price:  "+
                        guitar1.getPrice());
            }
//            System.out.println("Found a guitar you want, "+guitar.getModel()+" ,"+guitar.getType()+","+guitar.getPrice());
        }
        else
            System.out.println("sorry cant find a guitar for you!!");
    }
    private static void InitializeInventory(Inventory inventory) {
        inventory.addGuitar("A",0, Type.valueOf("ELECTRIC"),"fender");
        inventory.addGuitar("abc",100,Type.ELECTRIC,"Fender");
    }
}
