// How do you remove space from string in java 

import java.util.Scanner;
public class RemoveSpaces{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        String result = input.replaceAll(" ", "");
        System.out.println("String without spaces: " + result);
        sc.close();
    }
}