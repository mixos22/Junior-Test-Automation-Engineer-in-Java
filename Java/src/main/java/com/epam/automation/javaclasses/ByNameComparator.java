package com.epam.automation.javaclasses;

import java.util.Comparator;

public class ByNameComparator implements Comparator<Customer> {

    @Override
    public int compare(Customer left, Customer right) {
        if (!left.getSurname().equals(right.getSurname()))
            return left.getSurname().compareTo(right.getSurname());
        if (!left.getName().equals(right.getName()))
            return left.getName().compareTo(right.getName());
        return left.getMiddleName().compareTo(right.getMiddleName());
    }
}
