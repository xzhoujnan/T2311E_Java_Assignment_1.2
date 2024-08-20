import com.model.Person;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] bills = inputBills();
        int userBalance = inputWalletBalance();
        Person person = new Person(userBalance);
        int total = person.calcTotal(bills);
        System.out.println("You can" + (person.payMoney(total) ? "" : "'t") + " buy it");
    }

    public static int[] inputBills(){
        System.out.println("======Shopping program======");
        System.out.println("Input number of bills: ");
        Scanner sc = new Scanner(System.in);
        int total_bills = sc.nextInt();
        int[] bills = new int[total_bills];
        for (int i = 0; i < total_bills; i++) {
            System.out.println("Input value of bill " + i + ":");
            bills[i] = sc.nextInt();
        }
        return bills;
    }

    public static int inputWalletBalance(){
        System.out.println("Input wallet balance: ");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
}