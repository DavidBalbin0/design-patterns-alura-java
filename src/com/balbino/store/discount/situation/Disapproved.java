package com.balbino.store.discount.situation;

import com.balbino.store.budget.Budget;

public class Disapproved extends BudgetSituation{

    @Override
    public void finalize(Budget budget) {
        budget.setSituation(new Finished());
    }
}
