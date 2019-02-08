package com.lambdaschool;

public abstract class Money
{
    private int count;


    public Money(int dollar, int dime, int nickle, int penny)
    {
        this.count = 0;

    }

    public int getDollar()
    {
        return dollar;
    }

    public void setDollar(int dollar)
    {
        this.dollar = dollar;
    }

    public int getDime()
    {
        return dime;
    }

    public void setDime(int dime)
    {
        this.dime = dime;
    }

    public int getNickle()
    {
        return nickle;
    }

    public void setNickle(int nickle)
    {
        this.nickle = nickle;
    }

    public int getPenny()
    {
        return penny;
    }

    public void setPenny(int penny)
    {
        this.penny = penny;
    }

    @Override
    public String toString()
    {
        return "Money{" +
                "dollar=" + dollar +
                ", dime=" + dime +
                ", nickle=" + nickle +
                ", penny=" + penny +
                '}';
    }
}
