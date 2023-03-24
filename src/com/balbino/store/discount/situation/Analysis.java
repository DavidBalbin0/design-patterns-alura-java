package com.balbino.store.discount.situation;

import com.balbino.store.budget.Budget;

public class Analysis extends BudgetSituation{

    @Override
    public void approve(Budget budget) {
        budget.setSituation(new Approved());
    }

    @Override
    public void reproach(Budget budget) {
        budget.setSituation(new Disapproved());
    }
}
