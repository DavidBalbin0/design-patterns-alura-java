package com.balbino.store.discount;

import com.balbino.store.budget.Budget;

import java.math.BigDecimal;

public class DiscontForBudgetGreaterThan500 extends Discount{
    public DiscontForBudgetGreaterThan500(Discount proximo) {
        super(proximo);
    }

    @Override
    protected BigDecimal calculation(Budget budget) {
        return budget.getValue().multiply(new BigDecimal("0.05"));
    }

    @Override
    protected boolean mustApply(Budget budget) {
        return budget.getValue().compareTo(new BigDecimal("500")) > 0;
    }



}
