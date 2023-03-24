package com.balbino.store.discount;

import com.balbino.store.budget.Budget;

import java.math.BigDecimal;

public class DiscontForBudgetWithMoreThan5Items extends Discount{
    public DiscontForBudgetWithMoreThan5Items(Discount proximo) {
        super(proximo);
    }

    @Override
    protected BigDecimal calculation(Budget budget) {
        return budget.getValue().multiply(new BigDecimal("0.1"));
    }

    @Override
    protected boolean mustApply(Budget budget) {
        return budget.getItemAmount() > 5;
    }
}
