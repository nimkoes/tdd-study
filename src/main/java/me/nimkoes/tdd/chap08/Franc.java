package me.nimkoes.tdd.chap08;

public class Franc extends Money {

    public Franc(int amount) {
        this.amount = amount;
    }

    Money times(int multiplier) {
        return new Franc(amount * multiplier);
    }
}
