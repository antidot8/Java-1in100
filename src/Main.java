public class Main {
    public static void main(String[] args) {
        long balance = 200; // баланс счета
        long transfer = 500; // сумма перевода
        int bonusPercent = 1; // бонус
        long bonus;
        if (transfer > 1000) {
            bonus = transfer * bonusPercent / 100;
        } else {
            bonus = 0;
        }
        long total = balance + transfer + bonus;
        System.out.println(total);
    }
}
