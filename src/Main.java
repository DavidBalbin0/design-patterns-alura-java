import com.balbino.store.action.SaveOrderDb;
import com.balbino.store.action.SendEmailOrder;
import com.balbino.store.budget.Budget;
import com.balbino.store.order.GenerateOrder;
import com.balbino.store.order.GenerateOrderHandler;
import com.balbino.store.order.Order;
import com.balbino.store.tax.ISS;
import com.balbino.store.tax.TaxCalculator;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String client = "David";
        BigDecimal budgetValue = new BigDecimal("300");
        int itemsAmount = Integer.parseInt("2");

        GenerateOrder order = new GenerateOrder(client, budgetValue, itemsAmount );
        GenerateOrderHandler handler = new GenerateOrderHandler(Arrays.asList(new SaveOrderDb(), new SendEmailOrder()));
        handler.execute(order);

//        Budget budget = new Budget(new BigDecimal("100"), 6);
//        String client = "David";
//        LocalDateTime time = LocalDateTime.now();
//
//        Order order = new Order(client, time, budget);
//
//        TaxCalculator calc = new TaxCalculator();
//        System.out.println(calc.calculate(budget, new ISS()));
    }
}