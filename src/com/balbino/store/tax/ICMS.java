package com.balbino.store.tax;

import com.balbino.store.budget.Budget;

import java.math.BigDecimal;

public class ICMS extends Tax {

    public ICMS(Tax other) {
        super(other);
    }

    @Override
    protected BigDecimal performCalculation(Budget budget) {
        return budget.getValue().multiply(new BigDecimal("0.06"));
    }

}
