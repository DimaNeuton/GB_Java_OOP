package LSP;

import java.math.BigDecimal;

public class DepositAccount extends Account {
    @Override
    public BigDecimal balance(String numberAccount) {
        return super.balance(numberAccount);
    }

    @Override
    public void retFill(String numberAccount, BigDecimal sum) {
        super.retFill(numberAccount, sum);
    }
}
