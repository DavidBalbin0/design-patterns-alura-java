package com.balbino.store.order;

import com.balbino.store.action.IAction;
import com.balbino.store.action.SaveOrderDb;
import com.balbino.store.action.SendEmailOrder;
import com.balbino.store.budget.Budget;
import com.balbino.store.budget.ItemBudget;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public class GenerateOrderHandler {

    //observer
    private List<IAction> actions;

    public GenerateOrderHandler(List<IAction> actions) {
        this.actions = actions;
    }
    //contructor with dependencies injection
    //command handler

    //facade
    public void execute(GenerateOrder data){
        Budget budget = new Budget();
        budget.addItems(new ItemBudget(new BigDecimal("1000")));
        Order order = new Order(data.getClient(), LocalDateTime.now(), budget);

        actions.forEach(a -> a.execute(order));
    }
}
