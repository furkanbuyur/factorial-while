import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int n,i = 1,total = 1;
        System.out.print("Enter a number ; ");
        n = sc.nextInt();
            while (i <= n) {
                total = total * i;
                i++;
            }
            System.out.println("Factorial of the entered number : " + total);
    }
}