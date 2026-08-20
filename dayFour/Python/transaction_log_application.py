
def add_deposited_amount(amount):

    balance += amount


    return balance
    
    
    
    
def deduct_withdrawal_amount(amount):

    balance = account_balance(amount)

    balance = balance - amount
    
    
    return balance
    
    
    
   




def deposit(amount, account_balance, transactions):
   
    account_balance = add_deposited_amount(amount)
    
    
    return account_balance


def withdraw(amount, account_balance, transactions):

  
    if amount > account_balance:
    
       
        
    else:
    
        account_balance -= amount
        
        
        
    return account_balance






