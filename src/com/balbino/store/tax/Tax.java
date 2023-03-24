package com.balbino.store.tax;

import com.balbino.store.budget.Budget;

import java.math.BigDecimal;

public abstract class Tax {
// Decorator- composition
    private Tax other;

    public Tax(Tax other) {
        this.other = other;
    }

    protected abstract BigDecimal performCalculation(Budget budget);

    public BigDecimal calc(Budget budget){
        BigDecimal taxValue = performCalculation(budget);
        BigDecimal valueOtherTax = BigDecimal.ZERO;
        if (other != null){
            valueOtherTax = other.performCalculation(budget);
        }
        return taxValue.add(valueOtherTax);
    }


}
