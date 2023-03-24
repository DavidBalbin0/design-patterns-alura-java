package com.balbino.store.budget;

import com.balbino.store.exception.DomainException;
import com.balbino.store.http.HttpAdapter;

import java.net.MalformedURLException;
import java.util.Map;
import java.util.Objects;

public class BudgetRegistry {

    private HttpAdapter httpAdapter;

    public BudgetRegistry(HttpAdapter httpAdapter) {
        this.httpAdapter = httpAdapter;
    }

    public void registry(Budget budget) throws MalformedURLException {
        if(!budget.isFinished()) throw  new DomainException("Budget not finished");
        String url = "http://api.com";
        Map<String, Object> dados = Map.of(
                "value", budget.getValue(),
                "itemsAmout", budget.getItemAmount()
        );
        httpAdapter.post(url, dados);
    }
}
