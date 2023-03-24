package com.balbino.store;

import com.balbino.store.budget.Budget;
import com.balbino.store.budget.BudgetRegistry;
import com.balbino.store.budget.ItemBudget;
import com.balbino.store.http.JavaHttpClient;

import java.math.BigDecimal;
import java.net.MalformedURLException;

public class AdapterTest {
// Adapter Patterns
    public static void main(String[] args) throws MalformedURLException {
        Budget budget = new Budget();
        budget.addItems(new ItemBudget(new BigDecimal("1000")));
        budget.approve();
        budget.finalize();
        BudgetRegistry registry = new BudgetRegistry(new JavaHttpClient());
        registry.registry(budget);
    }
}
