package com.balbino.store.action;

import com.balbino.store.order.Order;

public interface IAction {

    public void execute(Order order);
}
