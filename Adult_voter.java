// WAP to check whether the person is Adult or eligible for vote using if else *****

import java.util.*;
public class Adult_voter {
    public static void main(String[]args){
        int age;
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the age of the person:");
        age=Sc.nextInt();
        if(age>=18)
        {
            System.out.println("The person is An Adult & eligible for vote !");
        }
        else
        {
            System.out.println("You are not an Adult & not eligible for vote !");
        }
    }
}
