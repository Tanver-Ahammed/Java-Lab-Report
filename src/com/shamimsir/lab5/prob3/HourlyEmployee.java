package com.shamimsir.lab5.prob3;

public class HourlyEmployee extends ContractEmployee {
    private double numberOfHours, wagesPerHour;

    public double calculateWages() {
        return (30 * getNumberOfHours() * getWagesPerHour());
    }

    @Override
    public String getDesignation() {
        return super.getDesignation();
    }

    public double getNumberOfHours() {
        return numberOfHours;
    }

    public void setNumberOfHours(double numberOfHours) {
        this.numberOfHours = numberOfHours;
    }

    public double getWagesPerHour() {
        return wagesPerHour;
    }

    public void setWagesPerHour(double wagesPerHour) {
        this.wagesPerHour = wagesPerHour;
    }

}
