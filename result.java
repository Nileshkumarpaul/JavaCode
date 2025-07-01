// WAP to check whether the person is pass or fail with grade  using nested if else *****

import java.util.*;
public class result {
    public static void main(String[]args){
        float Math,English,Biology;
        double total,percentage;
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the marks of Math:");
        Math=Sc.nextInt();
        System.out.println("Enter the marks of English:");
        English=Sc.nextInt();
        System.out.println("Enter the marks of Biology:");
        Biology=Sc.nextInt();
        Sc.close();
        total=Math+English+Biology;
        percentage=total/3;
        System.out.println("Your total percentage is:"+percentage);
        if (percentage >= 80)
        {
            System.out.println("You pass with grade * A * ");
        }
        else if (percentage >= 60)
        {
            System.out.println("You pass with grade * B * ");
        }
        else if (percentage >= 40)
        {
            System.out.println("You pass with grade * C * ");
        }
        else if (percentage < 40)
        {
            System.out.println("You are Fail !! ");
        }
    }
}
