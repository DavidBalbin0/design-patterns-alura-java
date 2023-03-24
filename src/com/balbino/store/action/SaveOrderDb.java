package com.balbino.store.action;

import com.balbino.store.order.Order;

public class SaveOrderDb implements IAction {

    public void execute(Order order){
        System.out.println("Salvando dados do pedido no db!");
    }
}
