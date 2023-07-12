package me.nimkoes.tdd.chap16;

public interface Expression {
    Money reduce(Bank bank, String to);

    Expression plus(Expression addend);
}
