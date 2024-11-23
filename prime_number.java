import java.util.Scanner;

public class prime_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       try{ System.out.println("Enter a number");
        int a = sc.nextInt();
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                System.out.println("Number is not prime");
                break;
            }else {
                System.out.println("Number is prime");
                break;
            }}
        } catch (Exception e) {
           System.out.println("Invalid Input");
       }
    }
}
