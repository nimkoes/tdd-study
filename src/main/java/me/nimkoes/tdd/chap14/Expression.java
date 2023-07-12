package me.nimkoes.tdd.chap14;

public interface Expression {
    Money reduce(Bank bank, String to);
}
