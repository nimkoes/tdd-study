package me.nimkoes.tdd.chap10;

public class Dollar extends Money {

    public Dollar(int amount, String currency) {
        super(amount, currency);
    }

    Money times(int multiplier) {
        return new Money(amount * multiplier, currency);
    }

}
