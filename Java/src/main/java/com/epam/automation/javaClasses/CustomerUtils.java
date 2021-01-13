package com.epam.automation.javaClasses;

import java.util.Arrays;

class CustomerUtils {
    public static Customer[] createCustomers () {
        Customer[] customers = new Customer[5];
        customers[0] = new Customer("Alomov", "Aleksey", "Alekseevich", "Bogdanovicha 99, 84",
                "0123 3222 0202 5455", "BY23 SOMA 3234 МB00 0002 0200 0007");
        customers[1] = new Customer("Voronov", "Boris", "Igorevich", "Bulvar Shevchenko 55, 25",
                "1212 0225 3555 5454", "BY23 SOMA 3234 МB00 0002 0222 0007");
        customers[2] = new Customer("Zaslonov", "Valentin", "Mikhailovich", "Kulman 22, 55",
                "5858 9854 4854 5858", "BY23 SOMA 3234 МB00 0302 0220 0107");
        customers[3] = new Customer("Akunenko", "Grigoryi", "Vasilivich", "Horygei 54, 99",
                "5444 9594 4454 1524", "BY23 SOMA 3234 МB13 0442 0205 0567");
        customers[4] = new Customer("Chernov", "Oleg", "Ivanovich", "Sovetskaja 45, 55",
                "5455 8585 5554 5254", "BY23 SOMA 3234 МB13 4942 3245 1567");
        return customers;
    }

    public static void print(Customer[] customers) {
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }

    public static void sortByName(Customer[] customers) {
        Arrays.sort(customers, new ByNameComparator());
    }

    public static void printIfCardInRange(String from, String to, Customer[] customers) {
        for (Customer customer : customers) {
            if (customer.getCreditCardNumber().compareTo(from) >= 0 &&
                    customer.getCreditCardNumber().compareTo(to) <= 0)
                System.out.println(customer);
        }
    }

}