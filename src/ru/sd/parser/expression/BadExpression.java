package ru.sd.parser.expression;

import ru.sd.interpretator.Enviroment;

public class BadExpression implements Expression {
    private String reason;
    public BadExpression(String _reason) {
        reason = _reason;
    }
    public BadExpression() {
        reason = "Oops, smth broke...";
    }
    public String run(String stdin, Enviroment env) {
        return reason;
    }
    public void print() {
        System.out.println("=========");
        System.out.println(reason);
        System.out.println("_________");
    }
}
