def replace_negative_with_zeros(array):

    new_array = [0] * len(array)

    for count in range(len(array)):
    
        if array[count] < 0:
        
            new_array[count] = 0
            
        else:
        
            new_array[count] = array[count]
            

    return new_array



    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
