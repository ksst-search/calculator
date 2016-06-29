package io.github.ksst_search.calculator;

public class CalculatorModel {
    private final long id;
    private final String operation;
    private final double a;
    private final double b;

    public CalculatorModel(long id, String operation, double a, double b)
    {
        this.id = id;
        this.operation = operation;
        this.a = a;
        this.b = b;
    }

    public long getId() {
        return id;
    }

    public String getOperation() {
        return operation;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }
}