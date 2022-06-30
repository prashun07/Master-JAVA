//What is Lambda Expression?
/*way of writing particular function and piece of code.
* Syntax to use:(parameters)-> function or (parameters)->{statements;}
* Any lambda expression is an object as is an instance of a functional interface. it can be only used with functional interface.
* functional interface :Any Interface with single abstract method is called Functional Interface.@FunctionalInterface
* */
//**// Benefits of lambda expression
/* (1)Fewer lines of code can replace the large piece of code:
Ex ,
Runnable r1=new Runnable(){
@Override
public void run()
{ System.out.println("Hello,Lambda");
}
};
Above piece of code can be replaced by:
Runnable r1=()->{
System.out.println("Hello,lambda");
}
(2)Sequential and Parallel Execution Support by passing behavior in methods.
(3). Higher Efficiency (Utilizing Multicore CPU’s)
* */
//**// Where to use?
/*variable declaration and assignments,
Return statements,
Method and constructor arguments.
* */
interface Addable{
    int Add(int a,int b);
}
//interface drawable{
//    public void draw();
//}
public class LambdaExpression {
    public static void main(String args[])
    {
        //without lambda
//        drawable d=new drawable() {
//            @Override
//            public void draw() {
//                System.out.println("Drawing..!!!");
//            }
//        };
//        //with lambda
//        drawable d= ()->{
//            System.out.println("Drawing...!!!!");
//        };
//        d.draw();
        Addable add1=(int a,int b)-> {
            return (a+b);
        };
        System.out.println(add1.Add(1,2));
    }//End main

    }//End LambdaExpression

