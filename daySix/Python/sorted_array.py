def new_array_length(array, newlength):
    new_array = [0] * newlength

    for count in range(min(newlength, len(array))):
        new_array[count] = array[count]

    return new_array


def print_array(array):

    print("[", end="")

    for count in range(len(array)):
    
        print(array[count], end="")

        if count != len(array) - 1:
        
            print(", ", end="")

    print("]")


def is_prime(number):

    if number <= 1:
    
        return False

    for count in range(2, number):
    
        if number % count == 0:
        
            return False

    return True


def sort_the_array(array):

    for count in range(len(array) - 1):
    
        for check in range(len(array) - 1 - count):
        
            if array[check] < array[check + 1]:
            
                temp = array[check]
                
                array[check] = array[check + 1]
                
                array[check + 1] = temp


def sorted_primes(array):

    temp = [0] * len(array)

    counter = 0

    for count in range(len(array)):
    
        if is_prime(array[count]):
        
            temp[counter] = array[count]
            
            counter += 1

    prime_numbers = new_array_length(temp, counter)

    sort_the_array(prime_numbers)

    return prime_numbers



