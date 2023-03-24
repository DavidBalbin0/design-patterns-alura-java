package com.balbino.store.discount.situation;

import com.balbino.store.budget.Budget;
import com.balbino.store.exception.DomainException;

import java.math.BigDecimal;

public abstract class BudgetSituation {

    public BigDecimal calculateExtraDiscountValue(Budget budget){
        return BigDecimal.ZERO;
    }

    public void approve(Budget budget){
        throw new DomainException("O orcamento nao podeser aprovado!");
    }
    public void reproach(Budget budget){
        throw new DomainException("O orcamento nao podeser aprovado!");
    }
    public void finalize(Budget budget){
        throw new DomainException("O orcamento nao podeser aprovado!");
    }

}
