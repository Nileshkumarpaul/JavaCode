import java.util.*;

public class pattern {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int i, n, m, j;
        System.out.println("Enter the size of row:");
        n = Sc.nextInt();
        System.out.println("Enter the size of col:");
        m = Sc.nextInt();
        
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= m; j++) {
                if (i == 1 || i == n || j == 1 || j == m)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}