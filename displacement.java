// WAP to calculate displacement *****

import java.util.Scanner;
public class displacement {
    public static void main(String[]args){
        int u,t,a;
        double dis;
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the value of initial_Velocity:");
        u=Sc.nextInt();
        System.out.println("Enter the value of time:");
        t=Sc.nextInt();
        System.out.println("Enter the value of acceleration:");
        a=Sc.nextInt();
        dis=(u*t)+(0.5)*a*t*t;
        System.out.println("The displacement is:"+dis);


    }
}
