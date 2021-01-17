package com.epam.automation.javaclasses;

import java.util.Objects;

class Customer {
    private int id;
    private static int latestID;
    private String address;
    private String name;
    private String surname;
    private String middleName;
    private String creditCardNumber;
    private String accountNumber;

    public Customer(String surname, String name, String middleName,
                    String address, String creditCardNumber, String accountNumber) {
        id = latestID++;
        this.name = name;
        this.surname = surname;
        this.middleName = middleName;
        this.address = address;
        this.creditCardNumber = creditCardNumber;
        this.accountNumber = accountNumber;
    }

    public Customer(String creditCardNumber) {
        id = latestID++;
        this.creditCardNumber = creditCardNumber;
    }

    public Customer(String creditCardNumber, String accountNumber) {
        id = latestID++;
        this.creditCardNumber = creditCardNumber;
        this.accountNumber = accountNumber;
    }

    public String toString() {
        return id + ": " + surname + " " + name + " " + middleName +
                ", " + address + ", " + "credit card number is " + creditCardNumber + ", account number is " + accountNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        name = surname;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setAddress(String address) {
        address = address;
    }

    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getAddress() {
        return address;
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return id == customer.id &&
                Objects.equals(address, customer.address) &&
                Objects.equals(name, customer.name) &&
                Objects.equals(surname, customer.surname) &&
                Objects.equals(middleName, customer.middleName) &&
                Objects.equals(creditCardNumber, customer.creditCardNumber) &&
                Objects.equals(accountNumber, customer.accountNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, address, name, surname, middleName, creditCardNumber, accountNumber);
    }
}