public class Main {
    public static void main(String[] args) {
        int start_account = 750;
        int refill = 1500;

        int bonus;

        if (refill > 1000) {
            bonus = refill / 100;
        } else {
            bonus = 0;
        }

        int account = start_account + refill + bonus;

        System.out.println(bonus);
        System.out.println(account);
    }
}