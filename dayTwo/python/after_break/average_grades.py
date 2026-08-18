def get_average_grades(score_one, score_two, score_three):

    sum = score_one + score_two + score_three
    
    average_scores = sum / 3
    
    
    if (average_scores > 100 or average_scores <= 0): 
            
        return("invalid")
            
    if (average_scores >= 90 and average_scores <= 100):
            
        return("A")
                
    elif (average_scores >= 80 and average_scores <= 89):
            
        return("B")
                
    elif (average_scores >= 70 and average_scores <= 79):
                
        return("C")
                
    elif (average_scores >= 60 and average_scores <= 69):
            
        return("D")
                
    else:
            
        return("F")
        
        
    return 0
    
    
print(get_average_grades(70, 50, 60))
        
 
