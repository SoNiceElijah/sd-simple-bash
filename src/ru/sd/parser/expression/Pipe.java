package ru.sd.parser.expression;

import ru.sd.interpretator.Enviroment;

public class Pipe implements Expression {

    private Expression first;
    private Expression second;

    public Pipe(Expression fst, Expression snd) {
        first = fst;
        second = snd;
    }

    public String run(String stdin, Enviroment env) {
        String stdout = first.run(stdin, env);
        return second.run(stdout, env);
    }
    public void print() {
        System.out.println("=========");
        System.out.println("Pipe");
        first.print();
        System.out.println("-- then --");
        second.print();
        System.out.println("_________");
    }

}