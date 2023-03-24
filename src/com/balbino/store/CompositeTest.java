package com.balbino.store;

import com.balbino.store.budget.Budget;
import com.balbino.store.budget.ItemBudget;
import com.balbino.store.budget.ProxyBudget;

import java.math.BigDecimal;

public class CompositeTest {

    public static void main(String[] args) {
        Budget old = new Budget();
        old.addItems(new ItemBudget(new BigDecimal(200)));
        old.reproach();

        Budget newBudget = new Budget();
        newBudget.addItems(new ItemBudget(new BigDecimal(500)));
        newBudget.addItems(old);
        //Pattern Proxy
        ProxyBudget proxyBudget = new ProxyBudget(newBudget);

        System.out.println(proxyBudget.getValue());
        System.out.println(proxyBudget.getValue());
    }
}
