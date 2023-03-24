package com.balbino.store.tax;

import com.balbino.store.budget.Budget;

import java.math.BigDecimal;

public class TaxCalculator {
    // strategy
    public BigDecimal calculate(Budget budget, Tax tax ){
        return tax.calc(budget);
    }
}
