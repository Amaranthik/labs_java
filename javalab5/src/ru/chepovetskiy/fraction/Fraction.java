package ru.chepovetskiy.fraction;

import java.util.Objects;

// Задание 1
public class Fraction implements FractionInterface {
    protected int numerator;
    protected int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        setDenominator(denominator);
    }

    @Override
    public double getDecimalValue() {
        return (double) numerator / denominator;
    }

    @Override
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    @Override
    public void setDenominator(int denominator) {
        if (denominator <= 0) {
            throw new IllegalArgumentException("Знаменатель должен быть положительным");
        }
        this.denominator = denominator;
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fraction fraction = (Fraction) o;
        return numerator == fraction.numerator && denominator == fraction.denominator;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numerator, denominator);
    }
}