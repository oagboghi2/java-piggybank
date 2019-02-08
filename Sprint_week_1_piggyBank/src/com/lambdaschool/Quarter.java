package com.lambdaschool;

public class Quarter
{
    private double value;

    public Dime(int value)
    {
        this.value = 0.25;
    }

    public double getValue()
    {
        return value;
    }

    public void setValue(double value)
    {
        this.value = value;
    }

    @Override
    public String toString()
    {
        return "Quarter{" +
                "value=" + value +
                '}';
    }
}
