package com.balbino.store.discount;

import com.balbino.store.budget.Budget;

import java.math.BigDecimal;

public class NoDiscount extends Discount{
    public NoDiscount() {
        super(null);
    }

    @Override
    protected BigDecimal calculation(Budget budget) {
        return BigDecimal.ZERO;
    }

    @Override
    protected boolean mustApply(Budget budget) {
        return true;
    }
}
