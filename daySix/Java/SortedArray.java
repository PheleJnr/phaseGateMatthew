import java.util.Arrays;

public class SortedArray{

    public static int[] newArrayLength(int[] array, int newlength){
    
        int[] newArray = new int[newlength];
        
        for (int count = 0; count < newlength && count < array.length; count++){
        
            newArray[count] = array[count];
               
        }
        return newArray;
    }
    
    
    public static void printArray(int[] array){
    
        System.out.print("[");
        
        for (int count = 0; count < array.length; count++){
        
            System.out.print(array[count]);
            
            if (count != array.length - 1){
            
                System.out.print(", ");
            }   
        
        }
        System.out.println("}");    
    
    }
    
    public static boolean isPrime(int number){
    
        if(number <= 1) {
        
		return false;
		
		}

		for(int count = 2; count < number; count++) {
		
			if(number % count == 0) {
			
				return false;
			}
		}
		return true;
	}
	
	
	
	public static void sortTheArray(int[] array){
		       
	    for(int count = 0; count < array.length-1; count++){
    
            for(int check = 0; check < (array.length-1) - count; check++){

                if(array[check] < array[check + 1]){

                    int temp = array[check];

                    array[check] = array[check + 1];

                    array[check + 1] = temp;
    
                 }


            }

        }
            
       
    }
    
    
    public static int[] sortedPrimes(int[] array){
    
        int[] temp = new int[array.length];
        
        int counter = 0;
        
        for(int count = 0; count < array.length; count++){
        
            if(isPrime(array[count])){
            
                temp[counter] = array[count];
                
                counter++;
            
            }
        
        
        }
    
        int[] primeNumbers = newArrayLength(temp, counter);
        
        sortTheArray(primeNumbers);
        
        
        return primeNumbers;
     
    }
    
    
    
    public static void main(String[] args){
    
    int[] array = {5, 9, 3, 6, 2};
    
    System.out.println(Arrays.toString(sortedPrimes(array)));
    
    
    }
    
    
    
    
    
    
    
    }
    
    
    
