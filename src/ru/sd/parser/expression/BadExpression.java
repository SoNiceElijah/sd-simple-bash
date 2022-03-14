package ru.sd.parser.expression;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;

import ru.sd.interpretator.Enviroment;

public class BadExpression implements Expression {
    private String reason;
    public BadExpression(String _reason) {
        reason = _reason;
    }
    public BadExpression() {
        reason = "Oops, smth broke...";
    }
    public void run(InputStream in, OutputStream out, Enviroment env) {
        new PrintStream(out).println(reason);
    }
    public void print() {
        System.out.println("=========");
        System.out.println(reason);
        System.out.println("_________");
    }
}
