import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

    public class TransactionLogApplicationTest{
    
  
    
    @Test
    public void testThatTheAmountDepositedIncreasedInThe_accountBalance(){
    
        double amount = 1000;
        
        double expectedbalance = TransactionLogApplication.accountBalance(amount);
        
        double actualbalance = 0;
        
        assertEquals(expectedbalance, actualbalance);
    
    
    
    
    }
    
    
    
}
