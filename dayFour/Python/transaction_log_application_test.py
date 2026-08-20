from unittest import TestCase
	
from transaction_log_application import *


class transaction_log_application_Test(TestCase):

    def test_thatWhen_iDeposit_theBalanceIncrease(self):
    
        actual_balance = 1000
        
        expected_balance = 1000
        
        self.assertEqual(actual_balance, expected_balance)
        

    def testThatTheAmountWithdrdecreaseInThe_accountBalance(self):

        actual_balance = 1000
        
        expected_balance = 500
        
        self.assertEqual(actual_balance, expected_balance)
