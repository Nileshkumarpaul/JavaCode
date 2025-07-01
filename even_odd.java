// WAP to check whether the no is even or odd using if else *****

import java.util.*;
public class even_odd {
    public static void main(String[]args){
        int num;
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        num=Sc.nextInt();
        if(num%2==0)
        {
            System.out.println("The number is Even number.");
        }
        else
        {
            System.out.println("The number is odd number.");
        }
    }
}
