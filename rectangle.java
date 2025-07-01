// WAP to calculate area and perimeter of a rectangle *****

import java.util.*;
public class rectangle {
    public static void main(String[]args){
        float length,breadth;
        float area,perimeter;
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the length of the rectangle :");
        length=Sc.nextFloat();
        System.out.println("Enter the breadth of the rectanagle :");
        breadth=Sc.nextFloat();
        area=length*breadth;
        perimeter=2*(length+breadth);
        System.out.println("Area of the rectangle :"+area);
        System.out.println("Perimeter of the rectangle :"+perimeter);
    }
}
