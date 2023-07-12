package me.nimkoes.tdd.chap01;

public class Dollar {
    int amount;

    public Dollar(int amount) {
        this.amount = amount;
    }

    void times(int multiplier) {
        amount *= multiplier;
    }
}
