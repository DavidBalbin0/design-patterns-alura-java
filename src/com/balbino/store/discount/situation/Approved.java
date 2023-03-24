package com.balbino.store.discount.situation;

import com.balbino.store.budget.Budget;

import java.math.BigDecimal;

public class Approved extends BudgetSituation{

    @Override
    public BigDecimal calculateExtraDiscountValue(Budget budget) {
        return budget.getValue().multiply(new BigDecimal("0.02"));
    }

    @Override
    public void finalize(Budget budget) {
        budget.setSituation(new Finished());
    }
}
