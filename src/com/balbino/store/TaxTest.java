package com.balbino.store;

import com.balbino.store.budget.Budget;
import com.balbino.store.budget.ItemBudget;
import com.balbino.store.tax.ICMS;
import com.balbino.store.tax.ISS;
import com.balbino.store.tax.TaxCalculator;

import java.math.BigDecimal;

public class TaxTest {

    public static void main(String[] args) {
        Budget budget = new Budget();
        budget.addItems(new ItemBudget(new BigDecimal("1000")));
        TaxCalculator calculator = new TaxCalculator();
        System.out.println(calculator.calculate(budget, new ISS(new ICMS(null))));
    }
}
