// WAP to calculate Arithmetic operator *****

import java.util.Scanner;
public class numericals {
    public static void main(String []args){
        int a,b;
        float addition,subtraction,multiplication,division,remainder;
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the First number:");
        a=Sc.nextInt();
        System.out.println("Enter the second number:");
        b=Sc.nextInt();
        Sc.close();
        addition=a+b;
        subtraction=a-b;
        multiplication=a*b;
        division=a/b;
        remainder=a%b;
        System.out.println("Addition of the two values are :"+addition);
        System.out.println("Subtraction of the two values are :"+subtraction);
        System.out.println("Multiplication of the two values are :"+multiplication);
        System.out.println("Division of the two values are :"+division);
        System.out.println("Remainder from the two values are :"+remainder);


    }
}
