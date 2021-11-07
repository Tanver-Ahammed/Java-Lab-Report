package com.shamimsir.lab6.prob2;

public class HourlyEmployee extends Employee {
    @Override
    double getAmount(double amountPerUnit, double totalUnit) {
        return amountPerUnit * totalUnit;
    }
}
