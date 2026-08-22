def moving_zeros_to_the_end(array):

    new_array = [0] * len(array)

    index = 0

    for count in range(len(array)):
    
        if array[count] != 0:
        
            new_array[index] = array[count]
            
            index += 1

    while index < len(new_array):
    
        new_array[index] = 0
        
        index += 1

    return new_array



