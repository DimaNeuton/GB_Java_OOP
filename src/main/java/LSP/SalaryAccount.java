package LSP;

import java.math.BigDecimal;

public class SalaryAccount extends Account{
    @Override
    public BigDecimal balance(String numberAccount) {
        return super.balance(numberAccount);
    }

    @Override
    public void retFill(String numberAccount, BigDecimal sum) {
        super.retFill(numberAccount, sum);
    }
    public void payment(String numberAccount, BigDecimal sum) {
        //
    }
}
