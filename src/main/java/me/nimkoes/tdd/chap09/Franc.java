package me.nimkoes.tdd.chap09;

public class Franc extends Money {

    public Franc(int amount, String currency) {
        super(amount, currency);
    }

    Money times(int multiplier) {
        return Money.franc(amount * multiplier);
    }
}
