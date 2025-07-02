import java.util.*;
public class power {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println(" Enter how many power to display");
        int n =Sc.nextInt();
        System.out.println("Power of two:");
        for(int i=0;i<n;i++){
            System.out.println("2^"+i+"="+(int)Math.pow(2,i));
        }
    }
}