// WAP to calculate simple_interest *****

import java.util.*;
public class simple_interest {
    public static void main(String[]args){
        double principal,time,interest;
        double Si;
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the amount of principal:");
        principal=Sc.nextDouble();
        System.out.println("Enter the time in year:");
        time= Sc.nextDouble();
        System.out.println("Enter the interest:");
        interest= Sc.nextDouble();
        Si=(principal*time*interest)/100;
        System.out.println("The Simple_Interest at the end of year:"+Si);
    }
}
