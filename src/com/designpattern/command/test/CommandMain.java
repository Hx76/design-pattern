package com.designpattern.command.test;

import com.designpattern.command.Broker;
import com.designpattern.command.Stock;
import com.designpattern.command.impl.BuyStock;
import com.designpattern.command.impl.SellStock;

public class CommandMain {
    public static void main(String[] args) {
        Stock abcStock = new Stock();

        BuyStock buyStockOrder = new BuyStock(abcStock);
        SellStock sellStockOrder = new SellStock(abcStock);

        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);

        broker.placeOrders();
    }
}
