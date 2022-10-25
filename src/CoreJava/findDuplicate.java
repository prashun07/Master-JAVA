package CoreJava;

import java.util.Scanner;

public class findDuplicate {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String Str;
        System.out.println("Enter a String:");
        Str=sc.nextLine();
        int n=Str.length();
        char str[]=Str.toCharArray();
//        System.out.println("Cha");
        for(int i=0;i<n;i++){
            int count=1;
            for(int j=i+1;j<n;j++){
                if(str[j]==str[i] && str[i]!=' ') {
                    count++;
                    str[j] = '0';
                }
            }
            if(count>1 && str[i]!='0')
                System.out.println("Duplicate Number is:"+str[i]+" appeared "+count+" times.");
        }
    }
}
