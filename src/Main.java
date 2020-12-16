public class Main {
    public static void main(String[] args) {
        int transfer = 1_101;
        int balance = 100;
        int bonus;
        if (transfer > 1_000) {
            bonus = transfer / 100 + transfer + balance;
        } else {
            bonus = transfer + balance;
        }
        System.out.println(bonus);
    }
}
