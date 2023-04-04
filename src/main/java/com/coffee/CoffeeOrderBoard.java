package com.coffee;

import java.util.ArrayList;
import java.util.List;

public class CoffeeOrderBoard {
    private List<Order> orders;

    public CoffeeOrderBoard() {
        this.orders = new ArrayList<>();
    }
    public void add(String name) {
        int number = 1;
        if (!orders.isEmpty()) {
            number = orders.get(orders.size() - 1).getNumber() + 1;
        }
        Order order = new Order(number, name);
        orders.add(order);
    }
    public Order deliver() {
        if (orders.isEmpty()) {
            return null;
        }
        Order order = orders.get(0);
        orders.remove(0);
        return order;
    }
    public Order deliver(int number) {
        Order orderToDeliver = null;
        int indexToDeliver = -1;
        for (int i = 0; i < orders.size(); i++) {
            Order order = orders.get(i);
            if (order.getNumber() == number) {
                orderToDeliver = order;
                indexToDeliver = i;
                break;
            }
            if (order.getNumber() < number) {
                orderToDeliver = order;
                indexToDeliver = i;
            }
        }
        if (orderToDeliver != null) {
            orders.remove(indexToDeliver);
        }
        return orderToDeliver;
    }
    public void draw() {
        System.out.println("=============");
        System.out.println("Num | Name");
        for (Order order : orders) {
            System.out.println(order.getNumber() + " | " + order.getName());
        }
    }
}

