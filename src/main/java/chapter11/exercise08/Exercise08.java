package chapter11.exercise08;

public class Exercise08 {

    public static void main(String[] args) {
        PersonalAccount account = new PersonalAccount(1122, 1000, "George");
        account.deposit(30);
        account.deposit(40);
        account.deposit(50);
        account.withdraw(5);
        account.withdraw(4);
        account.withdraw(2);

        System.out.println(account);
    }
}
