package com.balbino.store.order;

import com.balbino.store.budget.Budget;

import java.time.LocalDateTime;

public class Order {

    private String client;
    private LocalDateTime time;
    private Budget budget;

    public Order(String client, LocalDateTime time, Budget budget) {
        this.client = client;
        this.time = time;
        this.budget = budget;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public Budget getBudget() {
        return budget;
    }

    public void setBudget(Budget budget) {
        this.budget = budget;
    }
}
