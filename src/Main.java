public class Main {
    public static void main(String[] args) {
        int sum_on_account = 100;
        int sum_add = 2000;
        int bonus;
        if (sum_add > 1000) {
            bonus = sum_add / 100;
        } else {
            bonus = 0;
        }
        int sum_total = sum_on_account + sum_add + bonus;

        System.out.println("Итоговая сумма:");
        System.out.println(sum_total);
        System.out.println("Бонусные рубли:");
        System.out.println(bonus);
    }
}
