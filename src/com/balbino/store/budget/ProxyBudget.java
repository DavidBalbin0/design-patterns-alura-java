package com.balbino.store.budget;

import java.math.BigDecimal;

public class ProxyBudget extends Budget{
    private BigDecimal valor;
    private Budget budget;

    public ProxyBudget( Budget budget) {
        this.budget = budget;
    }
    //Pattern Proxy
    @Override
    public BigDecimal getValue() {
        if(valor == null){
            this.valor = budget.getValue();
        }
        return this.valor;
    }
}
