package com.balbino.store.budget;

import java.math.BigDecimal;

public class ItemBudget implements Budgetable {

    private BigDecimal value ;

    public ItemBudget(BigDecimal value) {
        this.value = value;
    }

    public BigDecimal getValue() {
        return value;
    }
}
