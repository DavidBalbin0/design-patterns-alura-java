package com.balbino.store;

import com.balbino.store.budget.Budget;
import com.balbino.store.budget.ItemBudget;
import com.balbino.store.discount.DiscountCalc;

import java.math.BigDecimal;

public class DiscountTest {
    public static void main(String[] args) {
        Budget first = new Budget();
        first.addItems(new ItemBudget(new BigDecimal("1000")));
        Budget second = new Budget();
        first.addItems(new ItemBudget(new BigDecimal("1000")));
        Budget third = new Budget();
        first.addItems(new ItemBudget(new BigDecimal("1000")));

        DiscountCalc calc = new DiscountCalc();
        System.out.println(calc.calc(first));
        System.out.println(calc.calc(second));
        System.out.println(calc.calc(third));
    }

}
