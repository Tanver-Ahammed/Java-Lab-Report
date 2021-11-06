package com.shamimsir.lab5.prob3;

public class WeeklyEmployee extends ContractEmployee {
    private double numberOfWeeks, wagesPerWeek;

    public double calculateWages() {
        return (4 * getNumberOfWeeks() * getWagesPerWeek());
    }

    @Override
    public String getDesignation() {
        return super.getDesignation();
    }

    public double getNumberOfWeeks() {
        return numberOfWeeks;
    }

    public void setNumberOfWeeks(double numberOfWeeks) {
        this.numberOfWeeks = numberOfWeeks;
    }

    public double getWagesPerWeek() {
        return wagesPerWeek;
    }

    public void setWagesPerWeek(double wagesPerWeek) {
        this.wagesPerWeek = wagesPerWeek;
    }
}
