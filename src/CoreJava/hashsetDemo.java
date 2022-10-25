package CoreJava;

import java.util.HashSet;
import java.util.Scanner;

class GenDemo{
     String name;
    GenDemo(String ob)
    {
       this.name=ob;
    }
    public void show(){
        System.out.println(this.name);
    }
}
public class hashsetDemo {
    public static void main(String [] args){
//        HashSet<Integer>hashSet=new HashSet<>();
//        hashSet.add(1);
//        hashSet.add(2);
//        for(int i=1;i<10;i++){
//            hashSet.add(i);
//        }
        HashSet<GenDemo>hashSet=new HashSet<>();
        Scanner scanner=new Scanner(System.in);
        int size=scanner.nextInt();
        for(int i=1;i<=size;i++){
            String st=scanner.next();
            GenDemo genDemo=new GenDemo(st);
            hashSet.add(genDemo);
        }
        System.out.println("Size:"+hashSet.size());
//        System.out.println(hashSet);
        for(GenDemo gm:hashSet){
            System.out.println("name:"+gm.name);
            gm.show();
        }
    }
}
