package com.lambdaschool;

public class Dollar
{
    private double value;

    public Dollar(double value)
    {
        this.value = 1.00;
    }

    public double getValue()
    {
        return value;
    }

    public void setValue(double value)
    {
        this.value = 1.00;
    }

    @Override
    public String toString()
    {
        return "Dollar{" +
                "value=" + value +
                '}';
    }
}

