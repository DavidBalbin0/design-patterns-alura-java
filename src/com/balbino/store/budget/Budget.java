package com.balbino.store.budget;

import com.balbino.store.discount.situation.Analysis;
import com.balbino.store.discount.situation.BudgetSituation;
import com.balbino.store.discount.situation.Finished;
import com.balbino.store.exception.DomainException;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Budget implements Budgetable{
    private BigDecimal value;
    private List<Budgetable> items;
    private BudgetSituation situation;

    public Budget() {
        this.value = BigDecimal.ZERO;
        this.items = new ArrayList<>();
        this.situation = new Analysis();
    }

    public void ExtraDiscountApply(){
        BigDecimal discountValue = this.situation.calculateExtraDiscountValue(this);
        this.value = this.value.subtract(discountValue);
    }


    public void approve(){
        this.situation.approve(this);
    }
    public void reproach(){
        this.situation.reproach(this);
    }
    public void finalize(){
        this.situation.finalize(this);
    }
    public BigDecimal getValue() {

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return value;
    }

    public int getItemAmount() {
        return items.size();
    }

    public BudgetSituation getSituation() {
        return situation;
    }

    public void setSituation(BudgetSituation situation) {
        this.situation = situation;
    }

    public boolean isFinished() {
        return situation instanceof Finished;
    }

    public void addItems(Budgetable item) {
        this.value = value.add(item.getValue());
        this.items.add(item);
    }
}
