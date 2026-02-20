package ru.chepovetskiy.fraction;

// Задание 1
public class CachedFraction extends Fraction {
    private Double cachedValue;

    public CachedFraction(int numerator, int denominator) {
        super(numerator, denominator);
    }

    @Override
    public double getDecimalValue() {
        if (cachedValue == null) {
            cachedValue = super.getDecimalValue();
        }
        return cachedValue;
    }

    @Override
    public void setNumerator(int numerator) {
        super.setNumerator(numerator);
        cachedValue = null;
    }

    @Override
    public void setDenominator(int denominator) {
        super.setDenominator(denominator);
        cachedValue = null;
    }
}