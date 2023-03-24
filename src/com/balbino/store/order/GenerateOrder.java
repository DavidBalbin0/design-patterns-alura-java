package com.balbino.store.order;

import com.balbino.store.budget.Budget;
import com.balbino.store.budget.ItemBudget;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class GenerateOrder {
    private String client;
    private BigDecimal BudgetValue;
    private int ItemsAmount;

    public GenerateOrder(String client, BigDecimal budgetValue, int itemsAmount) {
        this.client = client;
        BudgetValue = budgetValue;
        ItemsAmount = itemsAmount;
    }

    public void execute(){
        Budget budget = new Budget();
        budget.addItems(new ItemBudget(this.BudgetValue));
        String client = "David";
        LocalDateTime time = LocalDateTime.now();

        Order order = new Order(client, time, budget);

    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public BigDecimal getBudgetValue() {
        return BudgetValue;
    }

    public void setBudgetValue(BigDecimal budgetValue) {
        BudgetValue = budgetValue;
    }

    public int getItemsAmount() {
        return ItemsAmount;
    }

    public void setItemsAmount(int itemsAmount) {
        ItemsAmount = itemsAmount;
    }
}
