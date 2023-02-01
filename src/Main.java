public class Main {
    public static void main(String[] args) {
        int account = 100;
        int depositAmount = 100;

        int bonus = 1000;
        if (depositAmount > bonus) {
            int finalAccount = (account + depositAmount + depositAmount / 100);
            System.out.println("Пополнение счета на сумму:" + depositAmount);
            System.out.println("Баланс:" + finalAccount);
        } else {
            int finalAccount = (account + depositAmount);
            System.out.println("Пополнение счета на сумму:" + depositAmount);
            System.out.println("Баланс:" + finalAccount);
        }


    }
}