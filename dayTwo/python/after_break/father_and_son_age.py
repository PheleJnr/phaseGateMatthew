def calculate_years(father_age, son_age):

    years_past = son_age % father_age
    
    twice_age = son_age * 2
    
    difference_in_age = father_age - twice_age
    
    if (years_past + father_age == twice_age):
        
        print("The Father's age will be twice as old as the son's age ", twice_age, "years old")
        
    elif(father_age < twice_age):
        
        print("The Father's age will be twice as old as the son's age ", (difference_in_age * -1), "years old")
            
    else:
        
        print("The father's age was twice as old as the son's age ", (father_age - twice_age), " years old")
            
            

print(calculate_years(60, 40))      
            
      
