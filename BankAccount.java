package ORIENTAÇÃO_À_OBJETOS.ACCOUNT_BANK;

import java.util.Locale;
import java.util.Scanner;
import ORIENTAÇÃO_À_OBJETOS.ACCOUNT_BANK.AccountInfos;

public class BankAccount {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        AccountInfos accountInfos = new AccountInfos();

        System.out.print("Enter the account number: ");
        accountInfos.setAccountNumber(sc.nextInt());
        System.out.print("Enter the account holder: ");
        accountInfos.setName(sc.next());
        System.out.print("Is there any deposit initial (y/n)? ");
        accountInfos.setDeposit(sc.next());

        if(accountInfos.getDeposit().matches("y")){
            System.out.print("Enter initial deposit value: ");
            accountInfos.setInitialDeposit(sc.nextDouble());
        }

        System.out.println("Data account:");
        System.out.print("Account " + accountInfos.getAccountNumber()
                + ", " + "Holder: " + accountInfos.getName() + ", " +
               "Balance $: " + accountInfos.getBalance() + "\n");

        System.out.print("Enter a deposit value: ");
        accountInfos.valueDeposit(sc.nextDouble());

        System.out.println("Updated account data:");
        System.out.println("Data account:");
        System.out.print("Account " + accountInfos.getAccountNumber()
                + ", " + "Holder: " + accountInfos.getName() + ", " +
                "Balance $: " + accountInfos.getBalance() + "\n");

        System.out.print("Enter a withdraw value: ");
        accountInfos.withdraw(sc.nextDouble());

        System.out.println("Data account:");
        System.out.print("Account " + accountInfos.getAccountNumber()
                + ", " + "Holder: " + accountInfos.getName() + ", " +
                "Balance $: " + accountInfos.getBalance());

        sc.close();

    }
}
