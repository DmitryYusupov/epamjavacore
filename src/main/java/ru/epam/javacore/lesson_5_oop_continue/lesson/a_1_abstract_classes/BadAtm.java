package ru.epam.javacore.lesson_5_oop_continue.lesson.a_1_abstract_classes;

public class BadAtm extends BaseAtm {
    private static final float RATE = 70f;

    @Override
    protected float getRate() {
        return RATE;
    }
    public String getMoney(int money) {
        incTransactionCount();

        System.out.println("Any complex logic");
        float result = money * (100 - RATE);

        if (cashWithCoins()) {
            System.out.println("Any complex logic");
            return "Coins " + result;
        } else {
            System.out.println("Any complex logic");
            return "Banknots " + result;
        }
    }



}
