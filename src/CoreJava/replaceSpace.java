package CoreJava;

import java.sql.SQLOutput;
import java.util.Scanner;

public class replaceSpace {
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        String Str;
        System.out.println("Enter a String:");
        Str=sc.nextLine();
        int n=Str.length();
//        String s="";
////        char str[]=Str.toCharArray();
//        for(int i=0;i<n;i++){
//            if(Str.charAt(i)==' ')
//            {
//                s+='_';
//            }else{
//                s+=Str.charAt(i);
//            }
//        }
//        Str=Str.replace(' ','_');
//        System.out.println(Str);
//        getSubset(Str);
        reverseStr(Str);
    }

    private static void reverseStr(String str) {
        int n=str.length();
        String s="";
        for(int i=0;i<n;i++){
            s+=str.charAt((n-i-1));
        }
        System.out.println(s);
    }

    private static void getSubset(String str) {
        int n=str.length();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<=n;j++){
                System.out.println(str.substring(i,j));
            }
        }
    }
}
