package com.shamimsir.lab6.prob6;

public class NonHostler implements StudentFee {
    @Override
    public double getAmount(double amount) {
        return amount;
    }

    @Override
    public String getFirstName(String fName) {
        return fName;
    }

    @Override
    public String getLastName(String lName) {
        return lName;
    }

    @Override
    public String getAddress(String address) {
        return address;
    }

    @Override
    public String getContact(String contract) {
        return contract;
    }
}
