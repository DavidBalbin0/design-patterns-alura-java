package com.balbino.store.tax;

import com.balbino.store.budget.Budget;

import java.math.BigDecimal;

public class ISS extends Tax {

    public ISS(Tax other) {
        super(other);
    }

    @Override
    protected BigDecimal performCalculation(Budget budget) {
        return budget.getValue().multiply(new BigDecimal("0.1"));
    }

}
