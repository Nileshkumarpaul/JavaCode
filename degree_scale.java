// WAP to calculate temperature scales *****

import java.util.*;
public class degree_scale {
    public static void main(String[]args){
        double f,c;
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the degree in celsius:");
        c=Sc.nextInt();
        f=(c*1.8)+32;
        System.out.println("The Temperature in Fahrenheit is:"+f+ "F");
    }
}
