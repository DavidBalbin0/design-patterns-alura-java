package com.balbino.store.action;

import com.balbino.store.order.Order;

public class SendEmailOrder implements IAction {

    public void execute(Order order){
        System.out.println("enviando email com dados do pedido!");
    }
}
