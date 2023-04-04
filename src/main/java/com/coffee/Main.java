package com.coffee;

public class Main {
    public static void main(String[] args) {
        CoffeeOrderBoard board = new CoffeeOrderBoard();

        board.add("Viktor");
        board.add("Stepan");
        board.add("Sergii");
        board.add("Artem");
        board.add("Stark");

        board.draw();

        Order nextOrder = board.deliver();
        System.out.println("Delivering order #" + nextOrder.getNumber() + " for " + nextOrder.getName());

        board.draw();

        Order orderToDeliver = board.deliver(3);
        if (orderToDeliver != null) {
            System.out.println("Delivering order #" + orderToDeliver.getNumber() + " for " + orderToDeliver.getName());
        } else {
            System.out.println("Order not found!");
        }

        board.draw();
    }
}
