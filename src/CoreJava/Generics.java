package CoreJava;

//<> brackets indicates that the class is of generic type
class Gen <T>
{
    T ob;     //an object of type T is declared<
    Gen(T o)  //constructor
    {
        ob = o;
    }
    public T getOb()
    {
        return ob;
    }
}

public class Generics
{
    public static void main (String[] args)
    {
        Gen < Integer> iob = new Gen<>(100);   //instance of Integer type Gen Class
       //Generics allow only objects as type arguments, we cannot pass primitive datatypes.
        // As Wrapper classes and String are class we can use it.
        int  x = iob.getOb();
        System.out.println(x);
        Gen < String> sob = new Gen<>("Hello");  //instance of String type Gen Class
        String str = sob.getOb();
        System.out.println(str);
    }
}


