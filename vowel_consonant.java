// WAP to check whether the char value is vowel or consonant  using if else *****

import java.util.*;
public class vowel_consonant{
    public static void main(String[]args){
        char ch;
        Scanner Sc= new Scanner(System.in);
        System.out.println("Enter the character:");
        ch=Sc.next().charAt(0);
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
        {
            System.out.println("The character is a Vowel.");
        }
        else
        {
            System.out.println("The character is consonant.");
        }
    }
}
