package com.balbino.store.discount;

import com.balbino.store.budget.Budget;

import java.math.BigDecimal;

public abstract class Discount {

    protected Discount next;

    public Discount(Discount proximo) {
        this.next = proximo;
    }

// Template method
    public BigDecimal calculate(Budget budget){
        if(mustApply(budget)){
            return calculation(budget);
        }
        return next.calculate(budget);
    }

    protected abstract BigDecimal calculation(Budget budget);
    protected abstract boolean mustApply(Budget budget);


}
