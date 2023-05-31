import entities.account;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        account user;

        System.out.print("Enter account number:");
        int number = sc.nextInt();
        System.out.print("Enter account holder:");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.print("Is there a initial deposit(y/n):");
        char response = sc.next().charAt(0);
        if (response == 'y') {
            System.out.print("Enter initial deposit value:");
            double initialDeposit = sc.nextDouble();
            user = new account(number, holder, initialDeposit);
        } else {
            user = new account(number, holder);
        }

        System.out.println(user);

        System.out.println("Enter a deposit value:");
        user.deposit(sc.nextDouble());

        System.out.print("Updated account data:");
        System.out.println(user);

        System.out.println("Enter a withdraw value:");
        user.withdraw(sc.nextDouble());

        System.out.print("Updated account data:");
        System.out.println(user);
        sc.close();
    }
}
