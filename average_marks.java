// WAP to calculate Total & Avg marks of a student *****

import java.util.*;
public class average_marks {
    public static void main(String[]args){
        float M,E,P,C,B;
        float total,average;
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the marks of Math:");
        M= Sc.nextFloat();
        System.out.println("Enter the marks of English:");
        E= Sc.nextFloat();
        System.out.println("Enter the marks of Physics:");
        P= Sc.nextFloat();
        System.out.println("Enter the marks of Chemistry:");
        C= Sc.nextFloat();
        System.out.println("Enter the marks of Biology:");
        B= Sc.nextFloat();
        Sc.close();
        total=M+E+P+C+B;
        average=total/5;
        System.out.println("The total marks of the person is :"+total);
        System.out.println("The Average marks of the person is :"+average);
    }
}
