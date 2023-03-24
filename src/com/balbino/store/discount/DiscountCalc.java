package com.balbino.store.discount;

import com.balbino.store.budget.Budget;

import java.math.BigDecimal;

public class DiscountCalc {

    // chain of responsability
    public BigDecimal calc(Budget budget){
        Discount discount = new DiscontForBudgetGreaterThan500(
                new DiscontForBudgetWithMoreThan5Items(new NoDiscount()));

        return discount.calculate(budget);
    }
}
