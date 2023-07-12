package me.nimkoes.tdd.chap14;

public class Bank {
    Money reduce(Expression source, String to) {
        return source.reduce(to);
    }
}
